/*
 * UseResource2.java
 */

/**
 * Resourceクラスです。
 */
final class Resource {
        /**
         * リソースの使用状態
         */
        public boolean isUse;

        /**
         * リソースID
         */
        String id;

        /**
         * コンストラクタです。
         * @param id リソースID
         */
        Resource(String id) {
                this.isUse = false;
                this.id = id;
        }

        /**
         * リソースを使用します。
         * @param name ユーザ名
         */
        void use(String name) {
                try {
                        System.out.println(id + ": " + name);
                        double d = Math.random() * 5000 + 5000;
                        Thread.sleep((long)d);
                }
                catch(InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

/**
 * Mediatorクラスです。
 */
final class Mediator {
        /**
         * リソース数
         */
        private static final int RESOURCES_MAX = 3;

        /**
         * 使用中のリソース数
         */
        int resourcesNum;

        /**
         * リソース
         */
        Resource[] r = new Resource[RESOURCES_MAX];

        /**
         * コンストラクタです。
         */
        Mediator() {
                resourcesNum = 0;
                for(int i = 0; i < RESOURCES_MAX; ++i) {
                        r[i] = new Resource("Resource" + i);
                }
        }

        /**
         * 未使用のリソースのインスタンスを返しします。
         * @return 未使用のリソースのインスタンス
         */
        synchronized Resource get() {
                Resource resource = null;
                try {
                        while (resourcesNum == RESOURCES_MAX) {
                                wait();
                        }
                        for(int i = 0; i < RESOURCES_MAX; ++i) {
                                if (!r[i].isUse) {
                                        r[i].isUse = true;
                                        resource = r[i];
                                        break;
                                }
                        }    
                }
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
                ++resourcesNum;
                notifyAll();
                return resource;
        }

        /**
         * 使用したリソースを回収します。
         * @param r リソースのインスタンス
         */
        synchronized void ret(Resource r) {
                r.isUse = false;
                --resourcesNum;
                notifyAll();
        }
}

/**
 * Userクラスです。
 */
final class User extends Thread{
        /**
         * ユーザ名
         */
        String name;

        /**
         * 調整役
         */
        Mediator mediator;
        
        /**
         * コンストラクタです。
         * @param name ユーザ名
         * @param mediator 調整役のインスタンス
         */
        User(String name, Mediator mediator) {
                this.name = name;
                this.mediator = mediator;
        }

        /**
         * スレッドを実行します。
         */
        public void run() {
                try {
                        while(true) {
                                Resource r = mediator.get();
                                r.use(this.name);
                                mediator.ret(r);
                                Thread.sleep(3000);
                        }
                }
                catch (InterruptedException e) {
                        e.printStackTrace();                   
                }
        }
}

/**
 * UseResource2クラスです。
 */
public class UseResource2{
        /**
         * ユーザ数
         */
        private static final int USER_NUM = 5;

        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Mediator m = new Mediator();
                for(int i = 0; i < USER_NUM; ++i) {
                        new User("User" + i, m).start();
                }
        }
}


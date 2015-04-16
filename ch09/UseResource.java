/*
 * UseResource.java
 */

/**
 * Resourceクラスです。
 */
final class Resource {
        /**
         * リソースを使用します。
         */
        void use() {
                try {
                        double l = Math.random() * 5000 + 5000;
                        System.out.println(l);
                        Thread.sleep((long)l); 
                }
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

/**
 * Mediatorクラスです。
 */
final class Mediator {
        /**
         * リソース
         */
        Resource resource;

        /**
         * コンストラクタです。
         * @param resource リソース
         */
        Mediator(Resource resource) {
                this.resource = resource;
        }

        /**
         * リソースへアクセスします。
         * @param name ユーザ名
         */
        synchronized void require(String name) {
                System.out.print(name + ": ");
                this.resource.use();
        }
}

/**
 * Userクラスです。
 */
final class User extends Thread {
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
         * @param mediator 調整役
         */
        User(String name, Mediator mediator) {
                this.name = name;
                this.mediator = mediator; 
        }

        /**
         * リソースへを調停役に要求します
         */
        public void run() {
                try {
                        while(true) {
                                this.mediator.require(this.name);             
                                Thread.sleep(3000);
                        }
                }
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

/**
 * UseResourceクラスです。
 */
public class UseResource {
        /**
         * ユーザ数
         */
        private static final int USER_NUM = 3;

        /**
         * mainクラスです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Resource resource = new Resource();
                Mediator mediator = new Mediator(resource);
                User[] user = new User[USER_NUM];
                for(int i = 0; i < USER_NUM; ++i) {
                        user[i] = new User("User" + i, mediator);
                        user[i].start();
                }
        }
}

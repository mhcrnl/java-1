/*
 * Grasshoppers.java
 */

/**
 * Grasshopperクラスです。
 */
final class Grasshopper extends Thread {
        /**
         * バッタの名前
         */
        private String name;

        /**
         * バッタの現在の位置
         */
        private double position;

        /**
         * コンストラクタです。
         * @param name バッタの名前
         */
        Grasshopper(String name) {
                this.name = name;
                this.position = Math.random();
        }

        /**
         * スレッドを実行します。
         */
        public void run() {
                while(true) {
                        try {
                                this.position = Math.random();
                                System.out.println(this.name + ": " + this.position);                
                                Thread.sleep((int)((Math.random() * 10 + 2) * 1000));
                        }
                        catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                }
        }
}

/**
 * Grasshoppersクラスです。
 */
public class Grasshoppers {
        /**
         * バッタの数
         */
        private static final int GRASSHOPPER_NUM = 5;

        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Grasshopper[] g = new Grasshopper[GRASSHOPPER_NUM];        
                for(int i = 0; i < GRASSHOPPER_NUM; ++i) {
                        g[i] = new Grasshopper("Grasshopper" + i);
                        g[i].start();
                }
        }
}

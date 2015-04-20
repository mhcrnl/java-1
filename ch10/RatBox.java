/*
 * RatBox.java
 */

/**
 * RatManagerクラスです。
 */
final class RatManager {
        /**
         * 箱の中に入れるネズミの最大数
         */
        private static final int MAX_RAT = 4;

        /**
         * 現在箱に入っているネズミの数
         */
        private int currentRat;

        /**
         * コンストラクタです。
         */
        RatManager() {
                this.currentRat = 0;
        }

        /**
         * ネズミが箱の中に入ります。
         */
        synchronized void in() {
                try {
                        while(this.currentRat == MAX_RAT) {
                                wait();
                        }
                        ++this.currentRat;
                        System.out.println("in: " + this.currentRat);
                        notifyAll();
                }
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }

        /**
         * ネズミが箱の中から出ます。
         */
        synchronized void out() {
                --this.currentRat;
                System.out.println("out: " + this.currentRat);
                notifyAll();
        }
}

/**
 * Ratクラスです。
 */
final class Rat extends Thread {
        /**
         * ネズミの管理役
         */
        RatManager rm;

        /**
         * コンストラクタです。
         * @param rm ネズミの管理役
         */
        Rat(RatManager rm) {
                this.rm = rm;
        }

        /**
         * スレッドを実行します。
         */
        public void run() {
                try {
                        while(true) {
                                Thread.sleep((int)(Math.random() * 10000 + 10000));
                                rm.in();
                                Thread.sleep((int)(Math.random() * 3000 + 5000));
                                rm.out();
                        }
                }
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

/**
 * RatBoxクラスです。
 */
public class RatBox {
        /**
         * ネズミの数
         */
        private static final int RAT_NUM = 10;

        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                RatManager rm = new RatManager();
                Rat[] r = new Rat[RAT_NUM];
                for(int i = 0; i < RAT_NUM; ++i) {
                        r[i] = new Rat(rm);
                        r[i].start();
                }
        }
}

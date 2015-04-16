/*
 * FiveThreads.java
 */

/**
 * ThreadXクラスです。
 */
final class ThreadX extends Thread {
        /**
         * スレッドの実行内容です。
         */
        public void run() {
                try {
                        for(int i = 0; i < 10; ++i) {
                                System.out.println("x");
                                double l = Math.random() * 500 + 300;
                                Thread.sleep((long)l);
                        }
                }
                catch(InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

/**
 * FiveThreadsクラスです。
 */
public class FiveThreads {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                ThreadX t1 = new ThreadX();
                ThreadX t2 = new ThreadX();
                ThreadX t3 = new ThreadX();
                ThreadX t4 = new ThreadX();
                ThreadX t5 = new ThreadX();
                t1.start();
                t2.start();
                t3.start();
                t4.start();
                t5.start();
                try {
                        t1.join();
                        t2.join();
                        t3.join();
                        t4.join();
                        t5.join();
                }
                catch(InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

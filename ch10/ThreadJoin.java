/*
 * ThreadJoin.java
 */

/**
 * Aクラスです。
 */
final class A extends Thread {
        /**
         * スレッドを実行します。
         */
        public void run() {
                try {
                        System.out.println("ThreadA Start");
                        Thread.sleep((int)(Math.random() * 20000 + 10000));
                        System.out.println("ThreadA End");
                }
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

/**
 * Bクラスです。
 */
final class B extends Thread {
        /**
         * スレッドを実行します。
         */
        public void run() {
                try {
                        System.out.println("ThreadB Start");
                        Thread.sleep((int)(Math.random() * 20000 + 10000));
                        System.out.println("ThreadB End");
                }
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

/**
 * ThreadJoinクラスです。
 */
public class ThreadJoin {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                try {
                        A A1 = new A();
                        A A2 = new A();
                        A A3 = new A();
                        A1.start();
                        A2.start();
                        A3.start();
                        A1.join();
                        A2.join();
                        A3.join();

                        B B1 = new B();
                        B B2 = new B();
                        B1.start();
                        B2.start();
                        B1.join();
                        B2.join();
                }
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

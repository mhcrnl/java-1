/*
 * ThreadDemo.java
 */

/**
 * ThreadAクラスです。
 */
final class ThreadA extends Thread {
        /**
         * スレッドを実行します。
         */
        public void run() {
                try {
                        while(true) {
                                Thread.sleep(1000);
                                System.out.println("A");
                        }
                }
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

/**
 * ThreadBクラスです。
 */
final class ThreadB extends Thread {
        /**
         * スレッドを実行します。
         */
        public void run() {
                try {
                        while(true) {
                                Thread.sleep(3000);
                                System.out.println("B");
                        }
                }
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

/**
 * ThreadDemoクラスです。
 */
public class ThreadDemo {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                ThreadA ta = new ThreadA();
                ThreadB tb = new ThreadB();
                ta.start();
                tb.start();
        }
}

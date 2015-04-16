/*
 * RunnableDemo.java
 */

/**
 * RunnableAクラスです。
 */
final class RunnableA implements Runnable {
        /**
         * スレッドの実行内容です。
         */
        public void run() {
                try {
                        while(true) {
                                Thread.sleep(1000);
                                System.out.println("A");
                        }
                }
                catch(InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

/**
 * RunnableBクラスです。
 */
final class RunnableB implements Runnable {
        /**
         * スレッドの実行内容です。
         */
        public void run() {
                try {
                        while(true) {
                                Thread.sleep(3000);
                                System.out.println("B");
                        }
                }
                catch(InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

/**
 * RunnableDemoクラスです。
 */
public class RunnableDemo {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                RunnableA ra = new RunnableA();
                RunnableB rb = new RunnableB();
                Thread ta = new Thread(ra);
                Thread tb = new Thread(rb);
                ta.start();
                tb.start();
        }
}

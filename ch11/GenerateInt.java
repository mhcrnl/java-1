/*
 * GenerateInt.java
 */

import java.util.*;

/**
 * Queueクラスです。
 */
final class Queue {
        /**
         * 待ち行列に随時入れることができる項目の最大数
         */
        private static final int MAX_NUM = 10;

        /**
         * 整数
         */
        private int num;

        /**
         * 待ち行列
         */
        Vector<Integer> v;

        /**
         * コンストラクタです。
         */
        Queue() {
               v = new Vector<Integer>(); 
               num = 0;
        }

        /**
         * 整数を待ち行列に書き込みます。
         * @return 書き込んだ整数
         */
        synchronized public int write() {
                try {
                        while(v.size() == MAX_NUM) {
                                wait();
                        }
                }
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
                v.add(++num);
                notifyAll();
                return num;
        }

        /**
         * 整数を待ち行列から読み込みます。
         * @return 読み込んだ整数
         */
        synchronized public Integer read() {
                try {
                        while(v.size() == 0) {
                                wait();
                        }
                }       
                catch(InterruptedException e) {
                        e.printStackTrace();
                }
                int r =  v.remove(0);
                notifyAll();
                return r;
        }
}

/**
 * Producerクラスです。
 */
final class Producer extends Thread {
        /**
         * 待ち行列
         */
        Queue q;

        /**
         * コンストラクタです。
         * @param q 待ち行列
         */
        Producer(Queue q) {
                this.q = q;
        }

        /**
         * スレッドを実行します。
         */
        public void run() {
                try {
                        while(true) {
                                System.out.println("write: " + q.write());
                                Thread.sleep(1000);
                        }
                }
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

/**
 * Consumerクラスです。
 */
final class Consumer extends Thread {
        /**
         * 待ち行列
         */
        Queue q;

        /**
         * コンストラクタです。
         * @param q 待ち行列
         */
        Consumer (Queue q) {
                this.q = q;
        }

        /**
         * スレッドを実行します。
         */
        public void run() {
                try {
                        while(true) {
                                System.out.println("read: " + q.read());
                                sleep(5000);
                        }
                }
                catch(InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

/**
 * GenerateIntクラスです。
 */
public class GenerateInt {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Queue q  = new Queue();
                new Producer(q).start();
                new Consumer(q).start();
                new Consumer(q).start();
                new Consumer(q).start();
        }
}

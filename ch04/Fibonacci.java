/*
 * Fibonacci.java
 */

/**
 * Fibonacciクラスです。
 */
public class Fibonacci {
        /**
         * mainメソッドです。
         * 
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                int i = 0;
                int before1 = 1;
                int before2 = 0;
                int count = 0;
                do {
                        i = before1 + before2;
                        before2 = before1;
                        before1 = i;
                        System.out.println(i);
                        ++count;
                } while(count < 15);
        }

}

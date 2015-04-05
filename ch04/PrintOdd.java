/*
 * PrintOdd.java
 */

/**
 * PrintOddクラスです。
 */
public class PrintOdd {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                for(int i = 1; i < 101; ++i) {
                        if(i % 2 == 0) {
                                continue;
                        }
                        System.out.print(i + " ");
                }
                System.out.println();
        }

}

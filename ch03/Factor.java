/*
 * Factor.java
 */

/**
 * Factorクラスです。
 */
public class Factor {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                int number = Integer.parseInt(args[0]);
                for (int i = 2; i < number; ++i) {
                        if (number % i == 0) {
                                System.out.println(i);
                        }
                }
        }
}

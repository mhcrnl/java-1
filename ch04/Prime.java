/*
 * Prime.java
 */

/**
 * Primeクラスです。
 */
public class Prime {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                for(int i = 100; i < 201; ++i) {
                        boolean flag = true;
                        for(int j = 2; j < (i / 2) + 1; ++j) {
                                if(i % j == 0) {
                                        flag = false;
                                        break;
                                }
                        }
                        if(flag) {
                                System.out.println(i);
                        }
                }
        }
}

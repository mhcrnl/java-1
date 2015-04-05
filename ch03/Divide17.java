/*
 * Divide17.java
 */

/**
 * Divide17クラスです。
 */
public class Divide17 {
        /**
         * mainメソッドです。
         * 
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                for (int i = 17; i < 101; ++i) {
                        if (i % 17 == 0) {
                                System.out.println(i);
                        }
                }
        }
}

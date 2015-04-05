/*
 * Power.java
 */

/**
 * Powerクラスです。
 */
public class Power {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                for (int i = 1; i < 11; ++i) {
                        System.out.print(i + "\t" + i*i + "\t " + i*i*i + "\n");
                }
        }
}

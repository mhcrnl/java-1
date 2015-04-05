/*
 * GeometricProgression.java
 */

/**
 * GeometricProgressionクラスです。
 */
public class GeometricProgression {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                for(int i = 1; i < 1000; i += i) {
                        System.out.print(i + " ");
                }
                System.out.println();
        }
}

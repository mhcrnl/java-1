/*
 * IntArray.java
 */

/**
 * IntArrayクラスです。
 */
public class IntArray {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                int array[] = new int[10];
                for (int i = 0, j = -1; i < array.length; ++i, --j) {
                        array[i] = j;
                }
                for (int i = 0; i < array.length; ++i) {
                        System.out.println(array[i]);
                }
        }
}

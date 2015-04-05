/*
 * Bell.java
 */

/**
 * Bellクラスです。
 */
public class Bell {
        /**
         * mainメソッドです。
         * 
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                for(int i = Integer.parseInt(args[0]); i > 0; --i) {
                        System.out.println(i);
                        if (i == 1) {
                                System.out.println("\u0007");
                        }
                }
        }
}

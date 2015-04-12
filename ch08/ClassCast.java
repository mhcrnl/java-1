/*
 * ClassCast.java
 */

/**
 * ClassCastクラスです。
 */
public class ClassCast {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                try {
                        Object obj = new Integer("85");
                        System.out.println("Before cast");
                        Double dpbj = (Double)obj;
                        System.out.println("After cast");
                }
                catch (Exception e) {
                        System.out.println(e);
                }
        }
}

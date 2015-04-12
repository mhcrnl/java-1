/*
 * ExceptionDemo.java
 */

/**
 * ExceptionDemoクラスです。
 */
public class ExceptionDemo {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                String s = "aiueo";
                try {
                        s.charAt(6);
                }
                catch (StringIndexOutOfBoundsException e) {
                        System.out.println(e);
                }
        }
}

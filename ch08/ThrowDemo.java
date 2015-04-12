/*
 * ThrowDemo.java
 */

/**
 * ThrowDemoクラスです。
 */
public class ThrowDemo {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                try {
                        System.out.println("Before a");
                        a();
                        System.out.println("After a");
                }
                catch (Exception e) {
                        System.out.println("main: " + e);
                }
                finally {
                        System.out.println("main: finally");
                }
        }

        /**
         * aメソッドです。
         */
        public static void a(){
                try {
                        System.out.println("Before b");
                        b();
                        System.out.println("After b");
                }
                catch (Exception e) {
                        System.out.println("a: " + e);
                }
                finally {
                        System.out.println("a: finally");
                } 
        }

        /**
         * bメソッドです。
         */
        public static void b(){
                try {
                        System.out.println("Before c");
                        c();
                        System.out.println("After c");
                }
                catch (Exception e) {
                        System.out.println("b: " + e);
                }
                finally {
                        System.out.println("b: finally");
                }
        }

        /**
         * cメソッドです。
         */
        public static void c (){
                try {
                        System.out.println("Before d");
                        d();
                        System.out.println("After d");
                }
                catch (Exception e) {
                        System.out.println("c: " + e);
                        throw e;
                }
                finally {
                        System.out.println("c: finally");
                }
        }

        /**
         * dメソッドです。
         */
        public static void d() {
                try {
                        int[] i = new int[10];
                        System.out.println("Before access");
                        i[20] = 20;
                        System.out.println("After access");
                }
                catch(Exception e) {
                        System.out.println("d: " + e);
                        throw e;
                }
                finally {
                        System.out.println("d: finally");
                }
        }
}

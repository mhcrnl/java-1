/*
 * MakeIntegerObject.java
 */

/**
 * MakeIntegerObjectクラスです。
 */
public class MakeIntegerObject {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Integer i = new Integer(123);
                Class c1 = i.getClass();
                Class c2 = c1.getSuperclass();
                System.out.println(c2.getName());
        }
}

/*
 * ToString.java
 */

/**
 * Aクラスです。
 */
class A {
        /**
         * Integer型の静的変数
         */
        static Integer x = new Integer(123);

        /**
         * String型のインスタンス変数
         */
        String y = new String();

        /**
         * オブジェクトに関する有益な情報を表示します。
         * @return オブジェクトに関する有益な情報
         */
        public String toString() {
                Class c1 = x.getClass();
                Class c2 = y.getClass();
                return c1.getName() + "; " + c2.getName();
        }
}

/**
 * ToStringクラスです。
 */
public class ToString {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                A a = new A();
                System.out.println(a.toString());
        }
}

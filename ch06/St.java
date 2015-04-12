/*
 * St.java
 */

/**
 * Sクラスです。
 */
class S {
        /**
         * Integer型の変数
         */
        Integer x = new Integer(123);

        /**
         * 変数xを表示します。
         */
        public void display() {
                System.out.println(this.x);
        }
}

/**
 * Tクラスです。
 */
class T extends S {
        /**
         * StringBuffer型の変数
         */
        StringBuffer x = new StringBuffer("aiueo");

        /**
         * 変数xを表示します。
         */
        public void display() {
                System.out.println(this.x);
        }
}

/**
 * Stクラスです。
 */
public class St {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                S s = new S();
                T t = new T();
                s.display();
                t.display();
        }
}

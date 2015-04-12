/*
 * Mn.java
 */

/**
 * Mクラスです。
 */
class M {
        /**
         * float型の変数
         */
        float f;

        /**
         * String型の変数
         */
        String s;
}

/**
 * Nクラスです。
 */
class N extends M{
        /**
         * Double型の変数
         */
        Double d;

        /**
         * コンストラクタです。
         * @param f float型の変数
         * @param s String型の変数
         * @param d Double型の変数
         */
        public N(float f, String s, Double d) {
                this.f = f;
                this.s = s;
                this.d = d;
        }
        
}

/**
 * Mnクラスです。
 */
public class Mn {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                N n = new N(1.0f, "a", 2.0);                
                System.out.println(n.f);
                System.out.println(n.s);
                System.out.println(n.d);
        }
}

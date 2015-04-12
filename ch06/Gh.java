/*
 * Gh.java
 */

/**
 * Gクラスです。
 */
class G {
        /**
         * 静的変数
         */
        static int x = 10;
}

/**
 * Hクラスです。
 */
class H extends G {
        /**
         * インスタンス変数
         */
        String x = "aiueo";

        /**
         * GクラスとHクラスの変数xを表示します。
         */
        public void display() {
                System.out.println("G: " + G.x);
                // System.out.println("G: " + super.x);
                System.out.println("H: " + this.x);
        }
}

/**
 * Ghクラスです。
 */
public class Gh {
        /**
         * mainメソッドです
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                H h = new H();
                h.display();
        }
}

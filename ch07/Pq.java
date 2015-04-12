/*
 * Pq.java
 */

/**
 * Pインターフェイスです。
 */
interface P {
        /**
         * 定数
         */
        int p = 1;

        /**
         * メソッド
         */
        void pm();
}

/**
 * P1インターフェイスです。
 */
interface P1 extends P {
        /**
         * 定数
         */
        int p1 = 2;

        /**
         * メソッド
         */
        void p1m();
}

/**
 * P2インターフェイスです。
 */
interface P2 extends P {
        /**
         * 定数
         */
        int p2 = 3;

        /**
         * メソッド
         */
         void p2m();
}

/**
 * P12インターフェイスです。
 */
interface P12 extends P1, P2 {
        /**
         * 定数
         */
        int p12 = 4;

        /**
         * メソッド
         */
        void p12m();
}

/**
 * Qクラスです。
 */
final class Q implements P12 {
        public void pm() {
                System.out.println(p);
        }
        public void p1m() {
                System.out.println(p1);
        }
        public void p2m() {
                System.out.println(p2);
        }
        public void p12m() {
                System.out.println(p12);
        }
}

/**
 * Pqクラスです。
 */
public class Pq {
        /**
         * Mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Q q = new Q();
                q.pm();
                q.p1m();
                q.p2m();
                q.p12m();
        }
}

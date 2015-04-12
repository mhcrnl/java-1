/*
 * Ku.java
 */

/**
 * K1インターフェイスです。
 */
interface K1 {
        /**
         * 初期値1の定数
         */
        public static final int intK = 1;
        
        /**
         * メソッド
         */
        void methodK();
}

/**
 * K2インターフェイスです。
 */
interface K2 extends K1 {
        void methodK();
}

/**
 * K3インターフェイスです。
 */
interface K3 extends K2 {
        void methodK();
}

/**
 * Uクラスです。
 */
final class U implements K3 {
        public void methodK() {
                System.out.println(intK);
        }
}

/**
 * Kuクラスです。
 */
public class Ku {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                U u = new U();
                u.methodK();
        }
}

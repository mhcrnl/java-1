/*
 * InstanceOf.java
 */

/**
 * I1インターフェイスです。
 */
interface I1 {
}

/**
 * I2インターフェイスです。
 */
interface I2 {
}

/**
 * I3インターフェイスです。
 */
interface I3 extends I1, I2 {
}

/**
 * I4インターフェイスです。
 */
interface I4 {
}

/**
 * Xクラスです。
 */
class X implements I3 {
}

/**
 * Wクラスです。
 */
final class W extends X implements I4 {
}

/**
 * InstanceOfクラスです。
 */
public class InstanceOf {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                W w = new W();
                if(w instanceof I1) {
                        System.out.println("I1");
                }
                if(w instanceof I2) {
                        System.out.println("I2");
                }
                if(w instanceof I3) {
                        System.out.println("I3");
                }
                if(w instanceof I4) {
                        System.out.println("I4");
                }
                if(w instanceof X) {
                        System.out.println("X");
                }
        }
}

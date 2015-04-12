/*
 * SuperClass.java
 */

/**
 * I2クラスです。
 */
class I2 {
        /**
         * クラス名を返します。
         * @return クラス名
         */
        public String getDescription() {
                return "I2";
        }
}

/**
 * J2クラスです。
 */
class J2 extends I2 {
        /**
         * クラス名とスーパークラス名を返します。
         * @return クラス名とスーパークラス名
         */
        public String getDescription() {
                return "J2 " + super.getDescription();
        }
}

/**
 * K2クラスです。
 */
class K2 extends J2 {
        /**
         * クラス名とスーパークラス名を返します。
         * @return クラス名度スーパークラス名
         */
        public String getDescription() {
                return "K2 " + super.getDescription();
        }
}

/**
 * SuperClassクラスです。
 */
public class SuperClass {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                I2 i = new I2();
                J2 j = new J2();
                K2 k = new K2();
                System.out.println(i.getDescription());
                System.out.println(j.getDescription());
                System.out.println(k.getDescription());
        }
}

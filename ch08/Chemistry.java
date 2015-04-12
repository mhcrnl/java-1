/*
 * Chemistry.java
 */

/**
 * Constantインターフェイスです。
 */
interface Constant {
        /**
         * 重力加速度
         */
        double ACCELERATION = 9.8;

        /**
         * 光速
         */
        double LIGHT_SPEED = 3e8;

        /**
         * アヴォガドロ定数
         */
        double AVOGADRO = 6.02e23;
}

/**
 * Chemistryクラスです。
 */
public class Chemistry {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                System.out.println(Constant.ACCELERATION);
                System.out.println(Constant.LIGHT_SPEED);
                System.out.println(Constant.AVOGADRO);
        }
}

/*
 * WaterConstant.java
 */

/**
 * Waterクラスです。
 */
class Water {
        /**
         * 沸点
         */
        public static final int BOILING_POINT = 100;

        /**
         * 氷点
         */
        public static final int FREEZING_POINT = 0;

        /**
         * 密度
         */
        public static final int DENSITY = 1;
}

/**
 * WaterConstantクラスです。
 */
public class WaterConstant {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                System.out.println("Boiling point: " + Water.BOILING_POINT);
                System.out.println("Freezing point: " + Water.FREEZING_POINT);
                System.out.println("Density: " + Water.DENSITY);
        }
}

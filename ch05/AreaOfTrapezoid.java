/*
 * AreaOfTrapezoid.java
 */

/**
 * Trapezoidクラスです。
 */
class Trapezoid{
        /**
         * 高さ
         */
        double height;

        /**
         * 基底1
         */
        double base1;

        /**
         * 基底2
         */
        double base2;

        /**
         * コンストラクタです。
         * @param height 高さ
         * @param base1 基底1
         * @param base2 基底2
         */
        Trapezoid(double height, double base1, double base2) {
                this.height = height;
                this.base1 = base1;
                this.base2 = base2;
        }

        /**
         * 台形の面積を計算します。 
         */
        void area() {
                System.out.println("Area: " + 0.5 * this.height * (this.base1 + this.base2));
        }
}

/**
 * AreaOfTrapezoidクラスです。
 */
public class AreaOfTrapezoid {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                Trapezoid t = new Trapezoid(10, 2, 3);
                t.area();
        }
}

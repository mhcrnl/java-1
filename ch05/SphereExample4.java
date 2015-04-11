/*
 * SphereExample4.java
 */

/**
 * Sphereクラスです。
 */
class Sphere {
        /**
         * 半径
         */
        double radius;

        /**
         * 球体の中心のx座標
         */
        double x;

        /**
         * 球体の中心のy座標
         */
        double y;

        /**
         * 球体の中心のz座標
         */
        double z;

        /**
         * コンストラクタです。
         */
        Sphere() {
                this(1, 0, 0, 0);
        }
        
        /**
         * コンストラクタです。
         * @param radius 球体の半径
         */
        Sphere(double radius) {
                this(radius, 0, 0, 0); 
        }

        /**
         * コンストラクタです。
         * @param radius 球体の半径
         * @param x 球体の中心のx座標
         * @param y 球体の中心のy座標
         * @param z 球体の中心のz座標
         */
        Sphere(double radius, double x, double y, double z) {
                this.radius = radius;
                this.x = x;
                this.y = y;
                this.z = z;
        }

        /**
         * 球体の座標を移動します。
         * @param x 移動後の中心のx座標
         * @param y 移動後の中心のy座標
         * @param z 移動後の中心のz座標
         */
        void move(double x, double y, double z) {
                this.x = x;
                this.y = y;
                this.z = z;
        }

        /**
         * 球体の半径の比率を修正します。
         * @param scale 比率
         */
        void scale(double scale) {
                this.radius *= scale;
        }
}

/**
 * SphereExample4クラスです。
 */
public class SphereExample4 {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Sphere s1 = new Sphere();
                Sphere s2 = new Sphere(2);
                Sphere s3 = new Sphere(3, 4, 5, 6);
                s3.move(7, 8, 9);
                s3.scale(2);
                System.out.println(s3.radius);
                System.out.println(s3.x);
                System.out.println(s3.y);
                System.out.println(s3.z);
        }
}

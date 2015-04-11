/*
 * SphereExample3.java
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
         * 
         * @param radius 球体の半径
         */
        Sphere(double radius) {
                this(radius, 0, 0, 0); 
        }

        /**
         * コンストラクタです。
         *
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
}

/**
 * SphereExample3クラスです。
 */
public class SphereExample3 {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Sphere s1 = new Sphere();
                Sphere s2 = new Sphere(2);
                Sphere s3 = new Sphere(3, 4, 5, 6);
        }
}

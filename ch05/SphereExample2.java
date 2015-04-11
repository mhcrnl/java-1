/*
 * SphereExample2.java
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
     * 中心座標のx軸
     */
    double x;

    /**
     * 中心座標のy軸
     */
    double y;
    
    /**
     * コンストラクタです。
     *
     * @param radius 半径
     * @param x 中心座標のx軸
     * @param y 中心座標のy軸
     */
    Sphere(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
}

/**
 * SphereExample2クラスです。
 */
public class SphereExample2 {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
     public static void main(String[] args){
         Sphere s = new Sphere(2, 0, 0);
     }
}

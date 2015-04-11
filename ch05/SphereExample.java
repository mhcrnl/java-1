/*
 * SphereExample.java
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
}

/**
 * SphereExampleクラスです。
 */
public class SphereExample {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
     public static void  main(String[] args){
         Sphere s = new Sphere();
         s.radius = 2;
         s.x = 0;
         s.y = 0;
     }
}

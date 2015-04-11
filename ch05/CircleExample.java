/*
 * CircleExample.java
 */
 
/**
 * Circleクラスです。
 */
class Circle {
    /**
     * 円の半径
     */
    double radius;
    
    /**
     * 円の中心座標（x軸）
     */
    double x;

    /**
     * 円の中心座標（y軸）
     */
    double y;
    
    /**
     * コンストラクタです。
     * 
     * @param radius 円の半径
     */
    Circle(double radius) {
        this(radius, 0, 0);
    }

    /**
     * コンストラクタです。
     *
     * @param radius 円の半径
     * @param x 円の中心座標（x軸）
     * @param y 円の中心座標（y軸）
     */
    Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
}

/**
 * CircleExampleクラスです。
 */
public class CircleExample {
    /**
     * mainメソッドです。
     * 
     * @param args コマンドライン引数（未使用）
     */
     public static void main(String[] args) {
         Circle c1 = new Circle(2);
         Circle c2 = new Circle(3, 1, 1);
         System.out.println(c1.radius + " " + c1.x + " " + c1.y);
         System.out.println(c2.radius + " " + c2.x + " " + c2.y);
     }
}

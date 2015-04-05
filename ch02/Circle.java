/*
 * Circle.java
 */

/**
 * Circleクラスです。
 */
public class Circle {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        System.out.println(Math.pow(Double.parseDouble(args[0]), 2) * Math.PI);
    }
}

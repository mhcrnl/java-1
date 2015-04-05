/*
 * ConSinTan.java
 */

/**
 * CosSinTanクラスです。
 */
public class CosSinTan {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("引数の個数が不正です。");
            System.exit(0);
        }
        double radian = Double.parseDouble(args[0]) * Math.PI / 180;
        System.out.println("cosine: " + Math.cos(radian));
        System.out.println("sine: " + Math.sin(radian));
        System.out.println("tangent: " + Math.tan(radian));
    }
}


/*
 * MoonWeight.java
 */

/**
 * MoonWeightクラスです。
 */
public class MoonWeight {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("引数の数が不正です。");
            System.exit(0);
        }
        System.out.println(Double.parseDouble(args[0]) * 0.17); 
    }
}

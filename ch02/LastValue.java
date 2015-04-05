/*
 * LastValue.java
 */

/**
 * LastValueクラスです。
 */
public class LastValue{
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        String s = "10,20,30,40,50";
        System.out.println(s.substring(s.lastIndexOf(",") + 1));
    }
}

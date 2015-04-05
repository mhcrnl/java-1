/*
 * TwoIntegerObject.java
 */

/**
 * TwoIntegerObjectクラスです。
 */
public class TwoIntegerObject {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer("1");
        System.out.println(a.equals(b));
    }
}

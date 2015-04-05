/*
 * Last10Chars.java
 */

/**
 * Last10Charsクラスです。
 */
public class Last10Chars {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        String s = "1234567890123";
        System.out.println(s.substring(s.length() - 10));
    }

}

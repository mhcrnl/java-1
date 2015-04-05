/*
 * AppendReverse.java
 */

/**
 * AppendReverseクラスです。
 */
public class AppendReverse {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        System.out.println(sb.append("123"));
        System.out.println(sb.reverse());
    }
}

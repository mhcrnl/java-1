/*
 * InsertStringBuffer.java
 */

/**
 * InsertStringBufferクラスです。
 */
public class InsertStringBuffer {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        System.out.println(sb.insert(0, "123"));
    }
}

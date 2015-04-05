/*
 * AppendStringBuffer.java
 */

/**
 * AppendStringBufferクラスです。
 */
public class AppendStringBuffer {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("abc");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}

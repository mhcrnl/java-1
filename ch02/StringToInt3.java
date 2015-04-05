/*
 * StringToInt3.java
 */

/**
 * StringToInt3.クラスです。
 */
public class StringToInt3 {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args){
        String s = "125";
        int i = Integer.parseInt(s);
        i += 10;
        System.out.println(i);
    }
}

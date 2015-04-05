/*
 * ParseShort.java
 */

/**
 * ParseShortクラスです。
 */
public class ParseShort {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        short hex = Short.parseShort("A", 16);
        short octal = Short.parseShort("24", 8);
        short decimal = Short.parseShort("30");
        System.out.println(hex + octal + decimal); 
    }
}

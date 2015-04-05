/*
 * FloatArray.java
 */

/**
 * FloatArrayクラスです。
 */
public class FloatArray {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        Float[] newArray = new Float[5];
        newArray[0] = 0.01f;
        newArray[1] = 0.02f;
        newArray[2] = 0.03f;
        newArray[3] = 0.04f;
        newArray[4] = 0.05f;
        System.out.println(newArray.length);
        for (int i = 0; i < newArray.length; ++i) {
            System.out.println(newArray[i]);
        }
    }
}

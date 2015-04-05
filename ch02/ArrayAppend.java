/*
 * ArrayAppend.java
 */

/**
 * ArrayAppendクラスです。
 */
public class ArrayAppend {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args){
        Character[] newArray = {'a', 'b', 'c', 'd', 'e'};
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < newArray.length; ++i) {
            sb.append(newArray[i]);
        }
        System.out.println(sb);
    }
}

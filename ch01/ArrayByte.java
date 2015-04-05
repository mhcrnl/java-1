/*
 * ArrayByte.java
 */

/**
 * ArrayByteクラスです。
 */
public class ArrayByte{
	/**
	 * mainメソッドです。
	 *
	 * @param args コマンドライン引数（未使用）
	 */
	public static void main(String args[]) {
		byte newArray[] = new byte[4];
		newArray[0] = 0;
		newArray[1] = 1;
		newArray[2] = 2;
		newArray[3] = 3;
                for(int i = 0; i < newArray.length; ++i) {
                        System.out.println(newArray[i]);
                }
	}
}

/*
 * ArrayByte.java
 */

/**
 * ArrayByteクラスです。
 */
class ArrayByte{
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
		System.out.println(newArray[0]);
		System.out.println(newArray[1]);
		System.out.println(newArray[2]);
		System.out.println(newArray[3]);
	}
}
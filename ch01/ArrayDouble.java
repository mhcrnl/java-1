/*
 * ArrayDouble.java
 */

/**
 * ArrayDoubleクラスです。
 */
class ArrayDouble {
	/**
	 * mainメソッドです。
	 *
	 * @param args コマンドライン引数（未使用）
	 */
	public static void main(String args[]) {
		double sum = 0.0;
		double newArray[] = {0.1, 0.2, 0.3, 0.4};
		for (int i = 0; i < newArray.length; ++i) {
			sum += newArray[i];
		}
		System.out.println(sum / newArray.length);
	}
}
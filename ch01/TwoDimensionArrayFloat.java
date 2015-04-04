/*
 * TwoDimensionArrayFloat.java
 */

/**
 * TwoDimensionArrayFloatクラスです。
 */
class TwoDimensionArrayFloat {
	/**
	 * mainメソッドです。
	 * 
	 * @param args コマンドライン引数（未使用）
	 */
	public static void main(String args[]) {
		int sum = 0;
		float newArray[][] = {
			{-56.7f},
			{500.1f, 70.70f},
			{100.9f, 0.5f, 20.20f}
		};
		for (int i = 0; i < newArray.length; ++i) {
			for (int j = 0; j < newArray[i].length; ++j) {
				System.out.println("newArray[" + i + "][" + j + "]: " + newArray[i][j]);
				++sum;
			}
		}
		System.out.println("sum: " + sum);
	}
}

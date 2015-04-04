/*
 * ThreeDimensionArray.java
 */

/**
 * ThreeDimensionArrayクラスです。
 */
class ThreeDimensionArray{
	/**
	 * mainメソッドです。
	 *
	 * @param args コマンドライン引数（未使用）
	 */
	public static void main(String args[]) {
		byte newArray[][][] = {
			{
				{1,2,3},
				{4,5,6},
				{7,8,9}
			},
			{
				{10,11,12},
				{13,14,15},
				{16,17,18}
			},
			{
				{19,20,21},
				{22,23,24},
				{25,26,27}
			}			
		};
		for (int i = 0; i < newArray.length; ++i) {
			for (int j = 0; j < newArray[i].length; ++j) {
				for (int k = 0; k < newArray[i][j].length; ++k) {
					System.out.println(newArray[i][j][k]);
				}
			}
		}
	}
}

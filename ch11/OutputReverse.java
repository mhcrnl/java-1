/*
 * OutputReverse.java
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * OutputReverseクラスです。
 */
public class OutputReverse {
	/**
	 * mainメソッドです。
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(new StringBuilder(s).reverse());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

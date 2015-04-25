/*
 * StringTokenizerDemo2.java
 */

import java.util.StringTokenizer;

/**
 * StringTokenizerDemo2クラスです。
 */
public class StringTokenizerDemo2 {
	/**
	 * mainメソッドです。
	 * @param args コマンドライン引数（未使用）
	 */
	public static void main(String[] args) {
		String str = "123/45.6/-11.2/-90.1/100/99.99/-50/-20";
		StringTokenizer st = new StringTokenizer(str, "/");

		while(st.hasMoreElements()) {
			Object s = st.nextElement();
			System.out.println(s);
		}
	}
}

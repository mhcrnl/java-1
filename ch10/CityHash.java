/*
 * CityHash.java
 */

import java.util.*;

/**
 * CityHashクラスです。
 */
public class CityHash {
	/**
	 * mainメソッドです。
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args) {
		Hashtable<String, String> hash = new Hashtable<String, String>();

		hash.put("Tokyo", "Japan");
		hash.put("Seoul", "Korea");
		hash.put("Washington", "America");

		if(args.length == 0) {
			System.out.println("コマンドライン引数が指定されていません。");
		} else if (!hash.containsKey(args[0])) {
			System.out.println("都市名がハッシュ表に含まれていません。");
		} else {
			System.out.println(hash.get(args[0]));
		}
	}
}

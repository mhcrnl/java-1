/*
 * PersonHash.java
 */

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Personクラスです。
 */
final class Person {
	/**
	 * 氏名
	 */
	private final String name;

	/**
	 * 電話番号
	 */
	private final String tel;

	/**
	 * FAX番号
	 */
	private final String fax;

	/**
	 * メールアドレス
	 */
	private final String mail;

	/**
	 * コンストラクタです。
	 * @param name 氏名
	 * @param tel 電話番号
	 * @param fax FAX番号
	 * @param mail メールアドレス
	 */
	public Person(String name, String tel, String fax, String mail) {
		this.name = name;
		this.tel = tel;
		this.fax = fax;
		this.mail = mail;
	}
        
        /**
         * 文字列表現を返します。
         * return 文字列表現
         */
        public String toString() {
                return "name: " + this.name + ", tel: " + this.tel + ", fax: " + this.fax + ", mail: " + this.mail;
        }
}

/**
 * PersonHashクラスです。
 */
public class PersonHash {
	/**
	 * mainメソッドです。
	 * @param args コマンドライン引数（未使用）
	 */
	public static void main(String[] args) {
		Hashtable<String, Person> hash = new Hashtable<String, Person>();

		hash.put("157R117084", new Person("Chacha", "111-111-111", "222-222-222", "a@yahoo.co.jp"));
		hash.put("157R117085", new Person("Riya", "123-456-789", "987-654-321", "b@yahoo.co.jp"));
		hash.put("157R117086", new Person("Shiine", "000-000-000", "999-999-999", "c@yahoo.co.jp"));

		Enumeration<String> e = hash.keys();
		while(e.hasMoreElements()) {
			String key = e.nextElement();
			System.out.println("key: " + key);
			System.out.println(hash.get(key));
			System.out.println("-------------------------");
		}
	}
}

/*
 * PersonExample.java
 */
 
/**
 * Personクラスです。
 */
class Person {
    /**
     * 名前
     */
    String name = new String();

    /**
     * 年齢
     */
    int age;

    /**
     * 収入
     */
    float income;
}

/**
 * PersonExampleクラスです。
 */
public class PersonExample {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
     public static void main(String[] args) {
         Person p = new Person();
         p.name = "Chika";
         p.age = 22;
         p.income = 3.00f;
         System.out.println(p.name + " " + p.age + " " + p.income);
     }
}

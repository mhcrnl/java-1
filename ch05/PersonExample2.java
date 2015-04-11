/*
 * PersonExample2.java
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
    
    /**
     * コンストラクタ
     *
     * @param name 名前
     * @param age 年齢
     * @param income 収入
     */
    Person(String name, int age, float income) {
        this.name = name;
        this.age = age;
        this.income = income;
    }
}

/**
 * PersonExample2クラスです。
 */
public class PersonExample2 {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
     public static void main(String[] args) {
         Person p = new Person("Chika", 22, 3.00f);
     }
}

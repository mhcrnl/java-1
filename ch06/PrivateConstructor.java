class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person() {
  }
}

class PrivateConstructor {
  public static void main(String args[]) {
    // publicコンストラクタは呼び出せる
    Person p1 = new Person("John", 30);
    System.out.println(p1.name);
    System.out.println(p1.age);

    // privateコンストラクタは呼び出せない
    Person p2 = new Person();
    System.out.println(p2.name);
    System.out.println(p2.age);
  }
}

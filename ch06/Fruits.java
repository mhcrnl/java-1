/**
 * Fruits.java
 */

/**
 * Fruitクラスです。
 */
abstract class Fruit {
        /**
         * フルーツの色
         */
        String color;

        /**
         * フルーツの名前と色を表す文字列を返します。
         * @return フルーツの名前と色を表す文字列
         */
        public String toString() {
                return getClass().getName() + ": " + color;
        }
}

/**
 * Appleクラスです。
 */
class Apple extends Fruit{
        /**
         * コンストラクタです。
         */
        public Apple() {
                color = "red";
        }
}

/**
 * Bananaクラスです。
 */
class Banana extends Fruit{
        /**
         * コンストラクタです。
         */
        public Banana() {
                color = "yellow";
        }
}

/**
 * Orangeクラスです。
 */
class Orange extends Fruit{
        /**
         * コンストラクタです。
         */
        public Orange() {
                color = "orange";
        }
}

/**
 * Strawberryクラスです。
 */
class Strawberry extends Fruit{
        /**
         * コンストラクタです。
         */
        public Strawberry() {
                color = "red";
        }
}

/**
 * Fruitsクラスです。
 */
public class Fruits {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Apple a = new Apple();
                Banana b = new Banana();
                Orange o = new Orange();
                Strawberry s = new Strawberry();
                
                System.out.println(a.toString());
                System.out.println(b.toString());
                System.out.println(o.toString());
                System.out.println(s.toString());
        }
}

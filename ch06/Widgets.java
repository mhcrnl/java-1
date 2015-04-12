/*
 * Widgets.java
 */

/**
 * Widgetクラスです。
 */
abstract class Widget {
        /**
         * 重さ
         */
        int weight;

        /**
         * 色
         */
        String color;

        /**
         * オブジェクトの要素を返します。
         * @return オブジェクトの要素
         */
        public String toString() {
                return getClass().getName() + ": " + weight + ", " + color;
        }
}

/**
 * WidgetAクラスです。
 */
class WidgetA extends Widget {
        /**
         * コンストラクタです。
         */
        public WidgetA() {
                weight = 4;
                color = "red";
        }
}

/**
 * WidgetBクラスです。
 */
class WidgetB extends Widget {
        /**
         * コンストラクタです。
         */
        public WidgetB() {
                weight = 1;
                color = "blue";
        }
}
/**
 * WidgetCクラスです。
 */
class WidgetC extends Widget {
        /**
         * コンストラクタです。
         */
        public WidgetC() {
                weight = 5;
                color = "green";
        }
}
/**
 * WidgetDクラスです。
 */
class WidgetD extends Widget {
        /**
         * コンストラクタです。
         */
        public WidgetD() {
                weight = 17;
                color = "yellow";
        }
}

/**
 * Widgetsクラスです。
 */
public class Widgets {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Widget[] w = new Widget[6];
                w[0] = new WidgetA();
                w[1] = new WidgetB();
                w[2] = new WidgetC();
                w[3] = new WidgetD();
                w[4] = new WidgetA();
                w[5] = new WidgetB();
                int sum = 0;
                for(int i = 0, l = w.length; i < l; ++i) {
                        System.out.println(w[i]);
                        sum += w[i].weight;
                }
                System.out.println(sum);
        }
}

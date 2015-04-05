/*
 * AfterIncrementDecrement.java
 */

/**
 * AfterIncrementDecrementクラスです。
 */
public class AfterIncrementDecrement {
        /**
         * mainメソッドです。
         * 
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                int a, b;
                a = 1;
                ++a;
                b = a;
                --b;
                System.out.println(a + " " + b);
        }
}

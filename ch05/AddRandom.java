/*
 * AddRandom.java
 */

/**
 * AddRandomクラスです。
 */
public class AddRandom {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                double sum = 0;
                while(sum < 100) {
                        sum += Math.random() * 10;
                        System.out.println(sum);
                }
        }
}

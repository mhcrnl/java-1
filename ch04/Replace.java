/*
 * Replave.java
 */

/**
 * Replaceクラスです。
 */
public class Replace {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                for (int i = 0; i < 10; i +=2) {
                        System.out.print(i + " ");
                }
                System.out.println();

                int i = 0;
                do {
                        System.out.print(i + " ");
                        i += 2;
                } while(i < 10);
                System.out.println();
        }
}

/*
 * IsOdd.java
 */

/**
 * IsOddクラスです。
 */
public class IsOdd {
        /**
         * mainメソッドです。
         * 
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                if(Integer.parseInt(args[0]) % 2 == 1){
                        System.out.println("odd");
                }
                else {
                        System.out.println("even");
                }
        }

}

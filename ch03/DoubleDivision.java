/*
 * DoubleDivision.java
 */

/**
 * DoubleDivisionクラスです。
 */
public class DoubleDivision {
        /**
         * mainメソッドです。
         * 
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                if (args[1].equals("0")) {
                        System.out.println("引数の値が不正です。");
                }
                else {
                     System.out.println(Double.parseDouble(args[0]) / Double.parseDouble(args[1]));   
                }
        }
}

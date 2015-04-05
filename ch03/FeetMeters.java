/*
 * FeetMeters.java
 */

/**
 * FeetMetersクラスです。
 */
public class FeetMeters {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数
         */
        public static void main(String[] args){
                if(args[1].equals("feet")) {
                        System.out.println(Double.parseDouble(args[0]) / 3.28 + "meters");
                }
                else if(args[1].equals("meters")) {
                        System.out.println(Double.parseDouble(args[0]) * 3.28 + "feet");
                }
                else {
                        System.out.println("引数が不正です。");
                }
        }
}

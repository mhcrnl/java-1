/*
 * Dollars.java
 */

/**
 * Dollarsクラスです。
 */
public class Dollars {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                double cents = 0;
                for(int i = 0, l = args.length; i < l; ++i) {
                        if(args[i].equals("nickels")) {
                                cents += Double.parseDouble(args[i-1]) * 5;
                        } else if(args[i].equals("quarters")) {
                                cents += Double.parseDouble(args[i-1]) * 25;
                        } else if(args[i].equals("dimes")) {
                                cents += Double.parseDouble(args[i-1]) * 10;
                        }
                }
                System.out.println("$" + cents / 100);
        }
}

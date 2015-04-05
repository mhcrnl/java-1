/*
 * Add.java
 */

/**
 * Addクラスです。
 */
public class Add {
        /**
         * mainメソッドです。
         * 
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                int length = args.length;
                int i = 0;
                int sum = 0;
                while (i < length) {
                        sum += Integer.parseInt(args[i]);  
                        ++i;
                }
                System.out.println(sum);
        }
}

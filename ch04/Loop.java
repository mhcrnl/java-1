/*
 * Loop.java
 */

/**
 * Loopクラスです。
 */
public class Loop {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                for(int i = 0, l1 = args.length; i < l1; ++i) {
                        for(int j = 0, l2 = args[i].length(); j < l2; ++j) {
                                System.out.print(args[i] + " ");
                        }
                        System.out.println();
                }
        
        }
}

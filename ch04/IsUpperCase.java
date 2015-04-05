/*
 * IsUpperCase.java
 */

/**
 * IsUpperCaseクラスです。
 */
public class IsUpperCase {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                for(int i = 0, l = args.length; i < l; ++i) {
                        if(Character.isLowerCase(args[i].charAt(0))) {
                                System.out.println(args[i] + "は先頭が大文字ではありません。");
                                break;
                        }
                        System.out.println(args[i]);
                }
        }

}

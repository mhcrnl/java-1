/*
 * 変数cと変数flagは初期化されておらず
 * println()の実行が不可能となるため、
 * コンパイルエラーとなる。
 */

/**
 * UninitializedVariablesクラスです。
 */
class UninitializedVariables {
        /**
         * mainメソッドです。
         * 
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String args[]) {
                char c;
                boolean flag;
                System.out.println(c);
                System.out.println(flag);
        }
}

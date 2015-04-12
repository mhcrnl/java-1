/*
 * isMinus.java 
 */

/**
 * ExceptionAクラスです。
 */
class ExceptionA extends Exception {
        /**
         * シリアルバーションID
         */
        private static final long serialVersionUID = 8531245739641223373L;
        /**
         * コンストラクタです。
         * @param message エラーメッセージ
         */
        ExceptionA(String message) {
                super(message);
        }
}

/**
 * isMinusクラスです。
 */
public class isMinus {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                try {
                        for (int i = 0, l = args.length; i < l; ++i) {
                                if (Integer.parseInt(args[i]) < 0){
                                        throw new ExceptionA("Minus");
                                }
                        }
                }
                catch (ExceptionA e) {
                        System.out.println(e);
                }
        }
}

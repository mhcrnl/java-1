/*
 * DoubleAdd.java
 */

/**
 * RangeExceptionクラスです。
 */
class RangeException extends Exception{
        /**
         * コンストラクタです。
         * @param message 例外メッセージ
         */
        RangeException(String message) {
                super(message);
        }
}

/**
 * DoubleAddクラスです。
 */
public class DoubleAdd {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                try {
                        System.out.println(add(args));
                }
                catch (NumberFormatException e){
                        System.out.println(e);
                }
                catch (RangeException e) {
                        System.out.println(e);
                }
                finally {
                        System.out.println("Thank you!");
                }
        }

        /**
         * addクラスです。
         * @param args 文字列の配列
         * @throws NumberFormatException 要素の形式が不正
         * @throws RangeException 要素の値の範囲が不正
         * @return 合計
         */
        public static double add(String[] args) throws NumberFormatException, RangeException{
                double sum = 0;
                for(int i = 0, l = args.length; i < l; ++i) {
                        double d = Double.parseDouble(args[i]);
                        if(d < 0 || d > 1) {
                                throw new RangeException("RangeException: " + d);
                        } else {
                                sum += d;
                        }
                }
                return sum;
        }
}

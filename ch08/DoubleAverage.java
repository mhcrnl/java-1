/*
 * DoubleAverage.java
 */

/**
 * DoubleAverageクラスです。
 */
public class DoubleAverage {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                try {
                        System.out.println(average(args));
                }
                catch (NullPointerException e) {
                        System.out.println("NullPointerException");
                }
                catch (NumberFormatException e) {
                        System.out.println("NumberFormatException");
                }
                finally {
                        System.out.println("finally");
                }
        }
        
        /**
         * 受け取った文字列を倍精度浮動小数点に変換し、
         * 平均を計算して返します。
         * @param args 受け取った文字列
         * @return 平均
         */
        public static double average(String[] args) throws NullPointerException, NumberFormatException {
                int length = args.length;
                if (length == 0) {
                        throw new NullPointerException();
                }
                double sum = 0;
                for(int i = 0; i < length; ++i) {
                        sum += Double.parseDouble(args[i]);
                }
                return sum / length;
        }
}

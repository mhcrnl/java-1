/*
 * DescendingOrder.java
 */

/**
 * DescendingOrderクラスです。
 */
public class DescendingOrder {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                int length = args.length;
                int[] array = new int[length];
                int index, t;
                for(int i = 0; i < length; ++i) {
                        array[i] = Integer.parseInt(args[i]);
                }
                for(int i = 0; i < length; ++i) {
                        index = i;
                        for(int j = i+1; j < length; ++j) {
                                if(array[index] < array[j]) {
                                        index = j;
                                }
                        }
                        t = array[i];
                        array[i] = array[index];
                        array[index] = t;
                }
                for(int i = 0; i < length; ++i) {
                        System.out.print(array[i] + " ");
                }
                System.out.println();
        }
}

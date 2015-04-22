import java.util.*;

/*
 * DoubleVector.java
 */

/**
 * DoubleVectorクラスです。
 */
public class DoubleVector {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                Vector<Double> v = new Vector<Double>();

                if(args.length == 0) {
                        System.exit(1);
                }

                for(int i = 0, l = args.length; i < l; ++i) {
                        v.add(Double.valueOf(args[i]));
                }

                for(int i = v.size()-1; i >= 0; --i) {
                        System.out.println(v.elementAt(i));
                }
        }
}

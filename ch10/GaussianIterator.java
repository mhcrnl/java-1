/*
 * GaussianIterator.java
 */

import java.util.*;

/**
 * GaussianIteratorrクラスです。
 */
public class GaussianIterator {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Vector<Double> v = new Vector<Double>();
                Random r = new Random();
                int count = (int)(Math.random() * 15 + 10);

                for(int i = 0; i < count; ++i) {
                        v.add(r.nextGaussian());
                }

                for(Object element : v) {
                        System.out.println(element);
                }
        }
}

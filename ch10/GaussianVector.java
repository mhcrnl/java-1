import java.util.*;

/*
 * GaussianVector. java
 */

/**
 * GaussianVectorクラスです。
 */
public class GaussianVector {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Vector<Double> v = new Vector<Double>();
                Random r = new Random();
                int count = (int)Math.random() * 15 + 10;

                for(int i = 0; i < count; ++i) {
                        v.add(r.nextGaussian());
                }
                Enumeration<Double> e = v.elements();
                while(e.hasMoreElements()) {
                        System.out.println(e.nextElement());
                }
        }

}


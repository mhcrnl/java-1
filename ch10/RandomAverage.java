/*
 * RandomAverage.java
 */

import java.util.*;

/**
 * RandomAverageクラスです。
 */
public class RandomAverage {
        /**
         * mainメソッドです
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                Random r = new Random();
                int count = 100;
                double sum = 0;
                if (args.length > 0) {
                        count = Integer.parseInt(args[0]);
                }

                for(int i = 0; i < count; ++i) {
                        sum += r.nextGaussian();
                }
                System.out.println(sum / count);
        }
}

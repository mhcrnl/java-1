/*
 * RanodmSeed.java
 */

import java.util.*;

/**
 * RanodmSeedクラスです。
 */
public class RandomSeed {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                long seed = System.currentTimeMillis();

                Random r1 = new Random();
                r1.setSeed(seed);
                for(int i = 0; i < 10; ++i) {
                        System.out.println(r1.nextInt());
                }

                System.out.println();

                Random r2 = new Random();
                r2.setSeed(seed);
                for(int i = 0; i < 10; ++i) {
                        System.out.println(r2.nextInt());
                }
        }
}

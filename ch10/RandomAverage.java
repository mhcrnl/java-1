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
                int number;
                int sum = 0;
                if (args.length == 0) {
                        number = 100;
                } else {
                        number = Integer.parseInt(args[0]);
                }

                for(int i = 0; i < number; ++i) {
                        System.out.print(r.nextInt() + " ");
                }
                System.out.println(sum / number);
        }
}

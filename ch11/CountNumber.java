/*
 * CountNumber.java
 */

import java.io.*;

/**
 * CountNumberクラスです。
 */
public class CountNumber {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                if (args.length != 1) {
                        System.out.println("引数が不正です。");
                        System.exit(1);
                }
                try {
                        FileReader src = new FileReader(new File(args[0]));        
                        int read1;
                        int read2;
                        int[] count = new int[10];
                        while((read1 = src.read()) != -1) {
                                read2 = read1 - '0';
                                if (read2 >= 0 && read2 <= 9) {
                                        ++count[read2];
                                }
                        }
                        src.close();
                        for(int i = 0, l = count.length; i < l; ++i) {
                                System.out.println(i + ": " + count[i]);
                        }
                }
                catch(Exception e) {
                        e.printStackTrace();
                }
        }
}

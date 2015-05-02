/*
 * TabToSpace.java
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * TabToSpaceクラスです。
 */
public class TabToSpace {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                try {
                        if (args.length != 2) {
                                System.out.println("引数が不正です。");
                                System.exit(1);
                        }
                        BufferedReader br = new BufferedReader(new FileReader(args[0]));
                        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

                        String s;
                        while((s = br.readLine()) != null) {
                                bw.write(s.replace('\t', ' ') + "\n");
                        }
                        br.close();
                        bw.close();
                }
                catch(Exception e) {
                        e.printStackTrace();
                }
        }
}

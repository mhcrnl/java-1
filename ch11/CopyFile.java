/*
 * CopyFile.java
 */

import java.io.*;

/**
 * CopyFileクラスです。
 */
public class CopyFile {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                if(args.length != 2) {
                        System.out.println("引数が不正です。");
                        System.exit(1);
                }
                try {
                        FileReader src = new FileReader(new File(args[0]));
                        FileWriter dst = new FileWriter(new File(args[1]));
                        int i;
                        while((i = src.read()) != -1) {
                               dst.write(i); 
                        }
                        src.close();
                        dst.close();
                }
                catch (Exception e) {
                        e.printStackTrace();
                }
        }
}

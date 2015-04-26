/*
 * FileRename.java
 */

import java.io.*;

/**
 * FileRenameクラスです。
 */
public class FileRename {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                if(args.length != 2) {
                        System.out.println("引数が不正です。");
                        System.exit(1);
                }
                File src = new File(args[0]);
                if(!src.renameTo(new File(args[1]))) {
                        System.out.println("名前の変更に失敗しました。");
                        System.exit(1);
                }
        }
}

/*
 * GetDate.java
 */

import java.util.*;

/**
 * GetDateクラスです。
 */
public class GetDate {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Date d = new Date();
                long l = d.getTime();
                System.out.println(l / 86400000);
        }
}

/*
 * After100Date.java
 */

import java.util.*;

/**
 * After100Dateクラスです。
 */
public class After100Date {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                long l = System.currentTimeMillis() + 86400000l * 100;
                Date d = new Date(l);
                System.out.println(d);
        }
}

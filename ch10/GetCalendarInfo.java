/*
 * GetCalendarInfo.java
 */

import java.util.*;

/**
 * GetCalendarInfoクラスです。
 */
public class GetCalendarInfo {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                GregorianCalendar gc = new GregorianCalendar();
                System.out.println("Year: " + gc.get(Calendar.YEAR));
                System.out.println("isLeapYear: " + gc.isLeapYear(gc.get(Calendar.YEAR)));
                System.out.println("Month: " + (gc.get(Calendar.MONTH) + 1));
                System.out.println("WeekOfYear: " + gc.get(Calendar.WEEK_OF_YEAR));
                System.out.println("WeekOfMonth: " + gc.get(Calendar.WEEK_OF_MONTH));
                System.out.println("DayOfYear: " + gc.get(Calendar.DAY_OF_YEAR));
                System.out.println("DayOfWeekInMonth: " + gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        }
}


/*
 * ShowCalendar.java
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * ShowCalendarクラスです。
 */
public class ShowCalendar {
	/**
	 * mainメソッドです。
	 * @param args コマンドライン引数（未使用）
	 */
	public static void main(String[] args) {
		GregorianCalendar current = new GregorianCalendar();
		GregorianCalendar first = new GregorianCalendar(current.get(Calendar.YEAR), current.get(Calendar.MONTH), 1);
		int firstDayOfWeek = first.get(Calendar.DAY_OF_WEEK);
		int date = 1;

		System.out.println(current.get(Calendar.YEAR) + " " + current.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("en")));
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

		for(int i = 1, l = current.getActualMaximum(Calendar.DAY_OF_MONTH); date <= l; ++i) {
			if (i < firstDayOfWeek) {
				System.out.print("\t");
			} else {
				System.out.print(date + "\t");
				++date;
				if (i % 7 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
	}
}

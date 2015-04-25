/*
 * GetRemainingDay.java
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * GetRemainingDayクラスです。
 */
public class GetRemainingDay {
	/**
	 * mainメソッドです。
	 * @param args コマンドライン引数（未使用）
	 */
	public static void main(String[] args) {
		GregorianCalendar c = new GregorianCalendar();
		int all = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int current = c.get(Calendar.DAY_OF_YEAR);
		System.out.println("Remaining Day: " + (all - current));
	}
}

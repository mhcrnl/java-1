/*
 * CountDownChristmas.java
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * CountDownChristmasクラスです。
 */
public class CountDownChristmas {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
	public static void main(String[] args) {
		GregorianCalendar current = new GregorianCalendar();
		int year = current.get(Calendar.YEAR);
		int countdown;

		if(current.get(Calendar.MONTH)+1 == 12 && current.get(Calendar.DATE) > 25) {
				++year;
		}
		GregorianCalendar christmas = new GregorianCalendar(year, 11, 25);

		if (year == current.get(Calendar.YEAR)) {
			countdown = christmas.get(Calendar.DAY_OF_YEAR) - current.get(Calendar.DAY_OF_YEAR);
		} else {
			countdown = current.getActualMaximum(Calendar.DAY_OF_YEAR) - current.get(Calendar.DAY_OF_YEAR) + christmas.get(Calendar.DAY_OF_YEAR);
		}
		System.out.println("Next Christmas: " + countdown);
	}
}

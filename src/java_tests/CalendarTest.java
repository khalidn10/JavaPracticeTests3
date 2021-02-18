package java_tests;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTest dt = new DateTest();
		
		long l = dt.method1();
		
		DateTest.main(args);
		
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("d/M/yyyy");
		System.out.println("Date only:\t" + sdf1.format(cal.getTime()));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("d/M/yyyy HH:mm:ss");
		System.out.println("Date & Time:\t" + sdf2.format(cal.getTime()));
		
		System.out.println("Day of Month:\t" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Minute:\t\t" + cal.get(Calendar.MINUTE));
		
	}

}

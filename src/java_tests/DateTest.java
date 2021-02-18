package java_tests;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public long method1()
	{
		long i = 0;
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//current date current time
		Date d = new Date();
		System.out.println("Default Date:\t" + d.toString());

		SimpleDateFormat sdf1 = new SimpleDateFormat("d/M/yyyy");
		System.out.println("Date only:\t" + sdf1.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("d/M/yyyy HH:mm:ss");
		System.out.println("Date & Time:\t" + sdf2.format(d));
	}

}

package day19_file;

import java.util.Calendar;
import java.util.Date;

public class Main1 {

	public static void main(String[] args) {
		//1. get the instance of Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		//2024-5-5 16:31:33
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		int sec =  c.get(Calendar.SECOND);
		System.out.println(year+"-"+month+"-"+date+" "+hour+":"+min+":"+sec);
	}

}


package js39_JavaCalender;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		Date d = c.getTime();
		System.out.println(d);
		
		Date d2 = new Date(1125034805687L);
		c.setTime(d2);
		
		c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int seconds = c.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초\n", year, month, day, hour, minute, seconds);
		
		
		

	}

}

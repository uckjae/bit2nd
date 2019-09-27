package yoon;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyCalendar {
	public static String date() {
		return new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
	}

	public static String time() {
		return new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
	}
}

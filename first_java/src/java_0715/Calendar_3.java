package java_0715;

import java.util.Calendar;
import java.util.Date;

public class Calendar_3 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		Date date = cal.getTime();
		
		System.out.println("오늘은 : " + date);
		System.out.println("오늘은 올해의 : " + cal.get(Calendar.DAY_OF_YEAR) + " 날 입니다.");
		System.out.println("오늘은 이번주의 : " + cal.get(Calendar.DAY_OF_WEEK) + " 일 입니다.");
		System.out.println("오늘은 올해의 : " + cal.get(Calendar.WEEK_OF_YEAR) + " 주 입니다.");
		System.out.println("오늘은 올해의 : " + cal.get(Calendar.DAY_OF_MONTH) + " 일 입니다.");
		//day 와 calendar 가 있는데 calendar 를 더 많이 쓴다(대중적이 됨)
	}

}

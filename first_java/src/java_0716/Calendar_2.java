package java_0716;

import java.util.Calendar;

public class Calendar_2 {
	public static void main(String[] args) {
		
		Calendar cal_1 = Calendar.getInstance();
		Calendar cal_2 = Calendar.getInstance();
		
		cal_1.set(2019, 7,  15, 16, 0);
		
		if (cal_1.after(cal_2)) {
			System.out.println("현재 시간은 2019, 7,  15 후 입니다.");
			
		} else if (cal_1.before(cal_2)) {
			System.out.println("현재 시간은 2019, 7,  15 전 입니다.");
			
		} else if (cal_1.equals(cal_2)) {
			System.out.println("현재 시간은 2019, 7,  15 일 입니다.");
					
		}
		
	}

}

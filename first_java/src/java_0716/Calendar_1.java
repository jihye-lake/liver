package java_0716;

import java.util.Calendar;

public class Calendar_1 {
	public static void main(String[] args) {
		
		Calendar cal_1 = Calendar.getInstance();  //instance 라는 method 를 통해서 객체를 생성
		//static Calendar 이기 때문에 .으로 접근이 가능함
		
		System.out.println("Calendar 클래스를 이용한 시간과 날짜");
		
		System.out.println(cal_1.get(Calendar.YEAR) + " 년");
		System.out.println((cal_1.get(Calendar.MONTH) +1) + " 월"); //자체적 index라서 +1 을 해줘야 함
		System.out.println(cal_1.get(Calendar.DATE) + " 일");
		System.out.println(cal_1.get(Calendar.HOUR) + " 시");
		System.out.println(cal_1.get(Calendar.MINUTE) + " 분");
		System.out.println(cal_1.get(Calendar.SECOND) + " 초");
	}

}

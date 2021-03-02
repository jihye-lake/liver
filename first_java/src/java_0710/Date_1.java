package java_0710;

import java.util.Date;

public class Date_1 {
	public static void main(String[] args) {
		Date date = new Date();  //Date 보다는 Calender를 권장한다
		
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		
		System.out.println("현재 시간은 : " + h + "시" + m + "분" + s + "초 입니다.");
		
		if(h > 12) {
			System.out.println("현재 시간은 : " + (h - 12) + "시" + m + "분" + s + "초 입니다.");
		} else {
			System.out.println("현재 시간은 : " + h + "시" + m + "분" + s + "초 입니다.");
			
		}
		
	}

}

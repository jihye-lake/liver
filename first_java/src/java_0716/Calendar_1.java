package java_0716;

import java.util.Calendar;

public class Calendar_1 {
	public static void main(String[] args) {
		
		Calendar cal_1 = Calendar.getInstance();  //instance ��� method �� ���ؼ� ��ü�� ����
		//static Calendar �̱� ������ .���� ������ ������
		
		System.out.println("Calendar Ŭ������ �̿��� �ð��� ��¥");
		
		System.out.println(cal_1.get(Calendar.YEAR) + " ��");
		System.out.println((cal_1.get(Calendar.MONTH) +1) + " ��"); //��ü�� index�� +1 �� ����� ��
		System.out.println(cal_1.get(Calendar.DATE) + " ��");
		System.out.println(cal_1.get(Calendar.HOUR) + " ��");
		System.out.println(cal_1.get(Calendar.MINUTE) + " ��");
		System.out.println(cal_1.get(Calendar.SECOND) + " ��");
	}

}

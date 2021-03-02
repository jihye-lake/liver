package java_0807;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {
	
	public static void main(String[] args) {  // ���ڸ� �� ���� �߶� ������ �ϱ�
		
		final int LIMIT = 10;
		
		String source = "0123456789abcdefghijklmABCDEFG@#$%^&*()ZZZ";
		
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10);  //  ũ�⸦ �ణ �����ְ�
		
		for (int i = 0; i < length; i+=LIMIT) {
			
			if (i+LIMIT < length) {
				
				list.add(source.substring(i,i+LIMIT)); // 0������ 10�ձ���, 20�ձ���, 30�ձ��� �̷�������
				
			} else
				list.add(source.substring(i));  // �������� ������
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
	}

}

package java_0807;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3_1 {  // �տ� Integer Ÿ���� String Ÿ������ �ٲٱ�
	public static void main(String[] args) {
		
		ArrayList<String> numbers = new ArrayList<String>();  // Integer �� �����ص� ��
		
		numbers.add("10");
		numbers.add("20");
		numbers.add("30");
		numbers.add("40");
		System.out.println("add(��)");
		System.out.println(numbers);
		
		numbers.add(1,"50");  // 1�� ��ġ�� 50�� ����־��
		System.out.println("\nadd(�ε���, ��");
		System.out.println(numbers);
		
		numbers.set(0, "0");
		System.out.println("\nset(�ε���, ��");
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println("\nremove(�ε���)");
		System.out.println(numbers);
		
		System.out.println("\nget(�ε���)");
		System.out.println(numbers.get(2));  // 2�� �ε��� ȣ��
		
		System.out.println("\nsize()");
		System.out.println(numbers.size());
		
		System.out.println("\nindexOf()");
		System.out.println(numbers.indexOf("30"));  // 30�� �� ��° �ε����� �ִ���
																		 // -1 �ߴ� �� �� �ش簪�� ���ٴ� ����
		
		Iterator it = numbers.iterator();
		System.out.println("\niterator");
		while (it.hasNext()) {
			String value = (String) it.next();
			if (value.equals("30")) {  // value �� 30�̶��
				it.remove();  // 30�� ����������
			}
			System.out.println(value);
		}
		System.out.println(numbers);
		
		System.out.println("\nfor each");
		for (String value : numbers) {  // ���� for���� �Ϲ����� for�� ���غ���(���� for���� �迭�� Collection ������ ��)
			System.out.println(value);
			
		}
		System.out.println("\nfor");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
			
		}
	}

}
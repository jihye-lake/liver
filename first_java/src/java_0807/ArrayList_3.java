package java_0807;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();  // Integer �� �����ص� ��
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("add(��)");
		System.out.println(numbers);
		
		numbers.add(1,50);  // 1�� ��ġ�� 50�� ����־��
		System.out.println("\nadd(�ε���, ��");
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println("\nremove(�ε���)");
		System.out.println(numbers);
		
		System.out.println("\nget(�ε���)");
		System.out.println(numbers.get(2));  // 2�� �ε��� ȣ��
		
		System.out.println("\nsize()");
		System.out.println(numbers.size());
		
		System.out.println("\nindexOf()");
		System.out.println(numbers.indexOf(30));  // 30�� �� ��° �ε����� �ִ���
		
		Iterator it = numbers.iterator();
		System.out.println("\niterator");
		while (it.hasNext()) {
			int value = (int) it.next();
			if (value == 30) {  // value �� 30�̶��
				it.remove();  // 30�� ����������
			}
			System.out.println(value);
		}
		System.out.println(numbers);
		
		System.out.println("\nfor each");
		for (int value : numbers) {  // ���� for���� �Ϲ����� fot�� ���غ���(���� for���� �迭�� Collection ������ ��
			System.out.println(value);
			
		}
		System.out.println("\nfor");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
			
		}
	}

}

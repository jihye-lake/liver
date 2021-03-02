package java_0807;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {
	public static void main(String[] args) {  // �ڿ� ������ set������ �ߺ��� ������� ������
		
		ArrayList list_1 = new ArrayList(10);
		
		list_1.add(new Integer(5));
		list_1.add(new Integer(4));
		list_1.add(new Integer(3));  // ���⼭�� �̷��� �ߺ��� ����Ѵ�.
		list_1.add(new Integer(2));
		list_1.add(new Integer(0));
		list_1.add(new Integer(1));
		list_1.add(new Integer(3));  // ���⼭�� �̷��� �ߺ��� ����Ѵ�.
		
		ArrayList list_2 = new ArrayList(list_1.subList(1, 4));  // list_1 �� 1���� �����ؼ� 4���� �־����
		
		print(list_1, list_2);  // �ڵ����� ���ȣ�� ���� ����� ��
		
		Collections.sort(list_1);  // ������������ ���Ľ�Ų�ٴ� ��
		Collections.sort(list_2);  // ������������ ���Ľ�Ų�ٴ� ��
		print(list_1, list_2);
		
		System.out.println("list_1.containsAll(list_2) : " + list_1.containsAll(list_2)); 
									// list_1 �� list_2 �� ���� ��� ���� �ִ���? true
		
		list_2.add("B");
		list_2.add("C");
		list_2.add("A");
		
		print(list_1, list_2);
		System.out.println("list_1.retainAll(list_2) : " + list_1.containsAll(list_2));  
										// BCA �� �߰��Ǵϱ� ��� ���� �ִ°� �ƴ�
		
		list_2.set(3, "Queen");  // �� ��°�� Queen ���� �ٲپ��
		print(list_1, list_2);
		
		System.out.println("list_1.retainAll(list_2) : " + list_1.retainAll(list_2));
										// list_1 ���� list_2 �� ��ġ�� �κи� ����� ������ ����
		print(list_1,list_2);
		

		
		for (int i = list_2.size()-1; i >= 0; i--) {		// list_2 ���� list_1 �� ���Ե� ��ü���� ����
			if (list_1.contains(list_2.get(i))) {
				list_2.remove(i);
			}
			
		}
		print(list_1,list_2);
		
	}

	private static void print(ArrayList list_1, ArrayList list_2) {
	// � �Ű������� �ݵ�� int �� String �� �ƴ϶� class�� �Ű������� �� �� ����(�ּҸ� ����ų �� �����ϱ�)
		
		System.out.println("list_1 : " + list_1);
		System.out.println("list_2 : " + list_2);
		System.out.println();
				
	}

}

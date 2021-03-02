package java_0808;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedListTest_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add("QUEEN");
		list.add(1, "APPLE"); 					// �ε��� 1�� "APPLE" �� ����(BREAD�� �з������� 2���� ��)
		list.set(2, "GRAPE"); 					// �ε��� 2�� ���Ҹ� "GRAPE" �� ��ü(2������ �� BREAD �� GRAPE �� ��ü��)
		list.remove(3); 							// �ε��� 3�� ���Ҹ� �����Ѵ�.

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
			
			System.out.println();

			for (String str : list)  //  list �� ��� ���� str ��(���� for�� ����)
				System.out.println(str);
			
			System.out.println();

			Iterator ee = list.iterator();
			while (ee.hasNext()) {
				Object obj = ee.next();
				System.out.println(obj);
			}

		}
	}
package java_0808;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class LinkedListTest_Vector {
	public static void main(String[] args) {
		Vector <String> list = new Vector <String>();  // String �� ���� �������Ƿ� String �� ���ٴ� ���̴�(�� ���� ���ʸ�)

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
			
			Enumeration enu = list.elements();  // �����ڷ�

			while (enu.hasMoreElements()) {  // ���� ���
				Object obj = enu.nextElement();
				System.out.print(obj);
				System.out.println();

//			Iterator ee = list.iterator();
//			while (ee.hasNext()) {
//				Object obj = ee.next();
//				System.out.println(obj);
//			}

		}
	}
}
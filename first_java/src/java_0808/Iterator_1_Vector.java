package java_0808;

import java.util.Enumeration;
import java.util.Vector;

public class Iterator_1_Vector {
	public static void main(String[] args) {
		
		Vector list = new Vector();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("������");
		list.add("010 8977 1838");
		list.add("����Ư���� ������");
		
		
		Enumeration enu = list.elements();  // �����ڷ�

		while (enu.hasMoreElements()) {  // ���� ���
			Object obj = enu.nextElement();
			System.out.print(obj);
			System.out.println();
			
			
		
//		Iterator itt = list.iterator();
//		
//		while (itt.hasNext()) {
//			Object obj = itt.next();
//			System.out.println(obj);
//		}
		}
	}
}
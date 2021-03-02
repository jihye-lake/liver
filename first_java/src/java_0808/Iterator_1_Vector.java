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
		list.add("최지혜");
		list.add("010 8977 1838");
		list.add("서울특별시 광진구");
		
		
		Enumeration enu = list.elements();  // 열거자료

		while (enu.hasMoreElements()) {  // 예전 방법
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
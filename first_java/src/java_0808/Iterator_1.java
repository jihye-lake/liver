package java_0808;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_1 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("������");
		list.add("010 8977 1838");
		list.add("����Ư���� ������");
		
		Iterator itt = list.iterator();
		
		while (itt.hasNext()) {
			Object obj = itt.next();
			System.out.println(obj);
		}
		
	}

}

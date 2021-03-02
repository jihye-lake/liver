package java_0807;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_2 {
	
	public static void main(String[] args) {
		
		int i;
		
		Date date = new Date();
		
		Vector vv = new Vector(3, 5); // �ʱ�뷮 : 3, ����ġ : 5
		
		vv.addElement("Java");
		vv.add(new Double(56.7));
		vv.addElement(date);
		
		System.out.println("============= 3���� ��ü �߰� =============");
		
		System.out.println("size1 : " +vv.size()+ ", capacity : " +vv.capacity());
		
		System.out.println();
		
		for (int j = 0; j < 10 ; j++) {
			
			vv.add(new Integer(j+1));
			
			vv.add("korea");
		}
		
		System.out.println("============= 10���� ��ü �߰� =============");
		System.out.println("size2 : " +vv.size()+ ", capacity : " +vv.capacity());
		
		System.out.println();
		
		System.out.println("----------------------Vector ���� ���----------------------");
		Enumeration enu = vv.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + " ");
			
		}
		
		System.out.println("============== ��ü ���� Ȯ�� ==============");
		
		if (vv.contains("Java")) {
			System.out.println("Java ���ڿ� ���Ե�");
			
		} else
			System.out.println("Java ���ڿ� ���� �ȵǾ־־־�");
		
		System.out.println("56.7 ��ü ��ġ" + vv.indexOf(new Double(56.7)));
		System.out.println("\n �Է� �ð� : " + vv.get(vv.indexOf(date)));
		
		// date ��ü ����
		
		vv.removeElementAt(vv.lastIndexOf(date));
		
		for (int j = 0; j < vv.size(); j += 3) {
			
			vv.removeElementAt(j);  // ����
			
		}
		
		vv.setElementAt("korea", 2); // 3 ��° ��ġ�� korea ���ڿ� �߰�
		
		enu = vv.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + " ");
			
		}
		
		System.out.println("\n size : " +vv.size()+ ", capacity : " +vv.capacity());
		
		vv.trimToSize(); // ���� ����
		System.out.println("\n size : " + vv.size() + ", capacity : " + vv.capacity());
		
		vv.setSize(2);  // ũ�⸦ 2�� ����
		
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + " ");
			
		}
		
		vv.removeAllElements(); // ��� ��ü ����
		System.out.println("\n size : " + vv.size() + ", capacity : " + vv.capacity());
		
	}

}

package java_0807;

import java.util.Vector;

public class Vector_1 {
	
	public static void main(String[] args) {
		
		Vector vv = new Vector(5); // capacity �� 5�� Vector
		
		vv.add("1");
		vv.add("2");
		vv.add("3");
//		vv.add("4");
//		vv.add("5");
		
		print(vv);
		
		vv.trimToSize(); // �� ������ ���ش�. �뷮�� ũ�Ⱑ ���� ����.
		
		print(vv);
		
		vv.ensureCapacity(7);  // Vector �� �뷮�� �ּ��� minCapacity �� �ǵ��� �Ѵ�.
		print(vv);
		
		vv.setSize(8);
		print(vv);
		
		vv.clear();
		print(vv);
		
	}
	
	private static void print(Vector vv) {
		System.out.println(vv);
		System.out.println("vv.size : " + vv.size());
		System.out.println("vv.capacity : " + vv.capacity());
		System.out.println("=========================");
	}

}

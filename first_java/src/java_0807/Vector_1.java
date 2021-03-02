package java_0807;

import java.util.Vector;

public class Vector_1 {
	
	public static void main(String[] args) {
		
		Vector vv = new Vector(5); // capacity 가 5인 Vector
		
		vv.add("1");
		vv.add("2");
		vv.add("3");
//		vv.add("4");
//		vv.add("5");
		
		print(vv);
		
		vv.trimToSize(); // 빈 공간을 없앤다. 용량과 크기가 같아 진다.
		
		print(vv);
		
		vv.ensureCapacity(7);  // Vector 의 용량이 최소한 minCapacity 가 되도록 한다.
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

package java_0807;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_2 {
	
	public static void main(String[] args) {
		
		int i;
		
		Date date = new Date();
		
		Vector vv = new Vector(3, 5); // 초기용량 : 3, 증가치 : 5
		
		vv.addElement("Java");
		vv.add(new Double(56.7));
		vv.addElement(date);
		
		System.out.println("============= 3개의 객체 추가 =============");
		
		System.out.println("size1 : " +vv.size()+ ", capacity : " +vv.capacity());
		
		System.out.println();
		
		for (int j = 0; j < 10 ; j++) {
			
			vv.add(new Integer(j+1));
			
			vv.add("korea");
		}
		
		System.out.println("============= 10개의 객체 추가 =============");
		System.out.println("size2 : " +vv.size()+ ", capacity : " +vv.capacity());
		
		System.out.println();
		
		System.out.println("----------------------Vector 내용 출력----------------------");
		Enumeration enu = vv.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + " ");
			
		}
		
		System.out.println("============== 객체 포함 확인 ==============");
		
		if (vv.contains("Java")) {
			System.out.println("Java 문자열 포함됨");
			
		} else
			System.out.println("Java 문자열 포함 안되애애애앰");
		
		System.out.println("56.7 객체 위치" + vv.indexOf(new Double(56.7)));
		System.out.println("\n 입력 시간 : " + vv.get(vv.indexOf(date)));
		
		// date 객체 삭제
		
		vv.removeElementAt(vv.lastIndexOf(date));
		
		for (int j = 0; j < vv.size(); j += 3) {
			
			vv.removeElementAt(j);  // 제거
			
		}
		
		vv.setElementAt("korea", 2); // 3 번째 위치에 korea 문자열 추가
		
		enu = vv.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + " ");
			
		}
		
		System.out.println("\n size : " +vv.size()+ ", capacity : " +vv.capacity());
		
		vv.trimToSize(); // 공백 제거
		System.out.println("\n size : " + vv.size() + ", capacity : " + vv.capacity());
		
		vv.setSize(2);  // 크기를 2로 조정
		
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + " ");
			
		}
		
		vv.removeAllElements(); // 모든 객체 제거
		System.out.println("\n size : " + vv.size() + ", capacity : " + vv.capacity());
		
	}

}

package java_0808;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class LinkedListTest_Vector {
	public static void main(String[] args) {
		Vector <String> list = new Vector <String>();  // String 을 따로 써줬으므로 String 만 쓴다는 뜻이다(안 쓰면 제너릭)

		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add("QUEEN");
		list.add(1, "APPLE"); 					// 인덱스 1에 "APPLE" 을 삽입(BREAD가 밀려나가서 2번이 됨)
		list.set(2, "GRAPE"); 					// 인덱스 2의 원소를 "GRAPE" 로 대체(2번으로 간 BREAD 가 GRAPE 로 대체됨)
		list.remove(3); 							// 인덱스 3의 원소를 삭제한다.

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
			
			System.out.println();

			for (String str : list)  //  list 의 모든 것을 str 로(향상된 for문 쓰기)
				System.out.println(str);
			
			System.out.println();
			
			Enumeration enu = list.elements();  // 열거자료

			while (enu.hasMoreElements()) {  // 예전 방법
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
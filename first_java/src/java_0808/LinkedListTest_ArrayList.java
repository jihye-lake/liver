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

			Iterator ee = list.iterator();
			while (ee.hasNext()) {
				Object obj = ee.next();
				System.out.println(obj);
			}

		}
	}
package java_0807;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {
	public static void main(String[] args) {  // 뒤에 나오는 set에서는 중복을 허용하지 않지만
		
		ArrayList list_1 = new ArrayList(10);
		
		list_1.add(new Integer(5));
		list_1.add(new Integer(4));
		list_1.add(new Integer(3));  // 여기서는 이렇게 중복을 허용한다.
		list_1.add(new Integer(2));
		list_1.add(new Integer(0));
		list_1.add(new Integer(1));
		list_1.add(new Integer(3));  // 여기서는 이렇게 중복을 허용한다.
		
		ArrayList list_2 = new ArrayList(list_1.subList(1, 4));  // list_1 에 1부터 시작해서 4까지 넣어줘라
		
		print(list_1, list_2);  // 자동으로 대괄호도 만들어서 출력해 줌
		
		Collections.sort(list_1);  // 오름차순으로 정렬시킨다는 뜻
		Collections.sort(list_2);  // 오름차순으로 정렬시킨다는 뜻
		print(list_1, list_2);
		
		System.out.println("list_1.containsAll(list_2) : " + list_1.containsAll(list_2)); 
									// list_1 은 list_2 의 값을 모두 갖고 있느냐? true
		
		list_2.add("B");
		list_2.add("C");
		list_2.add("A");
		
		print(list_1, list_2);
		System.out.println("list_1.retainAll(list_2) : " + list_1.containsAll(list_2));  
										// BCA 가 추가되니까 모두 갖고 있는게 아님
		
		list_2.set(3, "Queen");  // 세 번째를 Queen 으로 바꾸어라
		print(list_1, list_2);
		
		System.out.println("list_1.retainAll(list_2) : " + list_1.retainAll(list_2));
										// list_1 에서 list_2 와 겹치는 부분만 남기고 나머지 삭제
		print(list_1,list_2);
		

		
		for (int i = list_2.size()-1; i >= 0; i--) {		// list_2 에서 list_1 에 포함된 객체들을 삭제
			if (list_1.contains(list_2.get(i))) {
				list_2.remove(i);
			}
			
		}
		print(list_1,list_2);
		
	}

	private static void print(ArrayList list_1, ArrayList list_2) {
	// 어떤 매개변수가 반드시 int 나 String 이 아니라 class도 매개변수가 될 수 있음(주소를 가리킬 수 있으니까)
		
		System.out.println("list_1 : " + list_1);
		System.out.println("list_2 : " + list_2);
		System.out.println();
				
	}

}

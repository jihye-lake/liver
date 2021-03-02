package java_0807;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3_1 {  // 앞에 Integer 타입을 String 타입으로 바꾸기
	public static void main(String[] args) {
		
		ArrayList<String> numbers = new ArrayList<String>();  // Integer 를 생략해도 됨
		
		numbers.add("10");
		numbers.add("20");
		numbers.add("30");
		numbers.add("40");
		System.out.println("add(값)");
		System.out.println(numbers);
		
		numbers.add(1,"50");  // 1번 위치에 50을 집어넣어라
		System.out.println("\nadd(인덱스, 값");
		System.out.println(numbers);
		
		numbers.set(0, "0");
		System.out.println("\nset(인덱스, 값");
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println("\nremove(인덱스)");
		System.out.println(numbers);
		
		System.out.println("\nget(인덱스)");
		System.out.println(numbers.get(2));  // 2번 인덱스 호출
		
		System.out.println("\nsize()");
		System.out.println(numbers.size());
		
		System.out.println("\nindexOf()");
		System.out.println(numbers.indexOf("30"));  // 30은 몇 번째 인덱스에 있느냐
																		 // -1 뜨는 건 그 해당값이 없다는 뜻임
		
		Iterator it = numbers.iterator();
		System.out.println("\niterator");
		while (it.hasNext()) {
			String value = (String) it.next();
			if (value.equals("30")) {  // value 가 30이라면
				it.remove();  // 30을 지워버려라
			}
			System.out.println(value);
		}
		System.out.println(numbers);
		
		System.out.println("\nfor each");
		for (String value : numbers) {  // 향상된 for문과 일반적인 for문 비교해보기(향상된 for문은 배열과 Collection 에서만 씀)
			System.out.println(value);
			
		}
		System.out.println("\nfor");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
			
		}
	}

}
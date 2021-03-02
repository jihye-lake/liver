package java_0812;

import java.util.HashMap;
import java.util.Map;

class Student {
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name; 					 // number 은 안 나오고 name 만 나오고 있음
//		return "" + number;		// 만약 name 대신 number 만 쓴다면 이름대신에 전부 number 만 나올 것임
											// 앞에 "" + 를 해주어서 String 에 맞게 씀
	}
}

public class MapTest {
	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20090001", new Student(20290001, "김태리"));
		st.put("20090002", new Student(20290002, "메건라피노"));
		st.put("20090003", new Student(20290003, "루비로즈"));
		st.put("20090004", new Student(202900034, "소소"));
		
		// 모든 항목을 출력한다.
		System.out.println(st);
		
		// 하나의 항목을 삭제한다.
		st.remove("20090002");
		// 하나의 항목을 대치한다.
		st.put("20090003", new Student(20090003, "로라프리폰"));
		// 값을 참조한다.
		System.out.println(st.get("20090003"));
		// 모든 항목을 반복한다.
		for (Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
			
		}
	}
}

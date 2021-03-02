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
		return name; 					 // number �� �� ������ name �� ������ ����
//		return "" + number;		// ���� name ��� number �� ���ٸ� �̸���ſ� ���� number �� ���� ����
											// �տ� "" + �� ���־ String �� �°� ��
	}
}

public class MapTest {
	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20090001", new Student(20290001, "���¸�"));
		st.put("20090002", new Student(20290002, "�ްǶ��ǳ�"));
		st.put("20090003", new Student(20290003, "������"));
		st.put("20090004", new Student(202900034, "�Ҽ�"));
		
		// ��� �׸��� ����Ѵ�.
		System.out.println(st);
		
		// �ϳ��� �׸��� �����Ѵ�.
		st.remove("20090002");
		// �ϳ��� �׸��� ��ġ�Ѵ�.
		st.put("20090003", new Student(20090003, "�ζ�������"));
		// ���� �����Ѵ�.
		System.out.println(st.get("20090003"));
		// ��� �׸��� �ݺ��Ѵ�.
		for (Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
			
		}
	}
}

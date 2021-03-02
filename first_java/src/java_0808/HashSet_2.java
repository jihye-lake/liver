package java_0808;

import java.util.HashSet;

public class HashSet_2 {
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");  // �ߺ��� ������� �ʱ� ������ �ϳ��� ����
		
		set.add(new Queen("������",90));
		set.add(new Queen("������",90));  // �ߺ��� ����ϱ� ������ �� ���� �� ����
		
		System.out.println(set);
	}

}

class Queen {
	String name;
	int age;
	
	Queen(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " : " + age;
	}
}

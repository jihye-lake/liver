package java_0808;

import java.util.HashSet;

public class HashSet_2_1 {  // ������, 90�� �ߺ����� �ϳ��� ������ �ϱ�
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");  // �ߺ��� ������� �ʱ� ������ �ϳ��� ����
		
		set.add(new Queen1("������",90));
		set.add(new Queen1("������",90));  // �ߺ��� ����ϱ� ������ �� ���� �� ����
		
		System.out.println(set);
	}

}

class Queen1 {
	String name;
	int age;
	
	Queen1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {			//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤ� �ߺ��� ������� �ʴ�
		if (obj instanceof Queen1) {
			Queen1 tmp = (Queen1)obj;
			return name.equals(tmp.name) && age == tmp.age;
			
		}
		
		return false;
	}
	
	public int hashCode() {
		return name.hashCode() + age;		//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ� �ڵ���
	}
	
	public String toString() {
		return name + " : " + age;
	}
}

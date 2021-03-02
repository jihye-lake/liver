package java_0808;

import java.util.HashSet;

public class HashSet_2 {
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");  // 중복을 허용하지 않기 때문에 하나만 나옴
		
		set.add(new Queen("최지혜",90));
		set.add(new Queen("최지혜",90));  // 중복을 허용하기 때문에 두 개가 다 나옴
		
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

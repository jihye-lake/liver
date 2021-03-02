package java_0808;

import java.util.HashSet;

public class HashSet_2_1 {  // 최지혜, 90도 중복되지 하나만 나오게 하기
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");  // 중복을 허용하지 않기 때문에 하나만 나옴
		
		set.add(new Queen1("최지혜",90));
		set.add(new Queen1("최지혜",90));  // 중복을 허용하기 때문에 두 개가 다 나옴
		
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
	
	public boolean equals(Object obj) {			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 중복을 허용하지 않는
		if (obj instanceof Queen1) {
			Queen1 tmp = (Queen1)obj;
			return name.equals(tmp.name) && age == tmp.age;
			
		}
		
		return false;
	}
	
	public int hashCode() {
		return name.hashCode() + age;		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 코드임
	}
	
	public String toString() {
		return name + " : " + age;
	}
}

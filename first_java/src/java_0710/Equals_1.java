package java_0710;

class Kbs {
	int number;
	
	public Kbs(int num) {
		
		number = num;
		
	}
}

public class Equals_1 {
	public static void main(String[] args) {
		
		Kbs obj_1 = new Kbs(10);
		Kbs obj_2 = new Kbs(10);
		
		if (obj_1.equals(obj_2)) {  //new 를 썼기 때문에 다른 공간에 만들어지므로 주소가 달라짐
			System.out.println("obj_1 과 obj_2 는 같다.");
			
		} else
			System.out.println("obj_1 과 obj_2 는 다르다.");
		
		System.out.println("$$" + obj_1.hashCode());  //해시코드로 비교해 보면 된다
		System.out.println("$$" + obj_2.hashCode());
		
		obj_2 = obj_1;  //대입하게 되므로 같은 곳을 가리키게 되고, 둘은 같아짐
		
		if (obj_1.equals(obj_2)) {
			System.out.println("obj_1 과 obj_2 는 같다.");
			
		} else
			System.out.println("obj_1 과 obj_2 는 다르다.");
		
		System.out.println("&&" + obj_1.hashCode());
		System.out.println("&&" + obj_2.hashCode());
		}
		
	}


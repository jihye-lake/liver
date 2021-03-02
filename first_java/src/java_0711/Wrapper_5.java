package java_0711;

public class Wrapper_5 {
	public static void main(String[] args) {
		
		Boolean bool_1 = new Boolean(true);
		Boolean bool_2 = new Boolean("345"); //true 아니면 false 를 써야하는데 그 외에 다른 수를 쓰면 false 가 나온다.
		
		if (bool_1.booleanValue()) {
			System.out.println("bool_1 객체는 true 입니다.");
			
		} else 
			System.err.println("bool_1 객체는 flase 입니다.");		
		
		if (bool_2.booleanValue()) {
			System.out.println("bool_2 객체는 true 입니다.");
			
		} else 
			System.err.println("bool_2 객체는 flase 입니다.");		
		
	}

}

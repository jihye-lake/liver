package java_0704;

public class Exception_3 {
	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		
		for(int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random()*10);  //e.printStack을 입력했을 때 나오는 에러는 '불능' 이나 '부정' 나와서 그런 것
			} catch (ArithmeticException e) {  //0은 exception 처리가 되고 나머지는 열 번.
				//System.out.println("0");  //0이 안나오게 하고 싶으면 0을 찍는다(대신 '첫번째' 에는 0이 나올 수 있다)
			}
			
			System.out.println(result);
		}
		
	}

}

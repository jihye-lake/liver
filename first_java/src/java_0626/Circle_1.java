package java_0626;

public class Circle_1 {
	
	public static void main(String[] args) { 
		
		final float PI = 3.1415f;   //  final 이 아닌 변수는 몇 번이든 바꿀 수 있음(final 쓰는 순간에 문자가 아니라 숫자로 인식 - 값을 바꿀 수 없음)
		
		/* char cm = '\u339D';
		char cm2 = '\u33A0'; */  // 변수선언 안 하고 그냥 적어도 됨.
		
		int r = 13;
		
		// PI = 5.345f;  이걸 쓰려면 final 을 없애야 함
		
		double area = PI * r * r;
		double Round = 2 * PI * r; 
		
	/*	System.out.print("원의 넓이 : ");
		System.out.printf("%7.2f" , area);
		System.out.println('\u33A0');
		System.out.print("원의 둘레 : ");		이렇게 해도 되고, 밑에 처럼 해도 됨.
		System.out.printf("%7.2f" , Round);
		System.out.println('\u339D');   */
		
		System.out.printf("원의 넓이 : %7.2f \u33A0" , area);
		System.out.printf("\n원의 넓이 : %7.2f \u339D" , Round);
		
	}

}

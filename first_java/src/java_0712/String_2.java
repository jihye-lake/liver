package java_0712;

public class String_2 {
	public static void main(String[] args) {
		
		int ii = 77;
		float ff = 45.78f;
		
		String str = "점수 : ";
		
		System.out.println(str + ii + ',' + ff); //String 더하기 숫자연산은 String
															//String 더하기 char 는 String
		System.out.println( 2 + 0 + 1 + 9 +  "년"); //숫자가 앞에 있으면 숫자 연산 먼저한다
		System.out.println("월드컵 : " + 2 + 0 + 1 + 9 ); //스트링이 먼저 있고 그 다음숫자가 오면 String 연산
		
	}
	

}

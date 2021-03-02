package java_0711;

public class Wrapper_9 {
	public static void main(String[] args) {
		
		int ss_data = 0;
		
		short max = Short.MAX_VALUE;
		short min = Short.MIN_VALUE;
		
//		Short ss = new Short("888"); //대문자로 쓴 건 class 소문자로 쓴 건 keyword
//		ss_data = ss.intValue(); //이 두 줄은 아래처럼 한 줄로 표현할 수 있음
		
		int ss_data1 = new Short("888").shortValue();
		
		System.out.println("ss_data : " + ss_data1 + ", 최대값 : " +max+ " 최소값 : " + min);
		
		//2의 보수체계 사용
	}

}

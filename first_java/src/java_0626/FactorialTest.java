package java_0626;

public class FactorialTest {
	
	public static void main(String[] args) {
		
		System.out.println(factorial(5));  //  main 에서 method factorial 을 소환했다는 뜻
		
	}

	private static long factorial(int num) {   //  재귀함수(자기자신이 자기자신을 부르는 함수)
		
		long result = 0;
		
		if (num == 1) {
			result = 1;
		}
		
		else {
			result = num * factorial(num - 1);
		}
		
		return result;
	}

}

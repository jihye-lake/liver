package java_0626;

public class FactorialTest {
	
	public static void main(String[] args) {
		
		System.out.println(factorial(5));  //  main ���� method factorial �� ��ȯ�ߴٴ� ��
		
	}

	private static long factorial(int num) {   //  ����Լ�(�ڱ��ڽ��� �ڱ��ڽ��� �θ��� �Լ�)
		
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

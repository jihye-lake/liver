package java_0715;

public class String_15 {
	public static void main(String[] args) {
		
		String[] numbers = {"1","2","3","4","5"};
		String result_1 = "";
		int result_2 = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			result_1 += numbers[i];  //���ڿ��� ���ʴ�� �������� ����
			result_2 += Integer.parseInt(numbers[i]);  //���ڿ��� int �� �ٲ㼭 �������� ���ؼ� ���� ����
		}
		
		System.out.println("result_1 : " + result_1);
		System.out.println("result_2 : " + result_2);
		
	}

}

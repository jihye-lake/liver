package java_0704;

public class Exception_3 {
	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		
		for(int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random()*10);  //e.printStack�� �Է����� �� ������ ������ '�Ҵ�' �̳� '����' ���ͼ� �׷� ��
			} catch (ArithmeticException e) {  //0�� exception ó���� �ǰ� �������� �� ��.
				//System.out.println("0");  //0�� �ȳ����� �ϰ� ������ 0�� ��´�(��� 'ù��°' ���� 0�� ���� �� �ִ�)
			}
			
			System.out.println(result);
		}
		
	}

}

package java_0626;

public class Circle_1 {
	
	public static void main(String[] args) { 
		
		final float PI = 3.1415f;   //  final �� �ƴ� ������ �� ���̵� �ٲ� �� ����(final ���� ������ ���ڰ� �ƴ϶� ���ڷ� �ν� - ���� �ٲ� �� ����)
		
		/* char cm = '\u339D';
		char cm2 = '\u33A0'; */  // �������� �� �ϰ� �׳� ��� ��.
		
		int r = 13;
		
		// PI = 5.345f;  �̰� ������ final �� ���־� ��
		
		double area = PI * r * r;
		double Round = 2 * PI * r; 
		
	/*	System.out.print("���� ���� : ");
		System.out.printf("%7.2f" , area);
		System.out.println('\u33A0');
		System.out.print("���� �ѷ� : ");		�̷��� �ص� �ǰ�, �ؿ� ó�� �ص� ��.
		System.out.printf("%7.2f" , Round);
		System.out.println('\u339D');   */
		
		System.out.printf("���� ���� : %7.2f \u33A0" , area);
		System.out.printf("\n���� ���� : %7.2f \u339D" , Round);
		
	}

}

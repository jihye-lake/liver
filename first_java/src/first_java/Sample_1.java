package first_java;



public class Sample_1 {
	
	double x;  //  ��� ����
	double y;  //  ��� ����
	
	public Sample_1(double a, double b) {  //  ������(�����ڴ� ���� Ÿ���� ���� �̰��� �޼ҵ�� �����ڸ� �����ϴ� ��)
										   //  �����ڴ� Ŭ���� �̸��� ����.
		
		x = a;
		y = b;
	}
	
	public double add()  //  ��� �޼ҵ�
	{
		return (x + y);
	}
	
	public double sub()  //  ��� �޼ҵ�
	{
		return (x - y);
	}
	
	public double mul()  //  ��� �޼ҵ�
	{
		return (x * y);
	}
	
	public double div()  //  ��� �޼ҵ�
	{
		return (x / y);
	}
	
	public double mod()  //  ��� �޼ҵ�
	{
		return (int)(x % y);
	}
	
	
	
	public static void main(String[] args) {  //  ��� �޼ҵ� (main �ִ� ���� ������)
		
		Sample_1 sample = new Sample_1(45.67,13.5);  //  ������ �ʱ�ȭ
     // Ŭ����  ��ü��������      ������ ȣ��(�� ���� ������ ����� ���̴�) ��ü�� Heap ������ ���������.
		
		System.out.println("���ϱ� : " + sample.add());
		System.out.println("��  �� : " + sample.sub());
		System.out.println("���ϱ� : " + sample.mul());
		System.out.println("������ : " + sample.div());
		System.out.println("������ : " + sample.mod());
		
	}

}

package java_0701;

class Super_1
{
	public void display()
	
	{
		System.out.println("Super_1 Ŭ������ display �޼ҵ�");
	}
	
	protected void message()
	{		
		System.out.println("Super_1 Ŭ������ message �޼ҵ�");
	}
	
	void print()
	{
		System.out.println("Super_1 Ŭ������ print �޼ҵ�");
	}
	
	private void show()  //private ���� ����� �޼ҵ� show�� Super_1Ŭ���� �ȿ����� ����� �� �ִ�.
	{							  //����ϰ��� �Ѵٸ� private ��ſ� public �̳� default ������ �ٸ��� ��������� �Ѵ�.
		System.out.println("Super_1 Ŭ������ show �޼ҵ�");
	}
}

public class Method_1 extends Super_1{  //��Ӱ��谡 �ƴϾ��� ���� ��밡���ߴ� ������ ���� package �� ����־��� �����̴�.
															//�ٸ� package �� ��� �־��ٸ� default ���� ������ �ʾҴ�.
	public static void main(String[] args) {
		
		Super_1 obj = new Super_1();  //��ü ����
		
		obj.display();
		obj.message();
		obj.print();
		//obj.show();  //private ���� ����Ǿ� �ֱ� ������ Super_1 Ŭ���� ���ο����� ����� �� �ִ�.
		// setter �� ���� �ٲٰ� getter �� ���� �ҷ���.
		
	}

}

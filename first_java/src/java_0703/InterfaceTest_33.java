package java_0703;

interface AAA
{
	public void print11();
}

class BBB implements AAA
{
	@Override
	public void print11()
	{
		System.out.println("AAA Interface Method Overriding");
	}
	
	public void print222()
	{
		System.out.println("BBB Class Method");
	}
}

public class InterfaceTest_33 {
	public static void main(String[] args) {
		
		BBB obj_1 = new BBB();
		
		obj_1.print11();
		obj_1.print222();
		
		System.out.println("=======================");
		
		AAA obj_2 = new BBB();  //�������̽� ����ȯ(BBB���¸� AAA�� ��ȯ)
		
		obj_2.print11();
		//obj_2.print222();  //���� �� ����(BBBŬ���� ��ü�� AAA�� ����ȯ �Ʊ� ������ BBB���� ���� �� ����
								  //Overriding �� print11 �� ���� �� ����
	}

}

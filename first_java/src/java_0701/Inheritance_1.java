package java_0701;

class AA_6
{
	AA_6()
	{
		System.out.println("AA_6 ������ ���� @@@");		
	}
}

class BB_6 extends AA_6  //BB_6 Ŭ������ �ּҰ��� @6d06d69c
{
	BB_6()
	{
		System.out.println("BB_6 ������ ���� ~~~~");		
	}
}

class CC_6 extends BB_6
{
	CC_6()  // default �����ڴ� ���� �ʾƵ� �ڵ����� �������(������ ����� �Ȱ��� ������ ��������)
	{
		System.out.println("CC_6 ������ ���� ####");
	}
}

public class Inheritance_1 {
	public static void main(String[] args) {
		
		AA_6 obj_1 = new AA_6();	
		System.out.println();
		BB_6 obj_2 = new BB_6();
		System.out.println();
		CC_6 obj_3 = new CC_6();  //��� ���迡���� �θ��� ���� �������. AA => BB => CC
		System.out.println();
		
		System.out.println(obj_1);
		System.out.println(obj_2);
		System.out.println(obj_3);
		
	}

}

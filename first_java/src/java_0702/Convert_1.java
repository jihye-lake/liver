package java_0702;

class AB_1
{
	int a = 33;
	void display()
	{
		System.out.println("�߰ſ� ������");
	}
}

class ABB_1 extends AB_1
{
	int b = 55;
}

class AC_1 extends ABB_1
{
	int  a = 77;
	int c = 99;
	void display()
	{
		System.out.println("���� �ÿ��� ������ @@@");
	}
	void show()
	{
		System.out.println("���� �ÿ��� ������ &&&&");
	}
}

public class Convert_1 {
	public static void main(String[] args) {
		
		//AC_1 obj_1 = new AC_1();
		//ABB_1 obj_1  = new AC_1();  //���� ��ü ����ȯ('AC �� ���� AB�� ��ü ����ȯ�� �ض�' ��� ��
		//AB_1 obj_2 = new AC_1();    //����Ʈ ó�� �Ȱ��� ���¸� ����� ���ؼ� ����
		AB_1 obj_2 = new AC_1();
		AC_1 obj_3 = null;
		
		obj_3 = (AC_1) obj_2;  //ū �Ϳ��� ���� ������ �� ���� ������ casting �����ڸ� �Ἥ �ǵ��� ���� ����
		
		/*System.out.println("AC_1 a = " + obj_1.a);
		System.out.println("AC_1 b = " + obj_1.b);
		//System.out.println("AC_1 c = " + obj_1.c); //ABB_1  �� ���� c�� ���� �����ϱ� ��µ� �� ����
		//System.out.println("AB_1 a = " + obj_2.a);*/
		
		System.out.println("AC_1 a = " + obj_3.a);
		
		//obj_1.display();
		//obj_1.show();  //Line35 ���� AB_1 obj_1  = new AC_1(); �� �����ְ� �����Ű�� show�� ���� ������ �������.
		
		//**��� ������ �����׵ǰ�(�ڱ��ڽ��� �ǰ�), ����޼ҵ�� �������̵��ȴ�.
		
	}

}

package java_0701;

class AA_2
{
	int aa = 24;
	int bb = 65;
	
	void display()
	{
		System.out.println("AA_2 Ŭ������ display() �޼ҵ�");
	}
}

class BB_2 extends AA_2
{
	int bb = 79;
	int cc = 53;
	
	void display()  //�̰� �ٷ� Overriding
	{
		System.out.println("BB_2 Ŭ������ display() �޼ҵ�");
	}
}

class CC_2 extends BB_2
{
	int cc = 87;
	int dd = 36;
	
	void display()
	{
		System.out.println("CC_2 Ŭ������ display() �޼ҵ�");
	}
}

public class Overriding_1 {
	public static void main(String[] args) {
		
		AA_2 obj_1 = new BB_2();  //AA_2 ��ü�� ���� BB_2 ��ü�� ����ȯ�� �ض�(��Ӱ����̱� ������ ������)
		// ��Ӱ��迡�� ��µǴ� ������ ��������� ������(�� �� �״�� ������)�ǰ�, ����޼ҵ�� �������̵� �ȴ�.

		obj_1.display();
		//obj_2.display();
		System.out.println(obj_1.bb);
		
	}

}

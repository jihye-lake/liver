package java_0701;

class AA_7
{	
	int a = 0;
	public AA_7() {}
	
	public AA_7(int a)
	{
		this.a = a;
		//System.out.println(" a = " +a);
	}
}

class BB_7 extends AA_7
{
	int b = 0;
	public BB_7 () {}
	
	public BB_7(int a, int b)
	{
		super(a);
		this.b = b;
		//System.out.println(" b = " +b);
	}
}

class CC_7 extends BB_7
{
	int c = 0;
	public CC_7(int a, int b, int c)
	{
		super(a, b);
		this.c = c;
		//System.out.println(" c = " +c);
}

public CC_7()
{
	System.out.println("CC_7 ����Ʈ ������ ȣ��");
}

}

public class Inheritance_2 {
	public static void main(String[] args) {
		
		CC_7 obj_1 = new CC_7(45, 77, 39);  //�κ������� �ѱ� �� �ִ�. �Ű������� �ϳ��� ������ default �����ڴ� ���� �� ����.
		CC_7 obj_2 = new CC_7();  //����ǥ�ð� �ߴ� ���� : �� �������� ���� �ʴ���! ��� ����(�޸� ���� ���)
		//System.out.println(obj_2);  //�̷��� ���ָ� ��������� �����
		
		
		System.out.println(" a = " +obj_1.a+ ", b = " +obj_1.b+ ", c = " +obj_1.c);
		// ������ ����ְ� ������ Systen.out.println(" c = " + c); �̷��� �����ָ� ���ʴ�� ����
		
	}

}

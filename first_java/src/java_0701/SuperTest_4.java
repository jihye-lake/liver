package java_0701;

class AA_4
{
	int a;
	
	public AA_4(int a) {  //������
		this.a = a;
		System.out.println("AA_4 ������ ȣ�� $$");
	}
	
	void display()
	{
		System.out.println("A = " + a);
	}
}

class BB_4 extends AA_4
{
	public BB_4(int a) {  //������ : Ŭ�����̸��� �����ϰ� ����Ÿ���� ����.
		super(a);   //*****super�� ��Ӱ��迡���� �� �� �ִ�*****, ù��° �ٿ��� �� �� �ִ�, ������ ȣ��(7Line ȣ��)
		super.display();  //�޼ҵ�� �����ᵵ ������. super�� ��ü ������ �θ� Ŭ������ ���� ����� �� ������ �������
		System.out.println("BB_4 ������ ȣ�� %%");
	}
}


class CC_4 extends BB_4
{
	public CC_4(int b) {
		super(b);  //super �� ���ؼ� ���� �ö�
		System.out.println("CC_4 ������ ȣ�� &&");
	} 
}


class DD_4 extends CC_4
{
	public DD_4(int c) {
		super(c);
		System.out.println("DD_4 ������ ȣ�� ^^");
	}
}

public class SuperTest_4 {
	public static void main(String[] args) {
		
		//BB_4 obj_1 = new BB_4(77);  // => public BB_4(int a)�� int a�� ���ٰ� => super(a) �� ����
												 //  => 7Line �� int a �� ���ٰ� display �� ���ͼ� ��µȴ�.
		
		CC_4 obj_1 = new CC_4(456);
		
	}

}

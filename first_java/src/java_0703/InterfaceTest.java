package java_0703;  //����� �۾��� ���ؼ� interface �� ����Ѵ�(�Ȱ��� �۾��� �� �� �ִ�)

interface Component_1  //�߻�޼ҵ�� ������ ���� ���ϴµ� �������� ��� ������ ������ ���� ����
{	
	void display();  //public abstract void display(); �� ���� �ǹ�
	
//	{
//	 { System.out.println("display() �޼ҵ� ���"); }
//	}
	
	void show();
//	{
//		System.out.println("show() �޼ҵ� ���");
//	}
	
	void message();
//	{
//		System.out.println("message �޼ҵ� ���");
//	}
}

class BB_9 implements Component_2
{

	@Override
	public void message() {
		System.out.println("Component_2 message() �޼ҵ� ���");
		
	}
	
}

class CC_6 implements Component_3
{
	@Override
	public void show()
	{
		System.out.println("Component_2 show() �޼ҵ� ���");
	}
}

class AA_9 implements Component_1  //interface �� �����Ѵٴ� ������ implements �� ����
{
	public void display()
	{
		System.out.println("AA_9 display() �޼ҵ� ���");
	}
	
	public void show()
	{
		System.out.println("AA_9 show() �޼ҵ� ���");
	}
	
	public void message()
	{
		System.out.println("AA_9 message() �޼ҵ� ���");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		
		Component_1 obj = new AA_9();  //������Ʈ�� �����ϴ� AA_9 Ŭ����
		Component_2 obj_2 = new BB_9();  
		Component_3 obj_3 = new CC_6();
//		BB_9 obj_2 = new BB_9(); �� ������ message �� Ctrl ������ ���콺�� Ŭ���ϸ� ������ BB_9 �� message�� ������
//		Component_2 obj_2 = new Componenet_2(); �� ����� ���� ������� message �� Ŭ���ϸ�
//		class Component_2 �� �ִ� ������ ����.
		
		obj.display();
		obj.show();
		obj.message();
		
		System.out.println();
		
		obj_2.message();
		
		System.out.println();
		
		obj_3.show();
		
	}
}

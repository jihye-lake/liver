package java_0627;

class Overloading
{
	
	public Overloading() {}
	
	void display()
	{
		System.out.println("���޵� �� ����.");
	}
	
	void display(int a)
	{
		System.out.println("A ���� : " + a);
	}
	
	void display(String name)
	{
		System.out.println("���޵� �̸��� : " + name);
	}
	
	void message(String name)
	{
		System.out.println("���޵� �̸��� 22 : " + name);
	}
	
	void display(String name, int age)
	{
		System.out.println("�̸��� : " + name + " | ���̴� : " + age);
	}
	
	void display(String name, int age, String sex)
	{
		System.out.println("�̸��� : " + name + " | ���̴� : " + age + " | ������ : " + sex);
	}
	
}

public class OverloadingExe {
	public static void main(String[] args) {
		
		Overloading obj1 = new Overloading();
		
		obj1.display();   //   �޼ҵ� ȣ��, �޼ҵ� �����ε�(Ȥ�� �ѱ����� ��������)
		obj1.display(35);
		obj1.display("���չ�");
		obj1.message("���չ�231325234");
		obj1.display("�迵��", 80);
		obj1.display("������", 76, "f");
		
	}

}

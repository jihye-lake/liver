package java_0702;

abstract class Style
{
	int i = 77;
	abstract void draw();  //���� ���� ������ �׸��ٴ� �� ������ �� ����(�Ӹ��� �ִ� �޼ҵ�)
	abstract void show();  //���⿡�� ���� �� �������� ������ ����, �Ӹ��� �ְ� ������ ���
}

class Square extends Style  //Overriding �ž� ��
{
	int i = 55;
	@Override //�޼ҵ带 �������ߴٴ� �� �˷��ֱ� ���ؼ� �����ִ� ����
	void draw()  //���� �Ӹ��� �����ϱ� ���뵵 ����鼭 ��ü�� ������ֱ� ���ؼ� Override��
	{
		System.out.println("�簢���� �׸��ϴ�.");
	}
	
	void show()
	{
		System.out.println("�簢���� �׸��ϴ�@@");
	}
}

class Circle extends Style
{
	@Override  //�տ��� Overriding ���� ����� �ణ�� �ٲ������ ���ݾ� �ٲ� �� �ִ� ���̴�
	void draw()
	{
		System.out.println("���� �׸��ϴ�.");
	}
	
	void show()
	{
		System.out.println("���� �׸��ϴ�@@");
	}
}

class Triangle extends Style
{
	@Override
	void draw()
	{
		System.out.println("�ﰢ���� �׸��ϴ�.");
	}
	
	void show()
	{
		System.out.println("�ﰢ���� �׸��ϴ�@@");
	}
}

class Pentagon extends Style
{
	@Override
	void draw()
	{
		System.out.println("�������� �׸��ϴ�.");
	}
	
	void show()
	{
		System.out.println("�������� �׸��ϴ�@@");
	}
}

public class Style_2 {
	public static void main(String[] args) {
		
		Square		obj_1 = new Square();
		Circle			obj_2 = new Circle();
		Triangle		obj_3 = new Triangle();
		Pentagon	obj_4 = new Pentagon();
		
		obj_1.draw();
		obj_1.show();
		obj_2.draw();
		obj_2.show();
		obj_3.draw();
		obj_3.show();
		obj_4.draw();
		obj_4.show();
		
		System.out.println("\n============\n");
		
		Style ooj = new Square();  //��Ӱ����̱� ������ �����ϴ� Square �� Style �� ��ӹ޾���
		ooj.draw();							
		ooj.show();
		System.out.println(ooj.i); //��������� Style��, ��� �޼ҵ�� Square ���� ���� ����
												// �ִ� �� ū ��, �޴� �� ���� ��
		ooj = new Circle();	// ���� ����� �޾ұ� ������ ������
		ooj.draw();
		ooj.show();
		
		ooj = new Triangle();	// ���� ����� �޾ұ� ������ ������
		ooj.draw();
		ooj.show();
		
		ooj = new Pentagon();	// ���� ����� �޾ұ� ������ ������
		ooj.draw();
		ooj.show();

	}

}

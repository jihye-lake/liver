package java_0701;

public class SuperTest_5 {
	public static void main(String[] args) {
		
		Child obj_1 = new Child();
		obj_1.message();
		
	}

}


class Parent //class ��ġ�� ���� �Ʒ��� �������
{
	int x = 578;
}

class Child extends Parent
{
	int x = 3567;
	void message()
	{
		System.out.println(" x = " + x);
		System.out.println(" this.x = " + this.x);
		System.out.println(" super.x = " + super.x);
	}
}
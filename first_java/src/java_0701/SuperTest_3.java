package java_0701;

class AA_3 {
	int a = 10;
	int b = 20;

	void display() {
		System.out.println("AA_3 a = " + a + " , b = " + b);
	}
}

class BB_3 extends AA_3 {
	int a = 333;
	int b = 555;

	void display() // overriding �� �޼ҵ�
	{
		System.out.println("BB_3 display a = " + a + " , b = " + b);
	}

	void show() // �׳� �޼ҵ�
	{
		super.display();
		this.display();

		int total = this.a + this.b + super.a + super.b;

		System.out.println("total = " + total);

		System.out.println("BB_3 show a = " + a + " , b = " + b);
	}
}

public class SuperTest_3 {
	public static void main(String[] args) {

		BB_3 obj_1 = new BB_3();

		BB_3 obj_2 = null;

		AA_3 obj_3 = new BB_3();

//		obj_3.display();
		// obj_3.show();

		/*
		 * obj_1.display(); obj_1.show();
		 */

		
		 obj_2 = (BB_3)obj_3;  //obj_3 �� BB_3 Ÿ������ �ٲٶ�� ��. ��ü�� ����ȯ�� ��Ӱ��迡���� �����ϴ�.
		 
		 obj_2.display(); obj_2.show();
		 

	}

}

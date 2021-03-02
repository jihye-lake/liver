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

	void display() // overriding 된 메소드
	{
		System.out.println("BB_3 display a = " + a + " , b = " + b);
	}

	void show() // 그냥 메소드
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

		
		 obj_2 = (BB_3)obj_3;  //obj_3 를 BB_3 타입으로 바꾸라는 뜻. 객체의 형변환은 상속관계에서만 가능하다.
		 
		 obj_2.display(); obj_2.show();
		 

	}

}

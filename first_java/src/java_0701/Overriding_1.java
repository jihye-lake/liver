package java_0701;

class AA_2
{
	int aa = 24;
	int bb = 65;
	
	void display()
	{
		System.out.println("AA_2 클래스의 display() 메소드");
	}
}

class BB_2 extends AA_2
{
	int bb = 79;
	int cc = 53;
	
	void display()  //이게 바로 Overriding
	{
		System.out.println("BB_2 클래스의 display() 메소드");
	}
}

class CC_2 extends BB_2
{
	int cc = 87;
	int dd = 36;
	
	void display()
	{
		System.out.println("CC_2 클래스의 display() 메소드");
	}
}

public class Overriding_1 {
	public static void main(String[] args) {
		
		AA_2 obj_1 = new BB_2();  //AA_2 객체를 만들어서 BB_2 객체로 형변환을 해라(상속관계이기 때문에 가능함)
		// 상속관계에서 출력되는 값들은 멤버변수는 쉐도잉(그 값 그대로 나오고)되고, 멤버메소드는 오버라이딩 된다.

		obj_1.display();
		//obj_2.display();
		System.out.println(obj_1.bb);
		
	}

}

package java_0701;

class AA_6
{
	AA_6()
	{
		System.out.println("AA_6 생성자 수행 @@@");		
	}
}

class BB_6 extends AA_6  //BB_6 클래스의 주소값이 @6d06d69c
{
	BB_6()
	{
		System.out.println("BB_6 생성자 수행 ~~~~");		
	}
}

class CC_6 extends BB_6
{
	CC_6()  // default 생성자는 쓰지 않아도 자동으로 만들어짐(지워도 출력은 똑같음 위에도 마찬가지)
	{
		System.out.println("CC_6 생성자 수행 ####");
	}
}

public class Inheritance_1 {
	public static void main(String[] args) {
		
		AA_6 obj_1 = new AA_6();	
		System.out.println();
		BB_6 obj_2 = new BB_6();
		System.out.println();
		CC_6 obj_3 = new CC_6();  //상속 관계에서는 부모값이 먼저 만들어짐. AA => BB => CC
		System.out.println();
		
		System.out.println(obj_1);
		System.out.println(obj_2);
		System.out.println(obj_3);
		
	}

}

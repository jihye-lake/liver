package java_0702;

class AB_1
{
	int a = 33;
	void display()
	{
		System.out.println("뜨거운 여름날");
	}
}

class ABB_1 extends AB_1
{
	int b = 55;
}

class AC_1 extends ABB_1
{
	int  a = 77;
	int c = 99;
	void display()
	{
		System.out.println("아주 시원한 여름날 @@@");
	}
	void show()
	{
		System.out.println("아주 시원한 여름날 &&&&");
	}
}

public class Convert_1 {
	public static void main(String[] args) {
		
		//AC_1 obj_1 = new AC_1();
		//ABB_1 obj_1  = new AC_1();  //위의 객체 형변환('AC 를 만들어서 AB로 객체 형변환을 해라' 라는 뜻
		//AB_1 obj_2 = new AC_1();    //아파트 처럼 똑같은 형태를 만들기 위해서 사용됨
		AB_1 obj_2 = new AC_1();
		AC_1 obj_3 = null;
		
		obj_3 = (AC_1) obj_2;  //큰 것에서 작은 것으로 갈 수는 없지만 casting 연산자를 써서 되돌릴 수는 있음
		
		/*System.out.println("AC_1 a = " + obj_1.a);
		System.out.println("AC_1 b = " + obj_1.b);
		//System.out.println("AC_1 c = " + obj_1.c); //ABB_1  일 때는 c의 값이 없으니까 출력될 수 없음
		//System.out.println("AB_1 a = " + obj_2.a);*/
		
		System.out.println("AC_1 a = " + obj_3.a);
		
		//obj_1.display();
		//obj_1.show();  //Line35 에서 AB_1 obj_1  = new AC_1(); 를 적어주고 실행시키면 show가 없기 때문에 오류뜬다.
		
		//**멤버 변수는 쉐도잉되고(자기자신이 되고), 멤버메소드는 오버라이딩된다.
		
	}

}

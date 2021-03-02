package java_0701;

class AA_7
{	
	int a = 0;
	public AA_7() {}
	
	public AA_7(int a)
	{
		this.a = a;
		//System.out.println(" a = " +a);
	}
}

class BB_7 extends AA_7
{
	int b = 0;
	public BB_7 () {}
	
	public BB_7(int a, int b)
	{
		super(a);
		this.b = b;
		//System.out.println(" b = " +b);
	}
}

class CC_7 extends BB_7
{
	int c = 0;
	public CC_7(int a, int b, int c)
	{
		super(a, b);
		this.c = c;
		//System.out.println(" c = " +c);
}

public CC_7()
{
	System.out.println("CC_7 디폴트 생성자 호출");
}

}

public class Inheritance_2 {
	public static void main(String[] args) {
		
		CC_7 obj_1 = new CC_7(45, 77, 39);  //부분적으로 넘길 수 있다. 매개변수가 하나라도 있으면 default 생성자는 만들 수 없다.
		CC_7 obj_2 = new CC_7();  //전구표시가 뜨는 이유 : 왜 만들어놓고 쓰지 않느냐! 라는 뜻임(메모리 낭비 경고)
		//System.out.println(obj_2);  //이렇게 써주면 전구모양이 사라짐
		
		
		System.out.println(" a = " +obj_1.a+ ", b = " +obj_1.b+ ", c = " +obj_1.c);
		// 위에서 찍어주고 싶으면 Systen.out.println(" c = " + c); 이렇게 적어주면 차례대로 나옴
		
	}

}

package java_0701;

class AA_4
{
	int a;
	
	public AA_4(int a) {  //생성자
		this.a = a;
		System.out.println("AA_4 생성자 호출 $$");
	}
	
	void display()
	{
		System.out.println("A = " + a);
	}
}

class BB_4 extends AA_4
{
	public BB_4(int a) {  //생성자 : 클래스이름과 동일하고 리턴타입이 없다.
		super(a);   //*****super는 상속관계에서만 쓸 수 있다*****, 첫번째 줄에만 쓸 수 있다, 생성자 호출(7Line 호출)
		super.display();  //메소드는 언제써도 괜찮다. super의 객체 생성은 부모 클래스가 먼저 만들어 진 다음에 만들어짐
		System.out.println("BB_4 생성자 호출 %%");
	}
}


class CC_4 extends BB_4
{
	public CC_4(int b) {
		super(b);  //super 에 의해서 위로 올라감
		System.out.println("CC_4 생성자 호출 &&");
	} 
}


class DD_4 extends CC_4
{
	public DD_4(int c) {
		super(c);
		System.out.println("DD_4 생성자 호출 ^^");
	}
}

public class SuperTest_4 {
	public static void main(String[] args) {
		
		//BB_4 obj_1 = new BB_4(77);  // => public BB_4(int a)에 int a에 들어갔다가 => super(a) 에 들어가고
												 //  => 7Line 에 int a 에 갔다가 display 로 나와서 출력된다.
		
		CC_4 obj_1 = new CC_4(456);
		
	}

}

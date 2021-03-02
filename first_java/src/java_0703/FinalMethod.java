package java_0703;

class AA_8  //class 에 final 이 붙으면 상속 해줄 수 없다. (대표적 : String)
{
	final void display()  //메소드에 final 이 붙으면 overriding 불가능
								//변수에 final 이 붙으면 값을 바꿀 수 없다. ex) final double PI 등
	{
		System.out.println("재정의 불가가가~~~~");
	}
}

class BB_8 extends AA_8
{
	/*void display()
	{
		System.out.println("재정의 가능 메소드 $$$$$");
	}*/
}

public class FinalMethod {
	public static void main(String[] args) {
		
		BB_8 obj = new BB_8();
		
		obj.display();
	}

}

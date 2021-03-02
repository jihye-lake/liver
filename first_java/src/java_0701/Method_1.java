package java_0701;

class Super_1
{
	public void display()
	
	{
		System.out.println("Super_1 클래스의 display 메소드");
	}
	
	protected void message()
	{		
		System.out.println("Super_1 클래스의 message 메소드");
	}
	
	void print()
	{
		System.out.println("Super_1 클래스의 print 메소드");
	}
	
	private void show()  //private 으로 선언된 메소드 show는 Super_1클래스 안에서만 사용할 수 있다.
	{							  //사용하고자 한다면 private 대신에 public 이나 default 등으로 다르게 선언해줘야 한다.
		System.out.println("Super_1 클래스의 show 메소드");
	}
}

public class Method_1 extends Super_1{  //상속관계가 아니었을 때도 사용가능했던 이유는 같은 package 에 들어있었기 때문이다.
															//다른 package 에 들어 있었다면 default 값은 나오지 않았다.
	public static void main(String[] args) {
		
		Super_1 obj = new Super_1();  //객체 생성
		
		obj.display();
		obj.message();
		obj.print();
		//obj.show();  //private 으로 선언되어 있기 때문에 Super_1 클래스 내부에서만 사용할 수 있다.
		// setter 로 값을 바꾸고 getter 로 값을 불러옴.
		
	}

}

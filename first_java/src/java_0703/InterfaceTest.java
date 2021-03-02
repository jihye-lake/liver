package java_0703;  //공통된 작업을 위해서 interface 를 사용한다(똑같은 작업을 할 수 있다)

interface Component_1  //추상메소드는 몸통을 갖지 못하는데 가지도록 썼기 때문에 에러가 났던 것임
{	
	void display();  //public abstract void display(); 와 같은 의미
	
//	{
//	 { System.out.println("display() 메소드 출력"); }
//	}
	
	void show();
//	{
//		System.out.println("show() 메소드 출력");
//	}
	
	void message();
//	{
//		System.out.println("message 메소드 출력");
//	}
}

class BB_9 implements Component_2
{

	@Override
	public void message() {
		System.out.println("Component_2 message() 메소드 출력");
		
	}
	
}

class CC_6 implements Component_3
{
	@Override
	public void show()
	{
		System.out.println("Component_2 show() 메소드 출력");
	}
}

class AA_9 implements Component_1  //interface 를 구현한다는 뜻으로 implements 를 쓴다
{
	public void display()
	{
		System.out.println("AA_9 display() 메소드 출력");
	}
	
	public void show()
	{
		System.out.println("AA_9 show() 메소드 출력");
	}
	
	public void message()
	{
		System.out.println("AA_9 message() 메소드 출력");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		
		Component_1 obj = new AA_9();  //컴포넌트를 구현하는 AA_9 클래스
		Component_2 obj_2 = new BB_9();  
		Component_3 obj_3 = new CC_6();
//		BB_9 obj_2 = new BB_9(); 로 찍으면 message 를 Ctrl 누르고 마우스로 클릭하면 본문의 BB_9 의 message로 가지만
//		Component_2 obj_2 = new Componenet_2(); 로 찍고나서 같은 방법으로 message 를 클릭하면
//		class Component_2 가 있는 곳으로 간다.
		
		obj.display();
		obj.show();
		obj.message();
		
		System.out.println();
		
		obj_2.message();
		
		System.out.println();
		
		obj_3.show();
		
	}
}

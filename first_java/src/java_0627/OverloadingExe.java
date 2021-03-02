package java_0627;

class Overloading
{
	
	public Overloading() {}
	
	void display()
	{
		System.out.println("전달된 값 없음.");
	}
	
	void display(int a)
	{
		System.out.println("A 값은 : " + a);
	}
	
	void display(String name)
	{
		System.out.println("전달된 이름은 : " + name);
	}
	
	void message(String name)
	{
		System.out.println("전달된 이름은 22 : " + name);
	}
	
	void display(String name, int age)
	{
		System.out.println("이름은 : " + name + " | 나이는 : " + age);
	}
	
	void display(String name, int age, String sex)
	{
		System.out.println("이름은 : " + name + " | 나이는 : " + age + " | 성별은 : " + sex);
	}
	
}

public class OverloadingExe {
	public static void main(String[] args) {
		
		Overloading obj1 = new Overloading();
		
		obj1.display();   //   메소드 호출, 메소드 오버로딩(혹은 한국말로 다중정의)
		obj1.display(35);
		obj1.display("조롱박");
		obj1.message("조롱박231325234");
		obj1.display("김영희", 80);
		obj1.display("김준희", 76, "f");
		
	}

}

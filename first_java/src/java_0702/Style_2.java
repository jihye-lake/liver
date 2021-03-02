package java_0702;

abstract class Style
{
	int i = 77;
	abstract void draw();  //쓰는 순간 뭔가를 그린다는 걸 예측할 수 있음(머리만 있는 메소드)
	abstract void show();  //여기에만 쓰면 세 군데에서 에러가 나옴, 머리만 있고 몸통이 없어서
}

class Square extends Style  //Overriding 돼야 함
{
	int i = 55;
	@Override //메소드를 재정의했다는 걸 알려주기 위해서 적어주는 것임
	void draw()  //아직 머리만 있으니까 몸통도 만들면서 객체로 만들어주기 위해서 Override함
	{
		System.out.println("사각형을 그립니다.");
	}
	
	void show()
	{
		System.out.println("사각형을 그립니다@@");
	}
}

class Circle extends Style
{
	@Override  //앞에서 Overriding 에서 모양이 약간씩 바뀌었듯이 조금씩 바뀔 수 있는 것이다
	void draw()
	{
		System.out.println("원을 그립니다.");
	}
	
	void show()
	{
		System.out.println("원을 그립니다@@");
	}
}

class Triangle extends Style
{
	@Override
	void draw()
	{
		System.out.println("삼각형을 그립니다.");
	}
	
	void show()
	{
		System.out.println("삼각형을 그립니다@@");
	}
}

class Pentagon extends Style
{
	@Override
	void draw()
	{
		System.out.println("오각형을 그립니다.");
	}
	
	void show()
	{
		System.out.println("오각형을 그립니다@@");
	}
}

public class Style_2 {
	public static void main(String[] args) {
		
		Square		obj_1 = new Square();
		Circle			obj_2 = new Circle();
		Triangle		obj_3 = new Triangle();
		Pentagon	obj_4 = new Pentagon();
		
		obj_1.draw();
		obj_1.show();
		obj_2.draw();
		obj_2.show();
		obj_3.draw();
		obj_3.show();
		obj_4.draw();
		obj_4.show();
		
		System.out.println("\n============\n");
		
		Style ooj = new Square();  //상속관계이기 때문에 가능하다 Square 는 Style 을 상속받았음
		ooj.draw();							
		ooj.show();
		System.out.println(ooj.i); //멤버변수는 Style값, 멤버 메소드는 Square 안의 값이 나옴
												// 주는 게 큰 것, 받는 게 작은 것
		ooj = new Circle();	// 같은 상속을 받았기 때문에 가능함
		ooj.draw();
		ooj.show();
		
		ooj = new Triangle();	// 같은 상속을 받았기 때문에 가능함
		ooj.draw();
		ooj.show();
		
		ooj = new Pentagon();	// 같은 상속을 받았기 때문에 가능함
		ooj.draw();
		ooj.show();

	}

}

package java_0702;

abstract class 도형
{
	int i = 33;
	abstract void draw ();	
}

class 사각형 extends 도형
{
	@Override  //기존의 것에 약간의 변화만 주겠다는 뜻임 => 재정의
	void draw()
	{
		System.out.println("사각형을 그립니다");
	}
	void message()
	{
		System.out.println("사각형 message() 메소드");
	}
}

public class Style_1 {
	public static void main(String[] args) {
		
		사각형 obj_1 = new 사각형(); //도형 class 의 객체 => 미완성 설계도면이기 때문에 객체화 시킬 수 없음
		System.out.println("사각형 클래스i = " + obj_1.i);	//추상클래스는 객체화 할 수 없음
		 obj_1.draw();
		 obj_1.message();
	}

}

package java_0627;

class StaticMethod
{
	int kor = 33;
	static int eng;
	static int math;
	
	static double average()
	{
		int total = eng + math;  //  static 으로 선언된 메소드 안에는 static 으로 선언된(만들어진) 객체만 들어올 수 있음
		
		return total;
	}
	
	double average2()
	{
		int total = kor + eng + math;
		return total;
	}
}

public class StaticMethodTest {
	
	public static void main(String[] args) {
		
		StaticMethod obj = new StaticMethod();   //  값이 전부 공유됨
		
		obj.kor		= 77;
		obj.eng		= 44;
		obj.math	= 88;
		
		System.out.println("평 균1 : " + obj.average());
		System.out.println("평 균2 : " + StaticMethod.average());  //  객체명이 아니라 클래스명으로도 접근이 가능함
		
	}

}

package first_java;



public class Sample_1 {
	
	double x;  //  멤버 변수
	double y;  //  멤버 변수
	
	public Sample_1(double a, double b) {  //  생성자(생성자는 리턴 타입이 없음 이것이 메소드와 생성자를 구별하는 법)
										   //  생성자는 클래스 이름과 같다.
		
		x = a;
		y = b;
	}
	
	public double add()  //  멤버 메소드
	{
		return (x + y);
	}
	
	public double sub()  //  멤버 메소드
	{
		return (x - y);
	}
	
	public double mul()  //  멤버 메소드
	{
		return (x * y);
	}
	
	public double div()  //  멤버 메소드
	{
		return (x / y);
	}
	
	public double mod()  //  멤버 메소드
	{
		return (int)(x % y);
	}
	
	
	
	public static void main(String[] args) {  //  멤버 메소드 (main 있는 곳이 짐입점)
		
		Sample_1 sample = new Sample_1(45.67,13.5);  //  생성자 초기화
     // 클래스  객체참조변수      생성자 호출(이 값을 가지고 들어가라는 뜻이다) 객체는 Heap 공간에 만들어진다.
		
		System.out.println("더하기 : " + sample.add());
		System.out.println("빼  기 : " + sample.sub());
		System.out.println("곱하기 : " + sample.mul());
		System.out.println("나누기 : " + sample.div());
		System.out.println("나머지 : " + sample.mod());
		
	}

}

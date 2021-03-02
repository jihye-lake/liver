package java_0703;

interface AAA
{
	public void print11();
}

class BBB implements AAA
{
	@Override
	public void print11()
	{
		System.out.println("AAA Interface Method Overriding");
	}
	
	public void print222()
	{
		System.out.println("BBB Class Method");
	}
}

public class InterfaceTest_33 {
	public static void main(String[] args) {
		
		BBB obj_1 = new BBB();
		
		obj_1.print11();
		obj_1.print222();
		
		System.out.println("=======================");
		
		AAA obj_2 = new BBB();  //인터페이스 형변환(BBB형태를 AAA로 변환)
		
		obj_2.print11();
		//obj_2.print222();  //나올 수 없음(BBB클래스 객체가 AAA로 형변환 됐기 때문에 BBB값은 나올 수 없음
								  //Overriding 된 print11 만 나올 수 있음
	}

}

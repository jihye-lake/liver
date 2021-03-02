package java_0626;

class Static_1
{
	int num	= 0;
	// static int num = 0; 이렇게 static 을 앞에 적어주면 그 공간은 별도의 공간이 됨(Method area에 만들어져서 만들어져 있는 것을 공유함)
	int xx		= 10;
	int yy		= 20;
}

public class StaticTest {
	
	public static void main(String[] args) {
		
		Static_1 ss1 = new Static_1();  //  Static_1하나를 만들어놓고 공유하는 방식(new 라도 전부 새롭게 만든 게 아님)
		Static_1 ss2 = new Static_1();  //  Static 으로 생성된 변수 멤버들은 객체 생성 없이 클래스명만으로 사용이 가능하다
		Static_1 ss3 = new Static_1();
		
		ss1.num	= 77;
		ss1.xx		= 44;
		ss1.yy		= 55;
		
		System.out.println("ss1.num = " + ss1.num + "\nss1.xx = " + ss1.xx + "\nss1.yy = " +ss1.yy);
		
		ss2.num	= 2222;
		ss2.xx		= 888;
		ss2.yy		= 999;
		
		System.out.println("\nss2.num = " + ss2.num + "\nss2.xx = " + ss2.xx + "\nss2.yy = " +ss2.yy);
		
		System.out.println("\nss3.num = " + ss3.num + "\nss3.xx = " + ss3.xx + "\nss3.yy = " +ss3.yy);
		
		System.out.println("\nStatic_1.num = " + ss2.num + "\nStatic_1.xx = " + ss2.xx + "\nStatic_1.yy = " +ss2.yy);
		
		
	}

}

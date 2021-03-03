package first_java;

class AA_1
{
	private int x = 10;  //  값 초기화를 시켜주지 않으면 default 값으로 초기화가 된다.
	private int y = 33;
	
	public int add()  //  return 시켜라
	{
		return (x + y);  //  return 하면 호출한 곳으로 간다. 호출한 곳이 어디냐면 
	}
}


public class BB_1 {
	public static void main(String[] args) {
		
		AA_1 aa = new AA_1();
		
		// System.out.println("   x	= " + aa.x);  //  객체를 만든 다음에 그 객체에 접근하려면 .찍고 해당하는 것을 넣어줌.
	    // System.out.println("   y	= " + aa.y);
		System.out.println(" Sum	= " + aa.add());	
	}
}
// getter, setter
// 완벽한 은닉화 시키는 방법 : 클래스의 멤버 변수는 private 로 두고,
//										  멤버 메소드 public 으로 둬서 멤버 메소드만 건드릴 수 있게 한다.



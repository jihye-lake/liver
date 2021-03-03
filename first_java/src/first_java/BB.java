package first_java;

class AA_2
{
	public int x = 10;  //  값 초기화를 시켜주지 않으면 default 값으로 초기화가 된다.
	public int y = 33;
	
	public int add()  //  return 시켜라
	{
		return (x + y);  //  return 하면 호출한 곳으로 간다. 호출한 곳이 어디냐면 
	}
}


public class BB {
	public static void main(String[] args) {
		
		AA_2 aa = new AA_2();
		
		System.out.println("   x	= " + aa.x );  //  객체를 만든 다음에 그 객체에 접근하려면 .찍고 해당하는 것을 넣어줌.
		System.out.println("   y	= " + aa.y);
		System.out.println(" Sum	= " + aa.add());
		
	}

}

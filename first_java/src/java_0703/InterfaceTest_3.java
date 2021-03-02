package java_0703;

interface Complement_5
{
	void apple(); //public abstract 가 생략되어 있기 때문에 밑에 public 을 적어줘야 같은 revel 이 됨
	int orange = 1010;
}

class KK_1 implements Complement_5
{
	public void apple()
	{
		System.out.println("Complement_5 apple() 메소드 출력");
	}
}

public class InterfaceTest_3 {
	public static void main(String[] args) {
		
		KK_1 cabbage = new KK_1();
		
		cabbage.apple();
		System.out.println(cabbage.orange);
		
	}

}

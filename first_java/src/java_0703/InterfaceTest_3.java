package java_0703;

interface Complement_5
{
	void apple(); //public abstract �� �����Ǿ� �ֱ� ������ �ؿ� public �� ������� ���� revel �� ��
	int orange = 1010;
}

class KK_1 implements Complement_5
{
	public void apple()
	{
		System.out.println("Complement_5 apple() �޼ҵ� ���");
	}
}

public class InterfaceTest_3 {
	public static void main(String[] args) {
		
		KK_1 cabbage = new KK_1();
		
		cabbage.apple();
		System.out.println(cabbage.orange);
		
	}

}

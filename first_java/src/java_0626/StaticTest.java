package java_0626;

class Static_1
{
	int num	= 0;
	// static int num = 0; �̷��� static �� �տ� �����ָ� �� ������ ������ ������ ��(Method area�� ��������� ������� �ִ� ���� ������)
	int xx		= 10;
	int yy		= 20;
}

public class StaticTest {
	
	public static void main(String[] args) {
		
		Static_1 ss1 = new Static_1();  //  Static_1�ϳ��� �������� �����ϴ� ���(new �� ���� ���Ӱ� ���� �� �ƴ�)
		Static_1 ss2 = new Static_1();  //  Static ���� ������ ���� ������� ��ü ���� ���� Ŭ���������� ����� �����ϴ�
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

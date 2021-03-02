package java_0627;

class StaticMethod
{
	int kor = 33;
	static int eng;
	static int math;
	
	static double average()
	{
		int total = eng + math;  //  static ���� ����� �޼ҵ� �ȿ��� static ���� �����(�������) ��ü�� ���� �� ����
		
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
		
		StaticMethod obj = new StaticMethod();   //  ���� ���� ������
		
		obj.kor		= 77;
		obj.eng		= 44;
		obj.math	= 88;
		
		System.out.println("�� ��1 : " + obj.average());
		System.out.println("�� ��2 : " + StaticMethod.average());  //  ��ü���� �ƴ϶� Ŭ���������ε� ������ ������
		
	}

}

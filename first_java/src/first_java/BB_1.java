package first_java;

class AA_1
{
	private int x = 10;  //  �� �ʱ�ȭ�� �������� ������ default ������ �ʱ�ȭ�� �ȴ�.
	private int y = 33;
	
	public int add()  //  return ���Ѷ�
	{
		return (x + y);  //  return �ϸ� ȣ���� ������ ����. ȣ���� ���� ���ĸ� 
	}
}


public class BB_1 {
	public static void main(String[] args) {
		
		AA_1 aa = new AA_1();
		
		// System.out.println("   x	= " + aa.x);  //  ��ü�� ���� ������ �� ��ü�� �����Ϸ��� .��� �ش��ϴ� ���� �־���.
	    // System.out.println("   y	= " + aa.y);
		System.out.println(" Sum	= " + aa.add());	
	}
}
// getter, setter
// �Ϻ��� ����ȭ ��Ű�� ��� : Ŭ������ ��� ������ private �� �ΰ�,
//										  ��� �޼ҵ� public ���� �ּ� ��� �޼ҵ常 �ǵ帱 �� �ְ� �Ѵ�.



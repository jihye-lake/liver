package first_java;

class AA_2
{
	public int x = 10;  //  �� �ʱ�ȭ�� �������� ������ default ������ �ʱ�ȭ�� �ȴ�.
	public int y = 33;
	
	public int add()  //  return ���Ѷ�
	{
		return (x + y);  //  return �ϸ� ȣ���� ������ ����. ȣ���� ���� ���ĸ� 
	}
}


public class BB {
	public static void main(String[] args) {
		
		AA_2 aa = new AA_2();
		
		System.out.println("   x	= " + aa.x );  //  ��ü�� ���� ������ �� ��ü�� �����Ϸ��� .��� �ش��ϴ� ���� �־���.
		System.out.println("   y	= " + aa.y);
		System.out.println(" Sum	= " + aa.add());
		
	}

}

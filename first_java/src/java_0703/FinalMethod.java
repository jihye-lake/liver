package java_0703;

class AA_8  //class �� final �� ������ ��� ���� �� ����. (��ǥ�� : String)
{
	final void display()  //�޼ҵ忡 final �� ������ overriding �Ұ���
								//������ final �� ������ ���� �ٲ� �� ����. ex) final double PI ��
	{
		System.out.println("������ �Ұ�����~~~~");
	}
}

class BB_8 extends AA_8
{
	/*void display()
	{
		System.out.println("������ ���� �޼ҵ� $$$$$");
	}*/
}

public class FinalMethod {
	public static void main(String[] args) {
		
		BB_8 obj = new BB_8();
		
		obj.display();
	}

}

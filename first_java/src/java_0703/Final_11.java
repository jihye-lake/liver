package java_0703;

class Finall
{
	void aa()
	{
		System.out.println("aa ���� �ǾƳ�� ������ ����");
	}
	
	void bb()
	{
		System.out.println("bb ���� �ǾƳ�� ���԰� ������");
	}
	
	void cc() {}
}

class Pentagon extends Finall
{
	void cc()
	{
		System.out.println("cc ���� �ǾƳ�� �÷����� �پ��");
	}
}

public class Final_11 {
	public static void main(String[] args) {
		
		Finall type = new Pentagon();
		
		type.aa();
		type.bb();
		type.cc();
		
	}

}

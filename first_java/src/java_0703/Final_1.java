package java_0703;

//String �� ��ǥ���� final Ŭ����(�Ϻ��ϱ� ������) �׷��� �ٸ� Ŭ������ ��ӹ��� �� �Ѵ�.

class KingWordProcess
{
	void Input() {}  //�޼ҵ�� �ַ� �ҹ��ڷ� ������, ���� �� �絵�� �빮�ڷ� ��
	void Edit() {}
	void Print() {
		System.out.println("JH ȸ�� ��� ��ǰ�Դϴ�.");
	}
	void About() {
		System.out.println("King ȸ�� ���� ��ǰ");

	}
}

class SubWorldProcess extends KingWordProcess
{
	void About()
	{
		System.out.println("Sub ��ȸ�� ��ǰ");
	}
}

public class Final_1 {
	public static void main(String[] args) {
		
		KingWordProcess obj = new SubWorldProcess();
		
		obj.Print();
		obj.About();
		
	}

}

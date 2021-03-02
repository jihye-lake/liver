package java_0626;

class Data
{
	int x;
	int y;
}

public class ClassTest {
	
	public static void main(String[] args) {
		
		Data dd1 = new Data();
		
		dd1.x = 77;
		dd1.y = 88;
		
		System.out.println("main() x : " + dd1.x);
		
		change(dd1.x);
		
		System.out.println("After change(dd1.x) : " + dd1.x);
		System.out.println("main() x : " + dd1.x);
		
	}

	private static void change(int x) {  //  ó���� main�� static ���� �޼ҵ� �������� ��������µ� �� ���� �޼ҵ嵵 static �̾�� ��(Ȥ�� ��ü�� ������ �Ŀ��� �ᵵ ��)
		
		x = 1000;
		System.out.println("change() x : " + x);
		
	}

}

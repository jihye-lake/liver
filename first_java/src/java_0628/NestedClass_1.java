package java_0628;

class AA {
	
	static class BB //Window - show view - navigator ������ $�� ���̴µ� ����Ŭ������� ���̴�
					   //AA�ӿ� BB, BB �ӿ� CC �̷��� ��Ÿ����
	{
		
	static int bbb = 777;
	
	static class CC{
		
	int ccc = bbb + 800;
	}
	}
}



public class NestedClass_1 {
	public static void main(String[] args) {
		
		AA.BB.CC obj = new AA.BB.CC();
		
		System.out.println("CC Ŭ���� ���� ���� ccc = " + obj.ccc);
		//System.out.println("BB Ŭ���� ���� ���� bbb = " + obj.bbb);
	}

}

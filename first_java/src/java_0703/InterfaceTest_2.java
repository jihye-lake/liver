package java_0703;

interface Component_4
{
	int kbs = 789;  //static final �� �����Ǿ� �����Ƿ� ���ڸ� ������ �� ���� - ���ȭ �Ǿ� ����(Line 18 ���� ������ ����� ����)
}							//���ȭ => �� ���� �Ұ����ϴٴ� ��

class Mbc_1 implements Component_4
{
	
}

public class InterfaceTest_2 {
	public static void main(String[] args) {
		
		Mbc_1 obj_1 = new Mbc_1();
		
		//obj_1.kbs = 345;
		System.out.println(obj_1.kbs);
		
	}

}

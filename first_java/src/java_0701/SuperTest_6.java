package java_0701;

class AA_5
{
	String str;
	public AA_5(String str) {
		this.str = str; 
		System.out.println("AA_5 ������ ȣ��" + str);
	}
}

class BB_5 extends AA_5
{
	public BB_5(String aa) {
		super(aa);
		System.out.println("BB_5 ������ ȣ��" + aa);
	}
}

class CC_5 extends BB_5
{
	public CC_5(String kk) {
		super(kk);  //�׷��� ����(Ȥ�� this)�� ���� ù��° �ٿ� ����Ǿ�� �Ѵ�.
		System.out.println("CC_5 ������ ȣ��" + kk);
	}
}

public class SuperTest_6 {
	public static void main(String[] args) {
		
		CC_5 obj_1 = new CC_5("���� �ϴ� �ÿ��� ���Ҹ�");  //���ڿ��̴ϱ� String
		
		System.out.println(obj_1.str);
		
	}

}

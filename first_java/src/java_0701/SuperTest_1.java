package java_0701;

class AA_1
{
	int a = 33;
}

class BB_1 extends AA_1
{
	int b = 55;
}

class CC_1 extends BB_1
{
	int c = 77;
}

public class SuperTest_1 {
	public static void main(String[] args) {
		
		CC_1 obj_1 = new CC_1();  //BB_1 AA_1 ������ ���� c �� ���� ���� �����̱� ������ c ���� ������ �� ����.
		
		System.out.println("obj_1 �� a ���� = " + obj_1.a);
		System.out.println("\nobj_1 �� b ���� = " + obj_1.b);
		System.out.println("\nobj_1 �� c ���� = " + obj_1.c);
	
	}

}

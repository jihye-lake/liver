package java_0628;

class Block_1 {
	static {    //static block �� ���������� �����ֱ� ������ �� ���� ������ �ȴ�
		System.out.println("�� �� �� ����Ǵ� �� ~~~");
	}
	
	{  //new �� �� ������ �ݺ��ȴ�
		System.out.println("��ü ������ ���� ����Ǵ� �� !!!");
	}
	
	public Block_1() {
		System.out.println("���¾� �ڶ������� ������ @@@");
	}
}

public class BlockTest_1 {
	
	public static void main(String[] args) {
		
		System.out.println("Block_1 obj_1 = new Block_1()11");
		Block_1 obj_1 = new Block_1();
		
		System.out.println("\nBlock_1 obj_2 = new Block_1()22");
		Block_1 obj_2 = new Block_1();
		
		System.out.println("\nBlock_1 obj_3 = new Block_1()33");
		Block_1 obj_3 = new Block_1();
	}

}

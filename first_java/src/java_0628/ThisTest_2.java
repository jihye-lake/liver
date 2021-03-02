package java_0628;

class This_2 {
	String name;
	int age;
	char sex;
	
	public This_2(String name, int age, char sex) {  //  ���������� �켱������ �� �����Ƿ� this �� �ٿ��� ����� �����
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public This_2() { 
		// System.out.println("�ձ׷� ����");  //  *������ �ȿ��� �� �ٸ� �����ڴ� ���� ȣ��Ǿ�� ��*(syso�� �Ʒ���)
		this("�عٶ��	", 22, 'm');  //  ���⼭ this �� �Ű����� �� ��¥�� �ڱ� �ڽ��� ȣ���Ѵٴ� ��
		System.out.println("�ձ׷� ����");
	}
	
	public This_2(String name, int age) {
		this(name, age, 'f');
	}
	
	public This_2(String name, char sex) {
		this(name, 85, sex);
	}
	
	public This_2(int age, char sex) {  //  �����ڿ��� ������ ȣ���� �ݵ�� ù��° ��(��? ��ü�� ���� �����Ǿ�� �ϱ� ����)
		// System.out.println("�ʿ��� ����");
		this("�� �� ȭ	", age, sex);
		System.out.println("�ʿ��� ����");
	}
	
	public void display() {
		System.out.println("�̸��� : " +name+ " | ���̴� : " +age+ " | ������ : " +sex );
	}
}

public class ThisTest_2 {
	
	public static void main(String[] args) {
		
		This_2 obj_1 = new This_2();
		This_2 obj_2 = new This_2("��     ��	", 25);
		This_2 obj_3 = new This_2("��     ��	", 'f');
		This_2 obj_4 = new This_2(20, 'm');
		This_2 obj_5 = new This_2("��     ��	", 17, 'm');
		This_2 obj_6 = new This_2("��     ��	", 20, 'm');
		
		obj_1.display();
		obj_2.display();
		obj_3.display();
		obj_4.display();
		obj_5.display();
		obj_6.display();
		
		
	}

}

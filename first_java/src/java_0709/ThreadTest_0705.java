package java_0709;

public class ThreadTest_0705 extends Thread {
	
	int delay;
	
	public ThreadTest_0705(String title) {
		super(title);
		System.out.println(getName() + "������ ����");
	}

	public static void main(String[] args) {
		
		 ThreadTest_0705 obj_1 = new ThreadTest_0705("ù ��°");
		 ThreadTest_0705 obj_2 = new ThreadTest_0705("�ε� ��°");
		 ThreadTest_0705 obj_3 = new ThreadTest_0705("������ ��°");
		 ThreadTest_0705 obj_4 = new ThreadTest_0705("�׳׳׳� ��°");
		 
		 obj_1.setPriority(MAX_PRIORITY);
		 obj_2.setPriority(MIN_PRIORITY);
		 obj_3.setPriority(7);
		 //�ƹ��͵� �� ���� �⺻����(default) 5���� �ȴ�. => 4���� 5�� ��(default ���� 5)
		 
		 System.out.println(" �� �������� �켱 ���� ");
		 System.out.println( "obj_1 : " + obj_1.getPriority()+ " , obj_2 : " + obj_2.getPriority());
		 System.out.println( "obj_3 : " + obj_3.getPriority()+ " , obj_4 : " + obj_4.getPriority());
		 
		 obj_1.start();
		 obj_2.start();
		 obj_3.start();
		 obj_4.start();
		
	}
	@Override
	public void run() { 
		for (int i = 0; i < 5; i++) {
			System.out.println("[" + i + "]" + getName() + "���� ��" );
			
		}
		
		System.out.println(getName() + " ���� ����");
	}

}

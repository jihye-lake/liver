package java_0709;

public class RunnableTest_4 implements Runnable {
	
	int delay;
	
	private String title;
	
	public RunnableTest_4(String name) {  //Ȥ�� String title
		title = name;  //Ȥ�� this.title = title;
		//super(title);
		System.out.println(title + "������ ����");
	}

	public static void main(String[] args) {
		
		 ThreadTest_0705 obj_1 = new ThreadTest_0705("ù ��°");
		 ThreadTest_0705 obj_2 = new ThreadTest_0705("�ε� ��°");
		 ThreadTest_0705 obj_3 = new ThreadTest_0705("������ ��°");
		 ThreadTest_0705 obj_4 = new ThreadTest_0705("�׳׳׳� ��°");
		 
//		 Thread obj_1 = new Thread(ThreadTest_0705("ù ��°"));
//		 Thread obj_2 = new Thread(ThreadTest_0705("�ε� ��°"));             �̰Ŷ� ������ ����
//		 Thread obj_3 = new Thread(ThreadTest_0705("������ ��°"));
//		 Thread obj_4 = new Thread(ThreadTest_0705("�׳׳׳� ��°"));
		 		 
		 obj_1.setPriority(Thread.MAX_PRIORITY);
		 obj_2.setPriority(Thread.MIN_PRIORITY);
		 obj_3.setPriority(7);
		 
			Thread thread_1 = new Thread(obj_1);
			Thread thread_2 = new Thread(obj_2);
			Thread thread_3 = new Thread(obj_3);
			Thread thread_4 = new Thread(obj_4);
			
			thread_1.start();
			thread_2.start();
			thread_3.start();
			thread_4.start();
		 
		 System.out.println(" �� �������� �켱 ���� ");
		 System.out.println( "obj_1 : " + obj_1.getPriority() + " , obj_2 : " + obj_2.getPriority());
		 System.out.println( "obj_3 : " + obj_3.getPriority() + " , obj_4 : " + obj_4.getPriority());

	}
	//�ƹ��͵� �� ���� �⺻����(default) 5���� �ȴ�.
	@Override
	public void run() { 
		for (int i = 0; i < 5; i++) {
			System.out.println("[" + i + "]" + title + "���� ��" );
			
		}
		
		System.out.println(title + " ���� ����");
	}

}

package java_0709;

public class RunnableTest_2 {
	public static void main(String[] args) {
		
		MyRunnable_2 obj_1 = new MyRunnable_2("ù ��°		");
		MyRunnable_2 obj_2 = new MyRunnable_2("�� �� ��°		");
		MyRunnable_2 obj_3 = new MyRunnable_2("�� �� �� ��°	");
		MyRunnable_2 obj_4 = new MyRunnable_2("�� �� �� �� ��°	");
		
		Thread thread_1 = new Thread(obj_1);
		Thread thread_2 = new Thread(obj_2);
		Thread thread_3 = new Thread(obj_3);
		Thread thread_4 = new Thread(obj_4);
		
		thread_1.start();
		thread_2.start();
		thread_3.start();
		thread_4.start();
		
	}
	
}

class MyRunnable_2 implements Runnable {
	
	private String title;
	
	public MyRunnable_2(String name) {
		
		title = name;
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0; i <5; i++) {
				
				Thread.sleep(1000);  //�ݵ�� ����ó�� �����ֱ�
				System.out.println(" " + i + "�� " +title+ " : ������");
																 //getName �� �����忡 �ִ� method �̴�.
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

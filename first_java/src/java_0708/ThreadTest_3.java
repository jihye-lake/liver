package java_0708;

class MyThread_3 extends Thread
{
	
	public MyThread_3(String name) {
		
		super(name);
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0; i <5; i++) {
				Thread.sleep(1000);  //�ݵ�� ����ó�� �����ֱ�
				System.out.println(" " + i + "�� " +getName()+ " : ������");
																 //getName �� �����忡 �ִ� method �̴�.
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadTest_3 {
	public static void main(String[] args) {
		
		MyThread_3 obj_1 = new MyThread_3("ù ��°		");
		MyThread_3 obj_2 = new MyThread_3("�� �� ��°		");
		MyThread_3 obj_3 = new MyThread_3("�� �� �� ��°	");
		MyThread_3 obj_4 = new MyThread_3("�� �� �� �� ��°	");
		
		obj_1.start();
		obj_2.start();
		obj_3.start();
		obj_4.start();
		
	}

}

package java_0708;

class MyThread_2 extends Thread
{
	@Override
	public void run() {
		try {
			for(int i = 0; i < 20; i++) {
				
				Thread.sleep(1000);
				System.out.println("" +i+ "�� Thread!");
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadTest_2 {
	public static void main(String[] args) {
		
		MyThread_2 thread_1 = new MyThread_2();
		
		thread_1.start(); //2���� �����尡 ���� �ִ�. main�� �������̴�.
		//start �� ���� Thread �� ����, run(method) �� ���� Thread �� ���� ��µ� ������ main �� ��µȴ�(run�� �޼ҵ� ȣ���� ��).
		
		try {
			for(int i = 0; i < 20; i++) {
				Thread.sleep(1000);
				System.out.println("" +i+ "�� main!");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

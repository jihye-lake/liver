package java_0709;

class ThreadTest extends Thread {
	
	public ThreadTest(String str) {
		super(str);
	}
	@Override
	public void run() {
		System.out.println(getName() + " ������");
	}
}

public class ThreadTest_0701 {
	public static void main(String[] args) {
		
		ThreadTest obj_1 = new ThreadTest("33��");
		ThreadTest obj_2 = new ThreadTest("55555��");
		ThreadTest obj_3 = new ThreadTest("77777777��");
		
		obj_1.setPriority(Thread.MAX_PRIORITY);  //�켱������ �ο��� �� �ִ�. �����δ� 10, 5, 1�� ���� �Ͱ� ����.
		obj_2.setPriority(Thread.NORM_PRIORITY);
		obj_3.setPriority(Thread.MIN_PRIORITY);
		
		obj_3.start();
		obj_2.start();
		obj_1.start();
		
		
	}

}

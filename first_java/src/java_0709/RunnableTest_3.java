package java_0709;


class Runnable_3 implements Runnable {

	@Override
	public void run() {
		
		for (int i = 1; i < 20; i++) {
			System.out.print("\t" + i);
			if (i % 5 == 0) {
				System.out.println();
				
			}
		}
		
	}
	
}

public class RunnableTest_3 {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable_3()); //�� �ٷ� ���� �� �ѹ��� ���������ν� 5�ܰ踦 4�ܰ�� �ٿ���.
		//=Runnable_3 obj = new Runnable_3();
		//=Thread thread = new Thread(obj);               ������ �̷��� �� ��¥����.
		
		thread.start();
		
		
	}

}

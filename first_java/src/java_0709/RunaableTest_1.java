package java_0709;


class Runnable_1 implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 20; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(" " +i+ " �� " +i+ "*" +i + "=" + (i*i));
		}
		
	}
	
}

public class RunaableTest_1 {
	public static void main(String[] args) {
		
		Runnable_1 obj = new Runnable_1();  //�տ� �Ͱ� ����� ������ ���̴�? 
		
		Thread thread = new Thread(obj);  //�Ű������� ���⿡ �־��ش� �׸��� �װ� ȣ���ϴ� �� �̰� Runnable interface �� ����ϴ� ����̴�
		
		thread.start();
		
	}

}

package java_0709;

public class ThreadTest_0706 implements Runnable {
	
	private int[] temp;
	
	public ThreadTest_0706() {
		temp = new int[10];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (int)(Math.random()*(51) + 150);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadTest_0706 obj_1 = new ThreadTest_0706();
		
		Thread thread = new Thread(obj_1, "첫번째");
		
		thread.start();
		
	}

	@Override
	public void run() {
		
		for (int start : temp) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("스레드 이름 : " + Thread.currentThread().getName());
			System.out.println("temp value : " + start);
			
		}

		
	}

}

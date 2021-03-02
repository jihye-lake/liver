package java_0708;

public class ThreadTest_5 {
	
	static long startTime = 0; //전역변수
	
	public static void main(String[] args) {
		
		MyThread_5 thread_1 = new MyThread_5();
		thread_1.start(); // => Thread 적용 결과 뒤죽박죽된다.
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 500; i++) {
		System.out.print("--");
	}
	
	System.out.println("\n 소요시간 11 : " +(System.currentTimeMillis() -startTime) + "\n");
		
	}

}

class MyThread_5 extends Thread {
	@Override
	public void run() {
		
		for(int i = 0; i < 500; i++) {
			
			System.out.print("||");
		}
		
		System.out.println("\n 소요시간 22 : " +(System.currentTimeMillis() -ThreadTest_5.startTime) + "\n");
	}
}

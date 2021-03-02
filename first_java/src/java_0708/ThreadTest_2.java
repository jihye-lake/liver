package java_0708;

class MyThread_2 extends Thread
{
	@Override
	public void run() {
		try {
			for(int i = 0; i < 20; i++) {
				
				Thread.sleep(1000);
				System.out.println("" +i+ "번 Thread!");
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadTest_2 {
	public static void main(String[] args) {
		
		MyThread_2 thread_1 = new MyThread_2();
		
		thread_1.start(); //2개의 스레드가 돌고 있다. main도 스레드이다.
		//start 를 쓰면 Thread 를 돌고, run(method) 을 쓰면 Thread 가 먼저 출력된 다음에 main 이 출력된다(run은 메소드 호출일 뿐).
		
		try {
			for(int i = 0; i < 20; i++) {
				Thread.sleep(1000);
				System.out.println("" +i+ "번 main!");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

package java_0709;

public class ThreadTest_0704 {
	public static void main(String[] args) {
		
		ThreadTest_3 obj_1 = new ThreadTest_3();
		ThreadTest_4 obj_2 = new ThreadTest_4();
		ThreadTest_5 obj_3 = new ThreadTest_5();
		
		obj_1.start();
		
		try {
			obj_1.join();  //join 을 해주면 해당 스레드가 완전히 끝마칠 때까지 기다렸다가 다른 스레드가 나오게 한다는 뜻이다.
							   //다른 스레드에 join 을 해주지 않는다면 join을 해 준 스레드를 제외하고는 뒤죽박죽 Thread 형으로 나온다.
							   //1번 스레드가 아니라 다른 스레드를 join 시켜주려면 1번의 위치를 바꿔주어야 한다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		obj_2.start();
		obj_3.start();
		
	}

}

class ThreadTest_3 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
			
		}
	}
}

class ThreadTest_4 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
	}
}

class ThreadTest_5 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("%");
		}
	}
}
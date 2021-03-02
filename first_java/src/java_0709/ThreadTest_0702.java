package java_0709;


public class ThreadTest_0702 {
	public static void main(String[] args) {
		
		ThreadTest_1 obj_1 = new ThreadTest_1();
		ThreadTest_2 obj_2 = new ThreadTest_2();
		ThreadTest_2_1 obj_3 = new ThreadTest_2_1();
		
		obj_1.setPriority(1); //Thread.MAX_PRIORITY 대신 숫자를 넣을 수 있음. 숫자가 높을 수록 높은 우선순위라는 뜻.
		obj_2.setPriority(2);
		obj_3.setPriority(9);
		
		
		obj_3.start();
		obj_2.start();
		obj_1.start();
		
		
	}

}

class ThreadTest_1 extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i < 500; i++) {
			System.out.print("-");
			
			for (int j = 0; j < 10000000; j++);
			
			
		}
	}
}

class ThreadTest_2 extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i < 500; i++) {
			System.out.print("|");
			
			for (int j = 0; j < 10000000; j++);
		}
	}
	
}

class ThreadTest_2_1 extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i < 500; i++) {
			System.out.print("*");
			
			for (int j = 0; j < 10000000; j++);
			
		}
	}
}
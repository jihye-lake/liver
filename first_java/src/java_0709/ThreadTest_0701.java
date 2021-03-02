package java_0709;

class ThreadTest extends Thread {
	
	public ThreadTest(String str) {
		super(str);
	}
	@Override
	public void run() {
		System.out.println(getName() + " 스레드");
	}
}

public class ThreadTest_0701 {
	public static void main(String[] args) {
		
		ThreadTest obj_1 = new ThreadTest("33번");
		ThreadTest obj_2 = new ThreadTest("55555번");
		ThreadTest obj_3 = new ThreadTest("77777777번");
		
		obj_1.setPriority(Thread.MAX_PRIORITY);  //우선순위를 부여할 수 있다. 실제로는 10, 5, 1을 쓰는 것과 같다.
		obj_2.setPriority(Thread.NORM_PRIORITY);
		obj_3.setPriority(Thread.MIN_PRIORITY);
		
		obj_3.start();
		obj_2.start();
		obj_1.start();
		
		
	}

}

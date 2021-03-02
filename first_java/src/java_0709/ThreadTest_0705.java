package java_0709;

public class ThreadTest_0705 extends Thread {
	
	int delay;
	
	public ThreadTest_0705(String title) {
		super(title);
		System.out.println(getName() + "스레드 시작");
	}

	public static void main(String[] args) {
		
		 ThreadTest_0705 obj_1 = new ThreadTest_0705("첫 번째");
		 ThreadTest_0705 obj_2 = new ThreadTest_0705("두두 번째");
		 ThreadTest_0705 obj_3 = new ThreadTest_0705("세세세 번째");
		 ThreadTest_0705 obj_4 = new ThreadTest_0705("네네네네 번째");
		 
		 obj_1.setPriority(MAX_PRIORITY);
		 obj_2.setPriority(MIN_PRIORITY);
		 obj_3.setPriority(7);
		 //아무것도 안 쓰면 기본값은(default) 5번이 된다. => 4번은 5가 됨(default 값은 5)
		 
		 System.out.println(" 각 스레드의 우선 순위 ");
		 System.out.println( "obj_1 : " + obj_1.getPriority()+ " , obj_2 : " + obj_2.getPriority());
		 System.out.println( "obj_3 : " + obj_3.getPriority()+ " , obj_4 : " + obj_4.getPriority());
		 
		 obj_1.start();
		 obj_2.start();
		 obj_3.start();
		 obj_4.start();
		
	}
	@Override
	public void run() { 
		for (int i = 0; i < 5; i++) {
			System.out.println("[" + i + "]" + getName() + "실행 중" );
			
		}
		
		System.out.println(getName() + " 실행 종료");
	}

}

package java_0709;

public class RunnableTest_4 implements Runnable {
	
	int delay;
	
	private String title;
	
	public RunnableTest_4(String name) {  //혹은 String title
		title = name;  //혹은 this.title = title;
		//super(title);
		System.out.println(title + "스레드 시작");
	}

	public static void main(String[] args) {
		
		 ThreadTest_0705 obj_1 = new ThreadTest_0705("첫 번째");
		 ThreadTest_0705 obj_2 = new ThreadTest_0705("두두 번째");
		 ThreadTest_0705 obj_3 = new ThreadTest_0705("세세세 번째");
		 ThreadTest_0705 obj_4 = new ThreadTest_0705("네네네네 번째");
		 
//		 Thread obj_1 = new Thread(ThreadTest_0705("첫 번째"));
//		 Thread obj_2 = new Thread(ThreadTest_0705("두두 번째"));             이거랑 위에랑 같음
//		 Thread obj_3 = new Thread(ThreadTest_0705("세세세 번째"));
//		 Thread obj_4 = new Thread(ThreadTest_0705("네네네네 번째"));
		 		 
		 obj_1.setPriority(Thread.MAX_PRIORITY);
		 obj_2.setPriority(Thread.MIN_PRIORITY);
		 obj_3.setPriority(7);
		 
			Thread thread_1 = new Thread(obj_1);
			Thread thread_2 = new Thread(obj_2);
			Thread thread_3 = new Thread(obj_3);
			Thread thread_4 = new Thread(obj_4);
			
			thread_1.start();
			thread_2.start();
			thread_3.start();
			thread_4.start();
		 
		 System.out.println(" 각 스레드의 우선 순위 ");
		 System.out.println( "obj_1 : " + obj_1.getPriority() + " , obj_2 : " + obj_2.getPriority());
		 System.out.println( "obj_3 : " + obj_3.getPriority() + " , obj_4 : " + obj_4.getPriority());

	}
	//아무것도 안 쓰면 기본값은(default) 5번이 된다.
	@Override
	public void run() { 
		for (int i = 0; i < 5; i++) {
			System.out.println("[" + i + "]" + title + "실행 중" );
			
		}
		
		System.out.println(title + " 실행 종료");
	}

}

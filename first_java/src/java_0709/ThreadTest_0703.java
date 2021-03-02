package java_0709;

public class ThreadTest_0703 extends Thread {
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		ThreadTest_0703 obj = new ThreadTest_0703();
		
		obj.setDaemon(true);  //데몬 스레드 : 주 스레드(여기서는 main) 작업을 돕는 역할을 하는 스레드. 
										 //주 스레드가 종료되면 데몬 스레드는 강제적으로 종료됨.
									 	 //그 이유는 주 스레드의 보조 역할을 수행하므로
									   	 //주 스레드가 종료되면 데몬 스레드의 존재 이유가 없어지기 때문이다
										 //setDaemon(true) 는 start() 호출전에 설정
										 //작업 파일이 저장되었습니다 => 가 계속 나온다. 무한루프에 빠짐
		
		obj.start();
		
		for (int i = 0; i <= 20; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println();
			}
			
			System.out.println(i);
			
			if (i == 5) {  //5가 됐을 때 true로 바꾸고 3초마다 저장이 됨
				
				autoSave = true;
				
			}
			
		}
		
		System.out.println(" 프로그램 종료 ");
		
	}
	
	@Override
	public void run() {
		
		while (true) {
			
			try {
				Thread.sleep(3*1000); //3초마다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (autoSave) {
				autoSave();
			}
		
		}
		
	}

	private void autoSave() {
		System.out.println("작업 파일이 저장 되었습니다.");
		
	}

}

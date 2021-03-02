package java_0708;

class MyThread extends Thread { //Thread 상속받은 MyThread

	public void run() {
		
		
		try {
		for(int i = 0; i <20 ; i++) {
			
				Thread.sleep(1000);  //생성없이 사용가능한 메소드(예외처리 InterruptedException 해주기)
											 //1초에 한번씩 20까지 곱하기
				System.out.println(" " + i + "번 : " + i + "*" + i + "=" + (i*i));
		}	
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}


public class ThreadTest_1 {
	public static void main(String[] args) {
		
		MyThread thread = new MyThread();
		thread.start(); //run 이 시작된다는 뜻 start 대신 run을 쓰면 Thread 가 아님.
		
	}

}

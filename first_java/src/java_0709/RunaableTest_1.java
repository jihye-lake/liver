package java_0709;


class Runnable_1 implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 20; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(" " +i+ " 번 " +i+ "*" +i + "=" + (i*i));
		}
		
	}
	
}

public class RunaableTest_1 {
	public static void main(String[] args) {
		
		Runnable_1 obj = new Runnable_1();  //앞에 것과 결과는 같은데 차이는? 
		
		Thread thread = new Thread(obj);  //매개변수로 여기에 넣어준다 그리고 그걸 호출하는 것 이게 Runnable interface 를 사용하는 방법이다
		
		thread.start();
		
	}

}

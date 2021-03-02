package java_0709;


class Runnable_3 implements Runnable {

	@Override
	public void run() {
		
		for (int i = 1; i < 20; i++) {
			System.out.print("\t" + i);
			if (i % 5 == 0) {
				System.out.println();
				
			}
		}
		
	}
	
}

public class RunnableTest_3 {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable_3()); //두 줄로 적을 걸 한번에 적어줌으로써 5단계를 4단계로 줄였다.
		//=Runnable_3 obj = new Runnable_3();
		//=Thread thread = new Thread(obj);               원래는 이렇게 두 줄짜리다.
		
		thread.start();
		
		
	}

}

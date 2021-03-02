package java_0708;

public class ThreadTest_4 {
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 500; i++) {
			
			System.out.print("--");
		}
		
		System.out.println("\n 소요시간 11 : " +(System.currentTimeMillis() -startTime) + "\n");
																			 //현재 시간을 갖고 있음

		for(int i = 0; i < 500; i++) {
			
			System.out.print("||");
		}
		
		System.out.println("\n 소요시간 22 : " +(System.currentTimeMillis() -startTime));
	}

}

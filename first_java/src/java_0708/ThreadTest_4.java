package java_0708;

public class ThreadTest_4 {
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 500; i++) {
			
			System.out.print("--");
		}
		
		System.out.println("\n �ҿ�ð� 11 : " +(System.currentTimeMillis() -startTime) + "\n");
																			 //���� �ð��� ���� ����

		for(int i = 0; i < 500; i++) {
			
			System.out.print("||");
		}
		
		System.out.println("\n �ҿ�ð� 22 : " +(System.currentTimeMillis() -startTime));
	}

}

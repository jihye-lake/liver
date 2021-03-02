package java_0712;

import java.util.Random;

public class Nansu_2 {
	public static void main(String[] args) {
		
		//seed 값을 주지 않을 경우 일정한 패턴으로 난수가 발생할 수 있다.		
		Random rnd = new Random(System.currentTimeMillis());
															//current- 를 써주면 항상 바뀌는 난수가 된다.
															//안 쓰면 항상 지정된 범위 내의 난수가 나올 수 있음.
		
		int count = 0;
		
		for (int i = 0; i < 100; i++) {
//			System.out.print(rnd.nextBoolean() + "\t");
			System.out.printf("%11d\t" , rnd.nextInt());
			
			count ++;			
			if (count % 3 == 0) {
				System.out.println();
				
			}
			
		}
		
	}

}

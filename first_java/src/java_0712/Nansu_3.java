package java_0712;

import java.util.Random;

public class Nansu_3 {
	public static void main(String[] args) {
		
		Random rnd = new Random(System.currentTimeMillis());
		
			
//			System.out.println("float형 난수	: " + rnd.nextFloat());
//			System.out.println("boolean형 난수	: " + rnd.nextBoolean());
//			System.out.println("int형 난수		: " + rnd.nextInt());
//			System.out.println("long형 난수 	: " + rnd.nextLong());
//			System.out.println("double형 난수	: " + rnd.nextDouble());
			
			int count = 0;
			
			for (int i = 0; i < 100; i++) {
			
			System.out.print((int)((300 + 150 +1) * rnd.nextDouble()) -150 + " ");
			count ++;															//Float | Double 만 가능 int 는 소수점을 나타낼 수 없으니까 안 됨
			
			if (count % 10 == 0) {
				System.out.println();
				
			}
			
//			int rndInt =rnd.nextInt(300-(150)+1)-150;
//	        System.out.println("int형 난수 범위(100~200) : " + rndInt);
			
		}
	}

}

package java_0712;

import java.util.Random;

public class Nansu_3 {
	public static void main(String[] args) {
		
		Random rnd = new Random(System.currentTimeMillis());
		
			
//			System.out.println("float�� ����	: " + rnd.nextFloat());
//			System.out.println("boolean�� ����	: " + rnd.nextBoolean());
//			System.out.println("int�� ����		: " + rnd.nextInt());
//			System.out.println("long�� ���� 	: " + rnd.nextLong());
//			System.out.println("double�� ����	: " + rnd.nextDouble());
			
			int count = 0;
			
			for (int i = 0; i < 100; i++) {
			
			System.out.print((int)((300 + 150 +1) * rnd.nextDouble()) -150 + " ");
			count ++;															//Float | Double �� ���� int �� �Ҽ����� ��Ÿ�� �� �����ϱ� �� ��
			
			if (count % 10 == 0) {
				System.out.println();
				
			}
			
//			int rndInt =rnd.nextInt(300-(150)+1)-150;
//	        System.out.println("int�� ���� ����(100~200) : " + rndInt);
			
		}
	}

}

package java_0712;

import java.util.Random;

public class Nansu_2 {
	public static void main(String[] args) {
		
		//seed ���� ���� ���� ��� ������ �������� ������ �߻��� �� �ִ�.		
		Random rnd = new Random(System.currentTimeMillis());
															//current- �� ���ָ� �׻� �ٲ�� ������ �ȴ�.
															//�� ���� �׻� ������ ���� ���� ������ ���� �� ����.
		
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

package java_0712;

public class Nansu_1 {
	public static void main(String[] args) {
		
		int xx = 15; //���Ѱ�
		int yy = 27; //���Ѱ�
		int count = 0;
		
		// ���� �߻� ���� (����ȭ)((���Ѱ� - ���Ѱ� +1) *�����߻�) + ���Ѱ� => �Ǽ�ȭ �Ǿ��ֱ� ������ ����ȭ������
		
		System.out.println( xx + "~" + yy + "���� ���� �߻�\n");
		
		for (int i = 0; i < 100; i++) {
			
			System.out.print((int)((yy-xx+1)*Math.random()) + xx+ " ");
			count ++;
			
			if (count % 10 == 0) {
				System.out.println();
				
			}
		}
		
	}

}

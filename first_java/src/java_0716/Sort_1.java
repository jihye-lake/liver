package java_0716;

public class Sort_1 {
	public static void main(String[] args) {
		
		int[] eng = {77,58,49,84,63,92,74};
		
		System.out.println("\n----------------���� ��----------------\n");
		
		for (int i = 0; i < eng.length; i++) {  
			System.out.print(eng[i] + "\t");			
		}
		
		System.out.println("\n\n------------�������� ����--------------\n");
		//��������(Selection) : �ӵ��� �������� ���� �����ϱ� ���� ����
		for (int i = 0; i < eng.length-1; i++) {  //���������� �� �ʿ� ����. �� �ܰ� �������� ���� �Ǵϱ� -1
			for (int j = i+1; j < eng.length; j++) {  //�ڱ� �ڽŰ��� ���� �ʿ� �����Ƿ� �� �ܰ� ���� j = i+1 �� ��
				
				if (eng[i] < eng[j]) {  //�������� �����̴� ������ �ٲ��(�׻� ������ ����) // ���ڿ��̸� compareto �� ���
					int temp = eng[i];
					eng[i] = eng[j];
					eng[j] = temp;
					
				}
				
			}
			
		}
		
		for (int i = 0; i < eng.length; i++) {   //������ �Ŀ� �ٽ� ��
			System.out.print(eng[i] + "\t");	
			
		}
	}

}

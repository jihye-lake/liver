package java_0712;

public class String_11_1 {
	public static void main(String[] args) {
		
		int[] kor = { 67,89,45,87,73,35,93 };
		
		System.out.println("\n*** ���� �� ���� ���ڿ� ***\n");
		
		for (int i = 0; i < kor.length; i++) {
			System.out.print(kor[i] + "\t");			
		}
		
		System.out.println("\n\n*** ���� �� ���� ���ڿ� ***\n");
		
		for (int i = 0; i < kor.length - 1; i++) {
			for (int j = i+1; j < kor.length; j++) {  //���Ľ� �ܿ��
				
				if (kor[i] > kor[j]) {  // > �� ��������, < �� ��������
					int temp = kor[i];
					kor[i] = kor[j];       //�� ���� ������ �����ܿ��� �ߴ� "������" ��
					kor[j] = temp;
					
				}
			}
		}
		for (int i = 0; i < kor.length; i++) {
			System.out.print(kor[i] + "\t");	
		}
	}

}
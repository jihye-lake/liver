package java_0712;

public class String_11 {
	public static void main(String[] args) {
		
		String[] str = {"���", "�ڹ�", "love", "Love", "��", "��", "��", "��", "��"};
		
		System.out.println("\n*** ���� �� ���� ���ڿ� ***\n");
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + '\t');			
		}
		System.out.println("\n\n*** ���� �� ���� ���ڿ� ***\n");
		
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {  //���Ľ� �ܿ��
				
				if (str[i].compareTo(str[j]) > 0) {  //0���� ũ�� ���������̰�, 0���� ������ ��������
					String temp = str[i];
					str[i] = str[j];       //�� ���� ������ �����ܿ��� �ߴ� "������" ��
					str[j] = temp;
					
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + '\t');	
		}
	}

}

package java_0712;

public class String_4 {
	public static void main(String[] args) {
		
		int i;
		
		String str = "2019 WorldCup Korea";
		
		System.out.println("���� ���ڿ� : " + str);
		System.out.print("���ڿ� ������ : ");
		
		for (int j = str.length()-1; j >= 0; j--) {  //index �� 0������ �����ϴϱ� �������� -1 ���ֱ�
			
			System.out.print(str.charAt(j));	 //charAt �߿��� �޼ҵ���!0
		}
		
		System.out.print("\n ¦�� ���ڿ� : ");
		
		for (int j = 0; j < str.length(); j++) {
			
			if (j % 2 != 0) {  // != ������ �� ��Ȯ�ϰ� ������ ������ ���� ����.
				
				System.out.print(str.charAt(j));
				
			} else {
				System.out.print(" ");
				
			}
			
		}
		
	}

}

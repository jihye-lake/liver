package java_0715;

public class String_13 {
	
	static String str_1;
	static String str_2 = "";
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			str_1 += i;
			str_2 += i;
			
		}
		
		System.out.println("str_1 : " + str_1);  //null �� �� �տ� ���� �� ��? �ʱ�ȭ�� ��Ű�� �ʾұ� ������ , null �� ����� Ű����
		System.out.println("str_2 : " + str_2);
		
		System.out.println();
		
		System.out.println("str_1 & str_2 : " + ((str_1.equals(str_2))? "����" : "�ٸ�"));
		System.out.println("str_1 & str_2 : " + ((str_1.equalsIgnoreCase(str_2))? "����" : "�ٸ�"));
		//���� str_1 ������ �ʱ�ȭ ��Ű�ų�, str_2 ������ �ʱ�ȭ ��Ű�� ������ ������ ������ ��
		
	}

}

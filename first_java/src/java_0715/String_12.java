package java_0715;

public class String_12 {
	public static void main(String[] args) {
		
		String str_1 = "JAVA";
		String str_2 = "java";
		
		System.out.println("���ڿ�1 : " + str_1);
		System.out.println("���ڿ�2 : " + str_2);
		
		//3�� ������ : ������ ����ǥ �ڿ�, Ʋ���� �ݷ� ���� ���� ������
		System.out.println("JAVA & java : " + ((str_1.equals(str_2))? "������" : "Ʋ��"));  //�����
		System.out.println("JAVA & java : " + ((str_1.equalsIgnoreCase(str_2))? "������" : "Ʋ��"));  //��ҹ��� �������� �ܾ ��
		
	}

}

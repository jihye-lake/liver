package java_0712;

public class String_3 {
	public static void main(String[] args) {
		
		char[] char_str = new char[15];
		
		String  str = "���� ������ �� �ÿ��մϴ�.";
		
		System.out.println("str ���� : " +str);
		System.out.println("str ���� �� : " +str.length()); //String �� ���ڿ��� ���̸� ���� ���� length��� �޼ҵ� ���		
		str.getChars(3, 10, char_str, 0);
		
		System.out.println("char_str ���� : " + char_str.length); //String �� �迭�� ���̸� ���� ���� length ��� �ʵ带 ����Ѵ�.
		
		for (int i = 0; i < char_str.length; i++) { //3���� 10�ձ����ϱ� "������ �� ��" ��
			System.out.print(char_str[i]);
			
		}
	}

}

package java_0712;

public class String_12 {
	public static void main(String[] args) {
		
		String str = "���� ���� ���� �ָ� ����. ���� �Ͼ�� ���� ���̸� �ݴ´�.";
		
		System.out.println("�˻��� ���ڿ� \n" + str);
		System.out.println("indexOf(��)		: " + str.indexOf("��")); //ó������ ���� ã�´�.
		System.out.println("indexOf(��,10)		: " + str.indexOf("��",10)); //10������ ���� ã�ƶ� ��� �ֳ�
		System.out.println("lastIndexOf(��)		: " + str.lastIndexOf("��")); //������ ���ں��� ���� ã�´�.
		System.out.println("lastIndexOf(��, 10)	: " + str.lastIndexOf("��", 10)); //������ 10��° �̻���� ���� ã�´�.
	}

}

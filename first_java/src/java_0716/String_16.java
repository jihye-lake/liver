package java_0716;

public class String_16 {
	public static void main(String[] args) {
		
		String fullName = "Korea.java";
		
		//fullName ���� '.' ���� ��ġ�� ã�´�.
		
		int index = fullName.indexOf('.');  //indexOf => index ��ġ ã��
		System.out.println(index); //5�� ����. �� �ձ�����
		
		//fullName �� ù ��° ���ں��� '.' �� �ִ� ������ ���ڿ��� ����
		String fileName = fullName.substring(0,index);  //0,1,2,3,4 (index 5 �ձ����̱� ������)
		
		// '.' ���� ���ں��� ���� ���ڿ� ������ ����
		String ext = fullName.substring(index + 1);  //5+1 ���� ������ �����ϱ� java �� ����
		//== 										  ((index + 1), fullName.length());
		
		System.out.println(fullName + "�� Ȯ���ڸ� ������ �̸� : " + fileName);
		System.out.println(fullName + "�� Ȯ���ڴ� : " + ext);
		
		//�̰� �����̸��� Ȯ���ڸ� ������ �� �ִ� ����̴�.
	}

}

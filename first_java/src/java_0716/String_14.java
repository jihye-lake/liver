package java_0716;

public class String_14 {
	public static void main(String[] args) {
		
		char[] cc_array = new char[3];  //�迭���� = 0
		
		String str = new String(cc_array);
		
		System.out.println("cc_array.length : " + cc_array.length);  //length �ʵ�
		System.out.println("str.length : " + str.length());  //length �޼ҵ�
		System.out.println("$$$$$" + str  + "*****"); //�迭�� 0�� �ƴ� �ٸ� ������ �������ָ� str �� �׸�ŭ ������ �����
	}

}

package java_0712;

public class String_1 {
	public static void main(String[] args) {
		
		char[] ss = {'K', 'o', 'r', 'e', 'a'};
		
		String str1 = "Hello";  //���ڿ� ����
		
		String str2 = new String("java");  //���ڿ� ������
		
		String str3 = new String(ss);  //���� �迭�� �̿��� ������
		
		System.out.println(ss);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1 + str2 + str3);
	}

}

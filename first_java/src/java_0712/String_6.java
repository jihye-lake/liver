package java_0712;

public class String_6 {
	public static void main(String[] args) {
		
		String str = "�ڹٴ� ���� ����ֽ��ϴ�.";
		
		System.out.println(str.substring(1));  //1�� ���� �����ؼ� ���������� �� �̾ƶ�
		System.out.println(str.substring(4,7)); //4������ �����ؼ� 7�� �ձ��� �̾ƶ�
		System.out.println(str.substring(6,9));  //6������ �����ؼ� 9�� �ձ��� �̾ƶ�
		System.out.println(str.substring(4,5));  //"��" �� ���ڸ� �̱�
	}
}

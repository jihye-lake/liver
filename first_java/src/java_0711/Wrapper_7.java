package java_0711;

public class Wrapper_7 {
	public static void main(String[] args) {
		
		char[] obj = new char[args[0].length()];
		
		args[0].getChars(0, args[0].length(), obj, 0); //���ڸ� ������ ������ŭ ������ �����(�ǳʶٰ�) �� �������� ������ �ȴ�.
		//args[0] �� �ִ� String �߿��� �ϳ��� ���ڸ� �����Ͷ� ������? 0������ ������
		//�� ������ obj �� 0������ ����־��
		//����ִ� ���ڿ����� ���ڸ� �ϳ��� ���� �� �� �����
		//�ѱ��ھ� �����ٰ� �迭�� ��´�
		
		for (int i = 0; i < obj.length; i++) { //0������ 13������ ����
			
			System.out.println("\t �Էµ� ���� : [" + obj[i] + "]");
			
			if (Character.isDefined(obj[i])) {
				System.out.println("\t �����ڵ� �Դϴ�.");
				}
			
			if (Character.isLetter(obj[i])) {
				System.out.println("\t ���� �Դϴ�.");
			}
			
			if (Character.isDigit(obj[i])) {
				System.out.println("\t �������� �Դϴ�.");
			}
			
			
		}
	}

}

package java_0708;

class UserException extends Exception {  //�� ����� ��������ǿ����� ���� ��
	public UserException(String str) {
		super(str);
	}
}

class CJHException extends Exception {
	public CJHException(String str) {
		super(str);
	}
}

public class UserExceptionTest {
	public static void main(String[] args)  {
		
		int a = 33;
		try {
			if(a % 5 != 0) {
				throw new UserException("5�� ����� �ƴմϴ�.");  //���� �߻� (String �̴� Line 4�� �Ѿ�� �ű⼭ super(str)�� �Ѿ�� ����� Exception�� ����.
			}
		} catch (UserException e) {
			e.printStackTrace();  //��� ������ �߻��ߴ��� ��ġ�� �˷��ֱ� ���� ���(eclipse�� default ��)
			System.out.println(e.getMessage()); //�� ���� �޼����� �������� �˷��ֱ� ���� ���
		}
		
		int c = 22;
		
		try {
			if(c / 22 == 1) {
			throw new CJHException("c �� ���� 22�Դϴ�.");
			}
		} catch (CJHException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			
		} finally {
			System.out.println("=============================");
		}
		
	}

}

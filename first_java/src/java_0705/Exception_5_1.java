package java_0705;

import java.io.IOException;

public class Exception_5_1 {
	public static void main(String[] args) {
		
		try {
			System.out.println("===============���� �߻� ��==================");
			//throw new NumberFormatException("���� ��ȯ ���� �߻�");
			//throw new IOException("����� ���� �߻�");
			throw new ArithmeticException("���� ��ȯ ���� �߻�");
			//throw �� �� �� ���� �� ��. �ϳ��� �ּ�ó���ϰ� �ϳ��� ����.
			
		} catch (NumberFormatException e) {
			System.out.println("���� ���� ���� : " + e);
			e.printStackTrace();
			
			System.out.println("���������� ���� ���� : " + e.getMessage());
			
		} catch (ArithmeticException e) {
			System.out.println("���� ��ȯ ���� �߻�"); 
			e.printStackTrace();
			
//		} catch (IOException e) {
//			System.out.println("����� ���� �߻� : " + e);
//			e.printStackTrace();
		}
	}

}

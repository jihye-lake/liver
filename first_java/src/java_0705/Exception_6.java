package java_0705;

import java.io.IOException;  // import ���� �ʾҴ� class �̱� ������ import ������� ��
									    // java.lang �� ������� ���� class �̱� ������ import �ϱ�

public class Exception_6 {
	public static void main(String[] args) {
		
		try {
			IOException eee = new IOException("���� ���� �߻�");
			//Exception eee = new Exception("���� ���� �߻�");
			
			throw eee;
			
		} catch (IOException e) {
		// } catch (IOException e) {
			System.out.println("���� ���� IOException : " + e);
			System.out.println("Exception�߻� : " + e); 
			e.printStackTrace();
		}
	}

}

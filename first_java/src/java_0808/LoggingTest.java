package java_0808;

import java.util.logging.Logger;

public class LoggingTest {
	
	public static void main(String[] args) {
		String filename = "test.dat";
//		Logger.getGlobal().info(filename + " ������ �����Ͽ��� ");			// ����
//		Logger.getGlobal().warning(filename + " ������ �����Ͽ��� ");	// ���
		Logger.getGlobal().severe(filename + " ������ �����Ͽ��� ");		// �ɰ�
	}

}

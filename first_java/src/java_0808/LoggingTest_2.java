package java_0808;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingTest_2 {
	private static final Logger logger = Logger.getLogger("kr.co.company.app");
	
	public static void main(String[] args) {
		logger.info("�α��� ���۵˴ϴ�...");
//		logger.warning("�α��� ���۵˴ϴ�...");
//		logger.severe("�α��� ���۵˴ϴ�...");
		try {
			throw new Exception("���������� ���ܸ� �߻���Ų��.");
			// ���������� ���� �߻���Ű��
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage(), e);		// SEVERE �� ���� �� ����
//			logger.log(Level.INFO, e.getMessage(), e);			// INFO �� ���� ���� ����
//			logger.log(Level.WARNING, e.getMessage(), e);	// WARNING �� �״������� ���� ����
		}
		
		logger.info("�Ϸ�Ǿ���...");
//		logger.warning("�Ϸ�Ǿ���...");
//		logger.severe("�Ϸ�Ǿ���...");
	}

}

package java_0708;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger_1 {

	private static final Logger logger = Logger.getLogger("kr.co.korea.app");  //new ���� ��ü�� �����?
	
	public static void main(String[] args) {
		
		logger.info("�α� ����");
		
		try {
			throw new Exception("���������� ���ܸ� �߻���ŵ�ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
			//logger.log(Level.SEVERE, e.getMessage(),e);
		}
		logger.info("�α� �Ϸ�");
	}
}

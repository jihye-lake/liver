package java_0708;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger_1 {

	private static final Logger logger = Logger.getLogger("kr.co.korea.app");  //new 없이 객체를 만든다?
	
	public static void main(String[] args) {
		
		logger.info("로깅 시작");
		
		try {
			throw new Exception("고의적으로 예외를 발생시킵니다.");
		} catch (Exception e) {
			e.printStackTrace();
			//logger.log(Level.SEVERE, e.getMessage(),e);
		}
		logger.info("로깅 완료");
	}
}

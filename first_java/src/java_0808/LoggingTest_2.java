package java_0808;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingTest_2 {
	private static final Logger logger = Logger.getLogger("kr.co.company.app");
	
	public static void main(String[] args) {
		logger.info("로깅이 시작됩니다...");
//		logger.warning("로깅이 시작됩니다...");
//		logger.severe("로깅이 시작됩니다...");
		try {
			throw new Exception("고의적으로 예외를 발생시킨다.");
			// 강제적으로 예외 발생시키기
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage(), e);		// SEVERE 가 가장 덜 쓰임
//			logger.log(Level.INFO, e.getMessage(), e);			// INFO 가 가장 많이 쓰임
//			logger.log(Level.WARNING, e.getMessage(), e);	// WARNING 가 그다음으로 많이 쓰임
		}
		
		logger.info("완료되었음...");
//		logger.warning("완료되었음...");
//		logger.severe("완료되었음...");
	}

}

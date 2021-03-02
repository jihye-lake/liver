package java_0808;

import java.util.logging.Logger;

public class LoggingTest {
	
	public static void main(String[] args) {
		String filename = "test.dat";
//		Logger.getGlobal().info(filename + " 파일을 오픈하였음 ");			// 정보
//		Logger.getGlobal().warning(filename + " 파일을 오픈하였음 ");	// 경고
		Logger.getGlobal().severe(filename + " 파일을 오픈하였음 ");		// 심각
	}

}

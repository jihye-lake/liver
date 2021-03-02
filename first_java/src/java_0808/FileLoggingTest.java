package java_0808;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileLoggingTest {
	private static final Logger logger = Logger.getLogger(FileLoggingTest.class.getName());

	public static void main(String[] args) throws IOException {
		Handler handler = new FileHandler("logging.txt"); // FileHandler 가 이미 만들어져 있고, 가져다가 쓰겠다는 뜻

		logger.addHandler(handler);
		logger.setLevel(Level.SEVERE);
		logger.severe("info 레벨 메시지");

		logger.fine("fine 레벨 메시지");
		logger.finest("finest 레벨 메시지");

		handler.flush();
		// buffer 가 다 차기 전에 프로그램을 종료하면 buffer 에 들어있는 내용은 파일에 쓰여지지 않는다.
		// 그 때, flush() 를 호출하면 buffer 의 내용이 파일에 쓰여진다.
		// 사용자가 원할 때 버퍼를 비워주는 것으로 버퍼를 비우는 것을 IO에서는 출력하는 것이고,
		// 네트워크에서는 버퍼의 내용을 클라이언트나 서버로 보내는 것, *사용자가 원할 때*라는 말이 포인트.

		handler.close();
		// flush()와 close()를 같이 쓰는데, 사실 close 함수가 내부적으로 flush 함수를 호출합니다.

	}

}

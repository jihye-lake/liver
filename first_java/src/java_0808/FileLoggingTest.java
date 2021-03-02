package java_0808;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileLoggingTest {
	private static final Logger logger = Logger.getLogger(FileLoggingTest.class.getName());

	public static void main(String[] args) throws IOException {
		Handler handler = new FileHandler("logging.txt"); // FileHandler �� �̹� ������� �ְ�, �����ٰ� ���ڴٴ� ��

		logger.addHandler(handler);
		logger.setLevel(Level.SEVERE);
		logger.severe("info ���� �޽���");

		logger.fine("fine ���� �޽���");
		logger.finest("finest ���� �޽���");

		handler.flush();
		// buffer �� �� ���� ���� ���α׷��� �����ϸ� buffer �� ����ִ� ������ ���Ͽ� �������� �ʴ´�.
		// �� ��, flush() �� ȣ���ϸ� buffer �� ������ ���Ͽ� ��������.
		// ����ڰ� ���� �� ���۸� ����ִ� ������ ���۸� ���� ���� IO������ ����ϴ� ���̰�,
		// ��Ʈ��ũ������ ������ ������ Ŭ���̾�Ʈ�� ������ ������ ��, *����ڰ� ���� ��*��� ���� ����Ʈ.

		handler.close();
		// flush()�� close()�� ���� ���µ�, ��� close �Լ��� ���������� flush �Լ��� ȣ���մϴ�.

	}

}

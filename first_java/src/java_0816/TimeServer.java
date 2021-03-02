package java_0816;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TimeServer {
	public static void main(String[] args) {
		
		int port = 5555;  // ������ �̰� ������ �θ� Ŭ���̾�Ʈ�� �̰ɷ� �����Ѵ�.(1000~9999 ������ ���� �����ϱ�)
		// cmd ���� ipconfig �ļ� IP Ȯ��
		
		try {
			ServerSocket sos = new ServerSocket(port);  // sos ���ؼ� �ؿ��� ��û
			
			while (true) {
				Socket client = sos.accept();  // ������ Ŭ���̾�Ʈ�� �����ϱ⸦ ��ٸ��� �ְ�, ����Ǹ� ���ο� Socket ��ü�� �����Ͽ� ��ȯ�Ѵ�.
										// ���⼭ ��� ��ٸ�
				OutputStream os = client.getOutputStream();
				// ������ OutputStream �� ���Ͽ� Ŭ���̾�Ʈ�� ������ ������.
				
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date());  // ���� �ð� ������
				oos.flush();
				oos.close();
				client.close();				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

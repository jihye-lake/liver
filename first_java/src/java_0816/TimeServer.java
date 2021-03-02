package java_0816;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TimeServer {
	public static void main(String[] args) {
		
		int port = 5555;  // 서버가 이걸 설정해 두면 클라이언트는 이걸로 접근한다.(1000~9999 까지만 숫자 설정하기)
		// cmd 에서 ipconfig 쳐서 IP 확인
		
		try {
			ServerSocket sos = new ServerSocket(port);  // sos 통해서 밑에서 요청
			
			while (true) {
				Socket client = sos.accept();  // 서버는 클라이언트가 연결하기를 기다리고 있고, 연결되면 새로운 Socket 객체를 생성하여 반환한다.
										// 여기서 계속 기다림
				OutputStream os = client.getOutputStream();
				// 서버는 OutputStream 을 통하여 클라이언트에 정보를 보낸다.
				
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date());  // 현재 시간 보내기
				oos.flush();
				oos.close();
				client.close();				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

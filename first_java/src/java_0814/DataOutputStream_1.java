package java_0814;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_1 {
	public static void main(String[] args) throws IOException {
		
		File tFile = new File("c:\\temp_1\\data_11.txt");
		FileOutputStream fos = new FileOutputStream(tFile);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true); // 1byte
		dos.writeChar(99); // 2byte
		dos.writeByte(7); // 1byte
		dos.writeShort(100); // 2byte
		dos.writeInt(100); // 4byte
		dos.writeLong(1000); // 8byte
		dos.writeFloat(89.345f); // 4byte
		dos.writeDouble(4567.4322); // 8byte
		dos.flush(); // 보낸다는 뜻(이걸 해 주지 않으면 Buffer 에 들어있을 뿐이지 밖으로 보내주지 않는다)
		// 버퍼에 남은 출력 스트림 출력
		// flush() 메소드를 호출하지 않으면 버퍼로만 출력이 도기 때문에 실제로 도착지점에는 아무런 데이터를 받지 못하는 경우가 발생할 수 있다.
		
		System.out.println("data_11.txt에 " +dos.size()+ "byte 저장");
		// 왜 30byte 가 나올까
		dos.close();
		
	}

}

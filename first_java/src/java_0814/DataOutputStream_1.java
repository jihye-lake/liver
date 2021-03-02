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
		dos.flush(); // �����ٴ� ��(�̰� �� ���� ������ Buffer �� ������� ������ ������ �������� �ʴ´�)
		// ���ۿ� ���� ��� ��Ʈ�� ���
		// flush() �޼ҵ带 ȣ������ ������ ���۷θ� ����� ���� ������ ������ ������������ �ƹ��� �����͸� ���� ���ϴ� ��찡 �߻��� �� �ִ�.
		
		System.out.println("data_11.txt�� " +dos.size()+ "byte ����");
		// �� 30byte �� ���ñ�
		dos.close();
		
	}

}

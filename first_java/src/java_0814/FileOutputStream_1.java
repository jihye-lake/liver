package java_0814;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class FileOutputStream_1 {
	public static void main(String[] args) throws Exception {
		
		String file, str;
		
		Date date = new Date();
		
		str = "���� �����ð� \r\n" + date + "\r\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �̸� : ");
		file = read.readLine();
		
		System.out.println("������ ���ڿ� �Է� : ");
		str += read.readLine();
		
		byte[] byte_str = str.getBytes();
		
		FileOutputStream fos = new FileOutputStream(file);
		
		fos.write(byte_str);
		fos.close();
		
		System.out.println(file + " ���� ������ ���������� �Ϸ�Ǿ����ϴ�.");
		
	}

}

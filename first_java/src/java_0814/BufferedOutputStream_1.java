package java_0814;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class BufferedOutputStream_1 {
	public static void main(String[] args) throws Exception {
		
		String file, str;
		
		Date date = new Date();
		
		str = "���� ���� \r\n" + date + "\r\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �̸� : ");
		file = read.readLine();
		
		System.out.println("������ ���ڿ��� �Է��Ͻÿ�.");
		str += read.readLine();
		
		byte[] byte_str = str.getBytes();
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		���⿡ Buffer�� ������ ������ �Ȱ����� ȿ���� ����(���߿� ���� ���� ó���� �� ���� �� ����)
		
		bos.write(byte_str);
		bos.close();
		
		System.out.println(file + "�� ���������� �����Ͽ����ϴ�.");
	}

}

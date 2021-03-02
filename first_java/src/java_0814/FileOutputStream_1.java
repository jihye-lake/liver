package java_0814;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class FileOutputStream_1 {
	public static void main(String[] args) throws Exception {
		
		String file, str;
		
		Date date = new Date();
		
		str = "파일 생성시간 \r\n" + date + "\r\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("파일 이름 : ");
		file = read.readLine();
		
		System.out.println("저장할 문자열 입력 : ");
		str += read.readLine();
		
		byte[] byte_str = str.getBytes();
		
		FileOutputStream fos = new FileOutputStream(file);
		
		fos.write(byte_str);
		fos.close();
		
		System.out.println(file + " 파일 저장이 성공적으로 완료되었습니다.");
		
	}

}

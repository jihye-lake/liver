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
		
		str = "파일 생성 \r\n" + date + "\r\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("파일 이름 : ");
		file = read.readLine();
		
		System.out.println("저장할 문자열을 입력하시오.");
		str += read.readLine();
		
		byte[] byte_str = str.getBytes();
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		여기에 Buffer가 있으나 없으나 똑같지만 효율이 좋다(나중에 많은 양을 처리할 때 느낄 수 있음)
		
		bos.write(byte_str);
		bos.close();
		
		System.out.println(file + "에 성공적으로 저장하였습니다.");
	}

}

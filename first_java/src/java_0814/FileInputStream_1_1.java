package java_0814;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileInputStream_1_1 {
	public static void main(String[] args) throws Exception {
		
		int i = 0;
		String file;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("읽어올 파일 이름 : ");
		file = read.readLine();
		
		System.out.println(file + "문서 내용 \r\n");
//		FileInputStream fis = new FileInputStream(file); 
		// 8bit 에 한글은 기본 2byte 이기 때문에 깨져나오지만
		FileReader fis = new FileReader(file); // 이렇게 쓰면 멀쩡하게 나옴
		
		while ((i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		// byte 이기때문에 깨짐. 
		
	}

}
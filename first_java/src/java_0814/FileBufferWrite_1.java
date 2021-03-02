package java_0814;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Date;

public class FileBufferWrite_1 {
	public static void main(String[] args) throws Exception {
		
		String file, str;
		Date date = new Date();
		
		str = "파일 생성 시간 : \n" + date + "\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("파일 이름 : " );
		file = read.readLine();
		
		System.out.println("저장할 문자열 입력");
		str += read.readLine();
		
		FileWriter fww = new FileWriter(file);
		BufferedWriter bww = new BufferedWriter(fww);
		
		bww.write(str);
		bww.close();
		System.out.println(file + "성공적으로 저장되었습니다.");
		
	}

}

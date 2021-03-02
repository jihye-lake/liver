package java_0813;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileReader_1 {
	public static void main(String[] args) throws Exception {
		
		int i = 0;
		
		String file;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("읽어올 파일 이름을 입력하시오.");
		file = read.readLine();
		
		System.out.println(file + "문서 내용 ***********");
		
		FileReader frr = new FileReader(file);
		
		while ((i = frr.read()) != -1) { 
		// read 를 통해서 읽어온다. -1 은 없다는 뜻 즉 더이상 없을 때까지 i를 char 화해서 뽑아오라는 뜻
			System.out.print((char)i);
		}
		frr.close();
	}

}

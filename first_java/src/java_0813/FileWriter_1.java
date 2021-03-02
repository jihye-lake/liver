package java_0813;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Date;

public class FileWriter_1 {
	public static void main(String[] args) throws Exception {
		
		String file, str;
		
		Date date = new Date();
		
		str = "File Write Time \n" + date + "\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("파일 이름을 입력하시오.");
		file = read.readLine();
		
		System.out.print("저장할 문자열을 입력하시오.");
		str += read.readLine();
		
		char[] ch_str = new char[str.length()];
		
		str.getChars(0, str.length(), ch_str, 0);  // str 에 들어있는 문자열(String)의 길이만큼 캐릭터 배열에다가 0번의 위치부터 집어넣으라는 뜻
							// 길이 전체를 담을 수도 있지만 일부를 담을 수도 있음
		FileWriter fww = new FileWriter(file);
		
		fww.write(ch_str);  // char 의 배열을 찾기 때문에 이렇게 집어넣는 것임
		fww.close();
		
		System.out.println(file + "파일을 성공적으로 저장하였습니다.");
		
	}

}

package java_0813;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader_4 {
	public static void main(String[] args) {
		// 파일 객체 생성
		Path path = Paths.get("C:\\temp_1\\Exception_1.java");
		// 캐릭터셋 지정
		Charset cs = StandardCharsets.ISO_8859_1;
		// 파일 내용담을 리스트
		List<String> list = new ArrayList<>();
		try {
			list = Files.readAllLines(path, cs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (String readLine : list) {
			System.out.println(readLine);

		}
	}

}

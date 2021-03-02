package java_0814;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileBufferedRead_1 {
	public static void main(String[] args) throws Exception {
		
		int i = 0;
		String file;
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("읽어올 파일 이름을 입력");
		file = read.readLine();
		
		System.out.println(file + "문서 내용");
		FileReader frr = new FileReader(file);
		
		BufferedReader brr = new BufferedReader(frr);  // 안 써도 되지만 쓰면 효율을 좋게 해준다.
		// 많은 양의 데이터를 처리할 때 과부화를 막아주기 때문에 쓰는 게 좋다.
		
		while ((i = brr.read()) != -1) {  // 위의 BufferedReader brr 을 안 쓰려면 여기의 brr.read 를 frr 로 고쳐준다.
			System.out.print((char)i);
		}
		
	}

}

package java_0813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {
	public static void main(String[] args) throws IOException {
		
		String name = null;
		String addr = null;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader 클래스와 객체 reader 를 생성합니다,
		// System.in.read() 는 한문자씩 바이트로 입력받기 때문에 문자열로 변형해야 합니다.
		// InputStreamReader 클래스는 바이트 단위 입력 스트림을 문자단위 입력스트림으로 변형합니다.
		// 문자열을 효율적으로 처리하기위해 BufferedReader 클래스의 객체를 이용하면 사용자가 입력한 문자열을 쉽게 입력받을 수 있습니다.
		// 문자열을 입력 받기 위해 BufferedReader 클래스를 사용합니다.
		
		System.out.print("이름을 입력하시오. ");
		
		name = reader.readLine();
		
		System.out.print("주소를 입력하시오. ");
		
		addr = reader.readLine();
		
		System.out.println(name+ "님 환영합니다. 당신은 " + addr + "에 살고 있군요.");
		
	}

}

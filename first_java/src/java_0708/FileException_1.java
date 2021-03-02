package java_0708;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class FileException_1 {
	public static void main(String[] args) {
		
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("error_1.log",false); //true 쓰면 계속 계속 누적(추가)되고, false 쓰면 override. 즉, 덮어쓰기가 된다
					 //error_1.log 파일에 출력을 준비
			ps = new PrintStream(fos);
					//error 의 출력을 화면이 아닌 error_1.LOG 파일로  변경
			System.setErr(ps); //기본출력을 화면이 아니라 파일로 넘겨서 나오게 하겠다는 뜻.
			System.setOut(ps); //파일로 넘겨서 나오게 하는 건 같지만, 에러가 아니라 그 내용이 나온다.
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); //예외발생
			System.out.println(4);
			
		} catch (Exception e) {
			System.out.println(5);
			
			System.err.println("=========================================");
			System.err.println("예외발생 시간 : " + new Date());  //현재 시간
			e.printStackTrace();
			System.err.println("에외메시지 : " + e.getMessage());
			System.err.println("=========================================");
		} 
		System.out.println(6);
	}

}

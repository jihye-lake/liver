package java_0705;

import java.io.IOException;  // import 되지 않았던 class 이기 때문에 import 시켜줘야 함
									    // java.lang 에 들어있지 않은 class 이기 때문에 import 하기

public class Exception_6 {
	public static void main(String[] args) {
		
		try {
			IOException eee = new IOException("고의 예외 발생");
			//Exception eee = new Exception("고의 예외 발생");
			
			throw eee;
			
		} catch (IOException e) {
		// } catch (IOException e) {
			System.out.println("내가 만든 IOException : " + e);
			System.out.println("Exception발생 : " + e); 
			e.printStackTrace();
		}
	}

}

package java_0705;

import java.io.IOException;

public class Exception_5_1 {
	public static void main(String[] args) {
		
		try {
			System.out.println("===============예외 발생 전==================");
			//throw new NumberFormatException("숫자 변환 예외 발생");
			//throw new IOException("입출력 에러 발생");
			throw new ArithmeticException("숫자 변환 에러 발생");
			//throw 는 두 개 쓰지 못 함. 하나는 주석처리하고 하나만 쓰기.
			
		} catch (NumberFormatException e) {
			System.out.println("내가 만든 예외 : " + e);
			e.printStackTrace();
			
			System.out.println("고의적으로 만든 예외 : " + e.getMessage());
			
		} catch (ArithmeticException e) {
			System.out.println("숫자 변환 에러 발생"); 
			e.printStackTrace();
			
//		} catch (IOException e) {
//			System.out.println("입출력 에러 발생 : " + e);
//			e.printStackTrace();
		}
	}

}

package java_0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_9 {
	public static void main(String[] args) throws NumberFormatException, ArithmeticException, IOException {
		
		//try {
			input();
			
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("분모에 0이 올 수 없습니다.");
//		
//		} catch (IOException e) {  //import 시켜야 쓸 수 있다
//		e.printStackTrace();
//		System.out.println(e.getMessage());
//		System.out.println("입출력 오류가 있습니다.");
//		
//		}	catch (NumberFormatException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("숫자가 필요합니다");
//}
	}

	static void input() throws ArithmeticException,IOException,NumberFormatException {  //맨 앞에 private 생략되어 있음
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("첫 번째 값을 입력하시오.");
			//int num1 = input.readLine();  //여기서 나오는 타입은 String 인데 int 로 받을 수 없어서 오류가 난다 => 그래서 parseInt를 씀
			int num1 = Integer.parseInt(input.readLine());
			
			System.out.print("두 번째 값을 입력하시오.");
			int num2 = Integer.parseInt(input.readLine());
			
			dividing(num1,num2);
		
		}
	}

	static void dividing(int num1, int num2) throws ArithmeticException{
		
		System.out.println("결과 : " + num1 + "/" + num2 + "=" + (num1/num2));
		
	}

}

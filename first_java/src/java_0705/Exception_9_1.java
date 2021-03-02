package java_0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Exception_9_1 {
	public static void main(String[] args) throws NumberFormatException,ArithmeticException,IOException {
		
		//try {
		input();
		
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("분모에 0이 올 수 없습니다.");
//		
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("입출력 오류가 있습니다.");
//			
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("숫자가 필요합니다.");
//		}
		}
		
		static void input() throws ArithmeticException,IOException,NumberFormatException {
			
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.print("첫 번째 값을 입력하시오.");
				int num1 = Integer.parseInt(input.readLine());
				
				System.out.print("두 번째 값을 입력하시오.");
				int num2 = Integer.parseInt(input.readLine());
				
				dividing(num1,num2);
			}
		}
		
		static void  dividing(int num1, int num2) throws ArithmeticException {
			
			System.out.println("결과 : " + num1 + "/" + num2 + "=" + (num1/num2));
		}
		
	}

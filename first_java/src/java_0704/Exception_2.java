package java_0704;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_2 {
	public static void main(String[] args) {
		
		
		while(true) {
			try {
				Scanner input = new Scanner(System.in);  //Scanner 도 BufferedReader 처럼 입력해야 하지만 
				// throws Exception 을 만들 필요가 없다. 자체적으로 기능을 갖고 있어서.
				
			System.out.println("첫 번째 값을 입력하시오.");
			int num1 = input.nextInt();
	
			System.out.println("두 번째 값을 입력하시오.");
			int num2 = input.nextInt();
			
			System.out.println(" 결과 : " +num1+ " / " +num2+ "=" +(num1/num2));
			
			} catch(InputMismatchException e) {
				System.out.println("문자는 입력할 수 없습니다.");
				
			} catch(ArithmeticException e) {
				System.out.println("분모에는 0을 입력할 수 없습니다.");
				
			} catch(Exception e) {
				System.out.println("입력 값 오류");
			}
			
			finally {
				System.out.println("\n나눗셈을 진행 중입니다.\n");
			}
			
			
		}
				
	}

}

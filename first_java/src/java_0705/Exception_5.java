package java_0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_5 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
			while(true) {
				try {
				System.out.println("첫 번째 값을 입력하시오.");
				int num1 = Integer.parseInt(input.readLine());
				
				System.out.println("두 번째 값을 입력하시오.");
				int num2 = Integer.parseInt(input.readLine());
				
				System.out.println(num1 + "/" + num2 + "=" + (num1/num2));

//				System.out.println("세 번째 값을 입력하시오.");
//				int num3 = Integer.parseInt(input.readLine());
//				
//				System.out.println(num1 + "/" + num2 + "*" + num3 + "=" + (num1/num2*num3));
				
			} catch (NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("문자는 입력할 수 없습니다.");
		} catch (ArithmeticException e) {
			System.out.println("분모에는 0이 올 수 없습니다.");
		} catch (Exception e) {
			System.out.println("오류가 있습니다.");
		} finally {
			System.out.println("\n오류와 관계없이 나옵니다.\n");
		}
		}
	}

}

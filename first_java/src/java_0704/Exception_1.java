package java_0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

//import java.io.*; //java.io 패키지에 있는 모든 클래스를 input 하겠다는 뜻임(메모리 낭비로 이어질 수 있으나 간편)

public class Exception_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); //이렇게가 아니라 try-catch로 감싸줘도 됨
		
		while(true)
		{
			try {   //하나의 try 문에 복수의 catch 를 쓸 수 있다(예외는 여러 개 발생할 수 있기 때문에) - keyword 는 소문자로
			System.out.println("첫 번째 값을 입력하시오.");
			int num1 = Integer.parseInt(input.readLine());

			System.out.println("두 번째 값을 입력하시오.");
			int num2 = Integer.parseInt(input.readLine());
			
				
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			
			} catch(NumberFormatException e) {  //순서가 맞아야 예외처리가 제대로 된다. API 에서 트리로 확인.
																	//java.lang => Exception => tree 구조 들어가서 순서보기
																	//Exception 이 맨 마지막에 와야 한다.
				System.out.println("숫자만 입력하시오.");
			
	    	} catch(Exception e) {
	 		   System.out.println("분모에는 0이 올 수 없습니다.");
		   }
			
			// 분자/0 => 불능, 0/0 => 부정
		}
		
		
	}

}

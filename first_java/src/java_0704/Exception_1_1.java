package java_0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

//import java.io.*; //java.io 패키지에 있는 모든 클래스를 input 하겠다는 뜻임(메모리 낭비로 이어질 수 있으나 간편)

public class Exception_1_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			try {   //하나의 try 문에 복수의 catch 를 쓸 수 있다(예외는 여러 개 발생할 수 있기 때문에)
			System.out.println("첫 번째 값을 입력하시오.");
			int num1 = Integer.parseInt(input.readLine());

			System.out.println("두 번째 값을 입력하시오.");
			int num2 = Integer.parseInt(input.readLine());
			
				
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			
			} catch(NumberFormatException aa) {  //순서가 맞아야 예외처리가 제대로 된다. API 에서 트리로 확인.
																	//java.lang => Exception => tree 구조 들어가서 순서보기
																	//Exception 이 맨 마지막에 와야 한다.
				System.out.println("숫자만 입력하시오.");
				//aa.printStackTrace(); 몇 번째 라인에서 오류가 났는 지 보여준다.
				System.out.println(aa.getMessage());
				
			} catch (ArithmeticException bb) {  //bb는 임의의 변수이기 때문에 어떤 것이든 넣을 수 있다
					System.out.println("분모에는 0이 올 수 없습니다.");
					bb.printStackTrace();  // => 를 써주면 어떤 에러가 발생하는 지 알려준다.
					System.out.println(bb.getMessage());  // =>  getMessage 는 뭐에 에러가 났는지만 보여주고
																					 //printStackTrace 는 추적해서 그 위치에 간다
			
	    	} catch(Exception e) { //모든 걸 다 잡기 때문에 위쪽에 놓으면 의미가 없다.
	 		   System.out.println("입력 값 오류");  //문자도 아니고, 숫자가 맞을 경우에는 마지막 exception 에 오게 됨
	 		   
		   } finally {  //자주 생략하긴 하지만 쓸 때는 쓴다
				System.out.println("오류와 관계없이 출력할 내용");
			}
			
			// 분자/0 => 불능, 0/0 => 부정
		}
		
		
	}

}

package java_0705;

import java.io.IOException;

public class Exception_8 {
	public static void main(String[] args) {
		
		Exception_8.finally_1(); //class 가 자기 자신이기 때문에 Exception_8을 지워도 가능하다
		System.out.println("finally_1() 수행을 마치고 main() 으로 돌아옴");
		
		//실행시켰을 때 결과가 뒤죽박죽 나오는 건 Thread 가 돌기 때문이다.
		
		
	}

	private static void finally_1() { //static 이 붙은 것은 class 명 만으로 접근이 가능하다.
		  try {
			  System.out.println("finally_1() 이 호출되었습니다.");
			  
			  //Exception aa = new Exception();
//			  IOException aa = new IOException();
//			  throw aa;
			  
			  throw new Exception("I made Error");
			  
			  //return;  //현재 실행중인 메소드 종료
			  
		  } catch(IOException e) {
			  e.printStackTrace();
			  
		  } catch(Exception e) {
			  e.printStackTrace();
			  System.out.println(e);
			  
		  } finally {  //Error 가 있든지 없든지 finally 를 실행한다.
			  System.out.println("finally_1() 의 finally 블럭이 실행되었습니다.");
			  
			  //Thread 가 돈다?
		  }
	}

}

package java_0808;

import java.util.Stack;

public class Stack_1_1 {  // 내 마음대로 더 집어넣어 보기
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		
		goURL("1.Google");
		goURL("2.Daum");
		goURL("3.Nate");
		goURL("4.Naver");
		
		printprint();
		
		goBack();
		System.out.println("뒤로가기");
		printprint();
		
		goBack();
		System.out.println("뒤로가기2");
		printprint();
		
		goBack();
		System.out.println("뒤로가기3");
		printprint();
		
		goForward();
		System.out.println("앞으로 가기");
		printprint();
		
		goForward();
		System.out.println("앞으로 가기2");
		printprint();
		
		goForward();
		System.out.println("앞으로 가기3");
		printprint();
		
		goURL("www.korea.com");
		System.out.println("새로운 주소로 이동");
		printprint();
		
		goURL("www.china.com");
		System.out.println("새로운 주소로 이동");
		printprint();
		
		goURL("www.japan.com");
		System.out.println("새로운 주소로 이동");
		printprint();
		
	}

	private static void goForward() {
		if (!forward.empty()) {  // '뒤에 있지 않다면?' 이라는 뜻임
			back.push(forward.pop());  // push 는 집어넣는 것이고, pop 은 끄집어내는 것임
			// forward 에서 끄집어내서 back 으로 집어넣는다.
			
		}
		
	}

	private static void goBack() {
		if (!back.empty()) {
			forward.push(back.pop());		
			// back 에서 끄집어내서 forward 으로 집어넣는다.
		}
		
	}

	private static void printprint() {
		
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재 화면 : " + back.peek() + " 입니다.");  // peek 은 현재 값(가장 위에 있는 것)
		System.out.println();
		
	}

	private static void goURL(String str) {
		
		back.push(str);  // push 는 집어넣는다는 뜻
		if (!forward.empty()) {
			forward.clear();	// forward 를 clear 시켰으므로 지워졌다(naver가 사라짐)
		}
		
	}
}
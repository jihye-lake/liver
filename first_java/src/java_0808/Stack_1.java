package java_0808;

import java.util.Stack;

public class Stack_1 {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		
		goURL("1.Google");
		goURL("2.Daum");
		goURL("3.Nate");
		goURL("4.Naver");
		
		printprint();
		
		goBack();
		System.out.println("�ڷΰ���");
		printprint();
		
		goBack();
		System.out.println("�ڷΰ���2");
		printprint();
		
		goForward();
		System.out.println("������ ����");
		printprint();
		
		goURL("www.korea.com");
		System.out.println("���ο� �ּҷ� �̵�");
		printprint();
		
	}

	private static void goForward() {
		if (!forward.empty()) {  // '�ڿ� ���� �ʴٸ�?' �̶�� ����
			back.push(forward.pop());  // push �� ����ִ� ���̰�, pop �� ������� ����
			
		}
		
	}

	private static void goBack() {
		if (!back.empty()) {
			forward.push(back.pop());			
		}
		
	}

	private static void printprint() {
		
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("���� ȭ�� : " + back.peek() + " �Դϴ�.");  // peek �� ���� ��(���� ���� �ִ� ��)
															// peek �� synchronized �� �Ǿ� �ִ�. ���ÿ� �Ͼ�� �� ���� �� ����.
		System.out.println();
		
	}

	private static void goURL(String str) {
		
		back.push(str);  // push �� ����ִ´ٴ� ��
		if (!forward.empty()) {
			forward.clear();	// forward �� clear �������Ƿ� ��������(naver�� �����)
		}
		
	}
}

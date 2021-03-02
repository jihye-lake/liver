package java_0716;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		
		String str = "자바는$ 다양한$ 문자열 처리, 날짜 처리, " + "시간 처리, 를 위한$ 메소드를$ 갖고 있습니다.";
		
		StringTokenizer stt = new StringTokenizer(str,",$");  // ,$ 는 토큰분리기호다
		System.out.println("토큰 ',' 의 수 : " + stt.countTokens());
		
		while (stt.hasMoreElements()) {
			System.out.println(stt.nextToken());
			//따로따로 뽑아내서 알 수 있다
		}
	}

}

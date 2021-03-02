package java_0812;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDic {
	public static void main(String[] args) {
		Map<String, String> st = new HashMap<String, String>();

		st.put("map", "지도");
		st.put("java", "자바");
		st.put("school", "학교");
		st.put("sweden", "스웨덴");
		st.put("stockholm", "스톡홀름");

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("영어 단어를 입력하시오!");
			String key = sc.next();
			if (key.equals("quit"))
				break;
			System.out.println("단어의 의미는 " + st.get(key));
		} while (true);
	}

}

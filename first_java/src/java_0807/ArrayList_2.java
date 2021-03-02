package java_0807;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {
	
	public static void main(String[] args) {  // 문자를 열 개씩 잘라서 나오게 하기
		
		final int LIMIT = 10;
		
		String source = "0123456789abcdefghijklmABCDEFG@#$%^&*()ZZZ";
		
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10);  //  크기를 약간 여유있게
		
		for (int i = 0; i < length; i+=LIMIT) {
			
			if (i+LIMIT < length) {
				
				list.add(source.substring(i,i+LIMIT)); // 0번부터 10앞까지, 20앞까지, 30앞까지 이런식으로
				
			} else
				list.add(source.substring(i));  // 나머지는 끝까지
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
	}

}

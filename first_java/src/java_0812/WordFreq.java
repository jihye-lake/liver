package java_0812;

import java.util.HashMap;
import java.util.Map;

public class WordFreq {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();  // Map 중복허용X
		// int 보다 Integer 를 쓰는 게 더 다양하게 쓸 수 있기 때문에 Integer 씀

		String[] sample = { "to", "be", "or", "not","Newzealand", "to", "be", "is", "a", "problem", "Newzealand" };
		
		// 문자열에 포함된 빈도를 계산한다.
		for (String a : sample) {
			Integer freq = m.get(a);
			m.put(a,  (freq == null) ? 1 : freq + 1);
			// key 값 a // 한 번도 들어온 적 없다면? 1로 하겠다, 들어온 적 있다면 1로 하겠다는 뜻
			
		}
		System.out.println(m.size() + " 단어가 있습니다.");
		System.out.println(m.containsKey("to"));  // key 값이 to 가 있느냐
		System.out.println(m.isEmpty()); // m 값이 비어있느냐
		System.out.println(m); // map 의 전체 내용을 보여줌
	}

}

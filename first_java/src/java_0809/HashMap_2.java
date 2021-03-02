package java_0809;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("나자바", new Integer(90));
		map.put("나자바", new Integer(100));  // 중복허용이 안 되므로 나중에 들어있는 값만 들어있음
		map.put("안자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("이자바", new Integer(90));
		
		Set set = map.entrySet();
		// entrySet() : HashMap 에 저장된 키와 값을 엔트리(키와 값의 결합) 형태로 Set에 저장하여 반환한다.
		
		Iterator itt = set.iterator();  // set 에 저장해서 iterator 을 쓸 수 있게 해 줌
		
		while (itt.hasNext()) {
			Map.Entry e = (Entry) itt.next();
			
			System.out.println("이름 : " +e.getKey()+ ", 점수 : " +e.getValue());
		}
		System.out.println();
		
		set = map.keySet();
		System.out.println("참가자 명단" + set);
		
		Collection values = map.values();
		
		itt = values.iterator();
		
		int total = 0;
		
		while (itt.hasNext()) {
			Integer ii = (Integer) itt.next();
			System.out.println("ㅋㅋ : " + ii);
			
			total += ii.intValue();
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고 점수 : " + Collections.max(values));
		System.out.println("최저 점수 : " + Collections.min(values));
	}

}

package java_0808;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto_1 {
	
	public static void main(String[] args) {
		Set set = new HashSet();
		
		while(true) {
			int num = (int)(Math.random()*45+1);
			set.add(new Integer(num));
			
			if (set.size() == 6) {
				break;
			}
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}

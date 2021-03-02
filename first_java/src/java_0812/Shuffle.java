package java_0812;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {  // 난수와 똑같은 결과
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			list.add(i);
			Collections.shuffle(list);  // 숫자들을 섞는다.
			System.out.println(list);
	}

}

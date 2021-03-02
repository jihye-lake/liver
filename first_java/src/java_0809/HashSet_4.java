package java_0809;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_4 {  // set 은 중복을 허용하지 않는다.
	public static void main(String[] args) {

		HashSet setA = new HashSet();
		HashSet setB = new HashSet();

		HashSet setHap = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();

		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");

		System.out.println(" A = " + setA);

		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");

		System.out.println(" B = " + setB);

		Iterator itt = setB.iterator();  // Iterator 써서 그 안의 내용을 가져오겠다(반복하여)
		while (itt.hasNext()) {
			Object obj = (Object) itt.next();

			if (setA.contains(obj)) {  // setA 가 B안에 포함된 게 있다면?
				setKyo.add(obj);		   // (있는 것만)집어넣어라
			}
		}
		
		itt = setA.iterator();
		
		while (itt.hasNext()) {
			Object obj = (Object)itt.next();
			if (!setB.contains(obj)) {  // setB 가 A의 값 중에 갖고 있는게 없다면?
				setCha.add(obj);			// 그것만 Cha 에 집어넣어라
				
			}
		}
		
		itt = setA.iterator();
		while (itt.hasNext()) {
			setHap.add(itt.next());
		}
		
		
		itt = setB.iterator();
		while (itt.hasNext()) {
			setHap.add(itt.next());  // set 자체가 중복을 배재하기 때문에 합쳐질 때 4,5만 빼고 돼서 합이 나옴
			}
		
		System.out.println(" A ∩ B : " + setKyo);
		System.out.println(" A ∪ B : " + setHap);
		System.out.println(" A - B : " + setCha);

	}

}

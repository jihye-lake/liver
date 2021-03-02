package java_0809;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_4 {  // set �� �ߺ��� ������� �ʴ´�.
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

		Iterator itt = setB.iterator();  // Iterator �Ἥ �� ���� ������ �������ڴ�(�ݺ��Ͽ�)
		while (itt.hasNext()) {
			Object obj = (Object) itt.next();

			if (setA.contains(obj)) {  // setA �� B�ȿ� ���Ե� �� �ִٸ�?
				setKyo.add(obj);		   // (�ִ� �͸�)����־��
			}
		}
		
		itt = setA.iterator();
		
		while (itt.hasNext()) {
			Object obj = (Object)itt.next();
			if (!setB.contains(obj)) {  // setB �� A�� �� �߿� ���� �ִ°� ���ٸ�?
				setCha.add(obj);			// �װ͸� Cha �� ����־��
				
			}
		}
		
		itt = setA.iterator();
		while (itt.hasNext()) {
			setHap.add(itt.next());
		}
		
		
		itt = setB.iterator();
		while (itt.hasNext()) {
			setHap.add(itt.next());  // set ��ü�� �ߺ��� �����ϱ� ������ ������ �� 4,5�� ���� �ż� ���� ����
			}
		
		System.out.println(" A �� B : " + setKyo);
		System.out.println(" A �� B : " + setHap);
		System.out.println(" A - B : " + setCha);

	}

}

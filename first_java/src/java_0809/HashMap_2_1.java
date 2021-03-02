package java_0809;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_2_1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("���ڹ�", new Float(90.6));
		map.put("���ڹ�", new Float(65.4));  // �ߺ������ �� �ǹǷ� ���߿� ����ִ� ���� �������
		map.put("���ڹ�", new Float(50.92));
		map.put("���ڹ�", new Float(80.4));
		map.put("���ڹ�", new Float(90.29));
		
		Set set = map.entrySet();
		// entrySet() : HashMap �� ����� Ű�� ���� ��Ʈ��(Ű�� ���� ����) ���·� Set�� �����Ͽ� ��ȯ�Ѵ�.
		
		Iterator itt = set.iterator();  // set �� �����ؼ� iterator �� �� �� �ְ� �� ��
		
		while (itt.hasNext()) {
			Map.Entry e = (Entry) itt.next();
			
			System.out.println("�̸� : " +e.getKey()+ ", ���� : " +e.getValue());
		}
		System.out.println();
		
		set = map.keySet();
		System.out.println("������ ���" + set);
		
		Collection values = map.values();
		
		itt = values.iterator();
		
		int total = 0;
		
		while (itt.hasNext()) {
			Float ii = (Float) itt.next();
			System.out.println("���� : " + ii);
			
			total += ii.floatValue();
		}
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ� ���� : " + Collections.max(values));
		System.out.println("���� ���� : " + Collections.min(values));
	}

}

package java_0812;

import java.util.HashMap;
import java.util.Map;

public class WordFreq {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();  // Map �ߺ����X
		// int ���� Integer �� ���� �� �� �پ��ϰ� �� �� �ֱ� ������ Integer ��

		String[] sample = { "to", "be", "or", "not","Newzealand", "to", "be", "is", "a", "problem", "Newzealand" };
		
		// ���ڿ��� ���Ե� �󵵸� ����Ѵ�.
		for (String a : sample) {
			Integer freq = m.get(a);
			m.put(a,  (freq == null) ? 1 : freq + 1);
			// key �� a // �� ���� ���� �� ���ٸ�? 1�� �ϰڴ�, ���� �� �ִٸ� 1�� �ϰڴٴ� ��
			
		}
		System.out.println(m.size() + " �ܾ �ֽ��ϴ�.");
		System.out.println(m.containsKey("to"));  // key ���� to �� �ִ���
		System.out.println(m.isEmpty()); // m ���� ����ִ���
		System.out.println(m); // map �� ��ü ������ ������
	}

}

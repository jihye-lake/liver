package java_0808;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_1_1 { // �ߺ��� ������� ����
	public static void main(String[] args) {

		Object[] obj = { "1", new Integer(1), "2", "4", "4", new Integer(3), "2", "3", "3", "3" };
								// ���ڿ� 1�� ������ 1�� �ٸ� ���̱� ������ �ٸ��� �ν�(String �� Integer) ������ �������

		Set sett = new LinkedHashSet(); // �׳� HashSet �� ������ ��� �� ������ LinkedHashSet �� ������ �����(�尣��� ����)

		for (int i = 0; i < obj.length; i++) {
			sett.add(obj[i]);
		}

		System.out.println(sett);
	}

}

package java_0807;

import java.util.Iterator;
import java.util.Vector;

public class Vector_3 {  // ������ �����ʹ� �迭, ������ �����ʹ� Collection

	public static void main(String[] args) {

		int kor, eng, math, science, total;

		double avg;

		String[] �̸� = { "������", "�赿��", "��μ�", "�����", "������", "��â��", "������", "������", "������", "���ּ�" };

		int[] ���� = { 56, 78, 34, 66, 90, 48, 88, 65, 78, 85 };
		int[] ���� = { 65, 98, 50, 52, 45, 78, 65, 15, 52, 55 };
		int[] ���� = { 78, 54, 25, 62, 85, 90, 40, 84, 61, 78 };
		int[] ���� = { 65, 78, 45, 95, 88, 20, 51, 84, 86, 87 };

		Vector vv = new Vector();

		for (int i = 0; i < 10; i++) {
			vv.add((String) �̸�[i]); // ���ʹ� ����, ���� �� ���� �� ����(Collection �� ����)
			vv.add(new Integer(����[i]));
			vv.add(new Integer(����[i]));
			vv.add(new Integer(����[i]));
			vv.add(new Integer(����[i]));

		}

		System.out.println("=================== �л� ���� ��ȸ ���α׷� ==================");
		System.out.println("  �̸�       ����\t����\t����\t����\t����\t���");

//		Enumeration enu = vv.elements();  // �����ڷ�
//
//		while (enu.hasMoreElements()) {  // ���� ���
//			System.out.print("\n" + enu.nextElement());
//			kor = ((Integer)enu.nextElement()).intValue();
//			eng = ((Integer)enu.nextElement()).intValue();
//			math = ((Integer)enu.nextElement()).intValue();

		Iterator itt = vv.iterator(); // ���� ���(Enu �� Iter �� ���� ����ϱ�, �Ȱ��� ������� �����ϴ� ���)

		while (itt.hasNext()) {

			System.out.print("\n" + itt.next());
			kor = ((Integer) itt.next()).intValue();
			eng = ((Integer) itt.next()).intValue();
			math = ((Integer) itt.next()).intValue();
			science = ((Integer) itt.next()).intValue();

			total = kor + eng + math + science;

			avg = total / 4.0; // �׳� 3���� ������ �Ҽ����� ������ �ʴ´�(.0�� ����)

			System.out.print("\t" + kor + "\t" + eng + "\t" + math + "\t" + science);
			System.out.printf("\t %4d %5.1f", total, avg);
		}
	}

}

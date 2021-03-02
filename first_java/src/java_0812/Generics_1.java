package java_0812;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics_1 {
	public static void main(String[] args) {
		ArrayList<Student_3> list = new ArrayList<>(); // new ���� ����ȿ� Student_3 �� �ᵵ ������ ������ ���Ǹ鼭 �����ص� �ǰ� ��
		// �̷��� <>���ʸ��� ǥ�����ָ� �������ϸ鼭 ������ ����ش�.
		
		
		list.add(new Student_3("���", 1, 1));
		list.add(new Student_3("�쵿", 1, 2));
		list.add(new Student_3("��ġ����", 1, 3));
		list.add(new Student_3("�������", 2, 1));
		list.add(new Student_3("�ø�", 2, 2));

		Iterator<Student_3> itt = list.iterator();

		while (itt.hasNext()) {
//			Student_3 ss = (Student_3) itt.next();  // ���̻� �̷��� ����ȯ(Student_3) �� �ʿ� ����.
			Student_3 ss = itt.next();

//			System.out.println(ss.name);
			System.out.println(ss.name + " " + ss.ban + " " + ss.noo);
		}
		
		System.out.println();
		
		for (Student_3 ss : list) {  // ���� for �� ����ϱ�
			System.out.println(ss.name);			
		}
		
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
//			Student_3 stt = list.get(i);
//			System.out.println(stt.name);
			System.out.println(list.get(i).name);
		}
	}

}

class Student_3 {
	String name = "";
	int ban;
	int noo;

	public Student_3(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.noo = no;
	}

}

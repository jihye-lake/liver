package java_0812;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Generics_2 {
	public static void main(String[] args) {
		ArrayList<Student_4> list = new ArrayList<>();
		list.add(new Student_4("«�͹�", 1, 1, 100, 90, 80));
		list.add(new Student_4("Į����", 1, 2, 98, 62, 50));
		list.add(new Student_4("��ȸ��", 1, 3, 62, 45, 87));
		list.add(new Student_4("����", 1, 4, 85, 64, 70));
		list.add(new Student_4("���ø�", 2, 1, 95, 63, 23));
		list.add(new Student_4("�ÿ쵿", 2, 2, 72, 61, 85));
		list.add(new Student_4("�𸸵�", 3, 1, 32, 78, 94));
		list.add(new Student_4("�����", 3, 2, 65, 81, 43));
		
		Collections.sort(list);
		
		Iterator<Student_4> itt = list.iterator();
		
		while (itt.hasNext()) {
			Student_4 stt = itt.next();
			System.out.println(stt);
		}
		
	}

}

class Student_4 implements Comparable<Student_4> {
	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	int total = 0;
	
	public Student_4(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor + eng + math;
	}
	
	public String toString() {
		return name + "\t" + ban + "\t" + no + "\t" + kor + "\t" + eng + "\t"+ math + "\t" + total;
	}
	public int compareTo(Student_4 stt) {  //  ���ϱ� ���ؼ�
		return stt.total - this.total;
//		return this.total - stt.total;  // �̷��� �ϸ� ���������� ��
	}
}

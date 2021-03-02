package java_0812;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics_1 {
	public static void main(String[] args) {
		ArrayList<Student_3> list = new ArrayList<>(); // new 뒤의 꺽쇠안에 Student_3 를 써도 되지만 버전이 향상되면서 생략해도 되게 됨
		// 이렇게 <>제너릭을 표시해주면 컴파일하면서 오류를 잡아준다.
		
		
		list.add(new Student_3("라면", 1, 1));
		list.add(new Student_3("우동", 1, 2));
		list.add(new Student_3("잔치국수", 1, 3));
		list.add(new Student_3("비빔국수", 2, 1));
		list.add(new Student_3("냉면", 2, 2));

		Iterator<Student_3> itt = list.iterator();

		while (itt.hasNext()) {
//			Student_3 ss = (Student_3) itt.next();  // 더이상 이렇게 형변환(Student_3) 할 필요 없다.
			Student_3 ss = itt.next();

//			System.out.println(ss.name);
			System.out.println(ss.name + " " + ss.ban + " " + ss.noo);
		}
		
		System.out.println();
		
		for (Student_3 ss : list) {  // 향상된 for 문 사용하기
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

package java_0812;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1> {
	int number;
	String name;
	
	public Student1(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Student1 s) {
		return number - s.number;
	}
}

public class SortTest {
	public static void main(String[] args) {
		Student1 array[] = {
				new Student1(20090001, "���¸�"),
				new Student1(20090002, "ƿ�ٽ�����"),
				new Student1(20090003, "�ζ�������"),
		};
		List<Student1> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list);
	}

}

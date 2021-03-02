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
				new Student1(20090001, "김태리"),
				new Student1(20090002, "틸다스윈턴"),
				new Student1(20090003, "로라프리폰"),
		};
		List<Student1> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list);
	}

}

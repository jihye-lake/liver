package java_0812;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		String[] sample = {"i", "walk", "the", "line"};
		List<String> list = Arrays.asList(sample); // �迭�� ����Ʈ�� ����
		Collections.sort(list);
		System.out.println(list);  // ����Ʈ�� ����ִ� ���Ұ� String Ÿ���̱� ������ ���ĺ� ������� ����
	}

}

package java_0812;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_2 {
	public static void main(String[] args) {

		String temp = "";

		String[] sample = { "i", "walk", "the", "line" };
		List<String> list = Arrays.asList(sample); // �迭�� ����Ʈ�� ����
		Collections.sort(list);
		System.out.println(list); // ����Ʈ�� ����ִ� ���Ұ� String Ÿ���̱� ������ ���ĺ� ������� ����

		for (int i = 0; i < sample.length - 1; i++) {
			for (int j = i + 1; j < sample.length; j++) {
				if (sample[i].compareTo(sample[j]) > 0) {
					temp = sample[i];
					sample[i] = sample[j];
					sample[j] = temp;
				}

			}

		}

		for (int i = 0; i < sample.length; i++) {
			System.out.print(sample[i] + " ");

		}

		System.out.println();
		String[] sample2 = { "i", "walk", "the", "line", "new", "icon", "ruby" };  
		// ������ �Ǵٸ� ���(array �ӿ� ����ִ� sort �� ��)

		Arrays.sort(sample2);
		for (int i = 0; i < sample2.length; i++) {
			System.out.print(sample2[i] + " ");

		}
	}

}
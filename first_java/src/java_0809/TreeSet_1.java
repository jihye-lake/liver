package java_0809;

import java.util.TreeSet;

public class TreeSet_1 {  // set �� �ߺ� ������� ����, ���ĵǾ ����
	public static void main(String[] args) {

		TreeSet set = new TreeSet();

		int[] score = { 75, 48, 66, 93, 37, 55, 10, 75, 66, 63, 84 };

		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));  // TreeSet �� ��´�
		}
		System.out.println("66 ���� ���� �� : " + set.headSet(new Integer(66)));  // ()���� �������� �Ͽ� �� ���� �����ϰ� ���� �� ����
		System.out.println("66 ���� ū �� : " + set.tailSet(new Integer(66)));  // ()���� �������� �Ͽ� �� ���� ���� ū ������
	}

}

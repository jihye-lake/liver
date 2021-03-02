package java_0809;

import java.util.TreeSet;

public class TreeSet_1 {  // set 은 중복 허용하지 않음, 정렬되어서 나옴
	public static void main(String[] args) {

		TreeSet set = new TreeSet();

		int[] score = { 75, 48, 66, 93, 37, 55, 10, 75, 66, 63, 84 };

		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));  // TreeSet 에 담는다
		}
		System.out.println("66 보다 작은 값 : " + set.headSet(new Integer(66)));  // ()값을 기준으로 하여 그 값은 제외하고 작은 값 나옴
		System.out.println("66 보다 큰 값 : " + set.tailSet(new Integer(66)));  // ()값을 기준으로 하여 그 값을 포함 큰 값나옴
	}

}

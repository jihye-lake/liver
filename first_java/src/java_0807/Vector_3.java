package java_0807;

import java.util.Iterator;
import java.util.Vector;

public class Vector_3 {  // 동질의 데이터는 배열, 이질의 데이터는 Collection

	public static void main(String[] args) {

		int kor, eng, math, science, total;

		double avg;

		String[] 이름 = { "강지수", "김동현", "김민석", "김민지", "김유진", "김창용", "김혜련", "김희진", "류현정", "박주선" };

		int[] 국어 = { 56, 78, 34, 66, 90, 48, 88, 65, 78, 85 };
		int[] 영어 = { 65, 98, 50, 52, 45, 78, 65, 15, 52, 55 };
		int[] 수학 = { 78, 54, 25, 62, 85, 90, 40, 84, 61, 78 };
		int[] 과학 = { 65, 78, 45, 95, 88, 20, 51, 84, 86, 87 };

		Vector vv = new Vector();

		for (int i = 0; i < 10; i++) {
			vv.add((String) 이름[i]); // 벡터는 문자, 숫자 다 담을 수 있음(Collection 의 장점)
			vv.add(new Integer(국어[i]));
			vv.add(new Integer(영어[i]));
			vv.add(new Integer(수학[i]));
			vv.add(new Integer(과학[i]));

		}

		System.out.println("=================== 학생 성적 조회 프로그램 ==================");
		System.out.println("  이름       국어\t영어\t수학\t과학\t총점\t평균");

//		Enumeration enu = vv.elements();  // 열거자료
//
//		while (enu.hasMoreElements()) {  // 예전 방법
//			System.out.print("\n" + enu.nextElement());
//			kor = ((Integer)enu.nextElement()).intValue();
//			eng = ((Integer)enu.nextElement()).intValue();
//			math = ((Integer)enu.nextElement()).intValue();

		Iterator itt = vv.iterator(); // 향상된 방법(Enu 와 Iter 를 같이 기억하기, 똑같은 방법으로 추출하는 방법)

		while (itt.hasNext()) {

			System.out.print("\n" + itt.next());
			kor = ((Integer) itt.next()).intValue();
			eng = ((Integer) itt.next()).intValue();
			math = ((Integer) itt.next()).intValue();
			science = ((Integer) itt.next()).intValue();

			total = kor + eng + math + science;

			avg = total / 4.0; // 그냥 3으로 나누면 소수점이 나오지 않는다(.0만 나옴)

			System.out.print("\t" + kor + "\t" + eng + "\t" + math + "\t" + science);
			System.out.printf("\t %4d %5.1f", total, avg);
		}
	}

}

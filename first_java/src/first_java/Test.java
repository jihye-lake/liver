package first_java;

class Grade2 {
	
	int kor = 66;
	int eng = 77;
	int math = 88;
}

public class Test {
	public static void main(String[] args) {
		
		int total1, total2, total3;
		double avg;
		
		Grade2 grade1 = new Grade2();
		Grade2 grade2 = new Grade2();
		
		grade1.kor = 70;
		grade2.eng = 55;
		
		total1 = grade1.kor + grade2.eng + grade1.math;
		total2 = grade2.kor + grade2.eng + grade2.math;
		total3 = grade2.kor + grade2.eng + grade1.math;
		avg = total1 / 3.0;
		
		System.out.println("총 점 : " + total1);
		System.out.println("총 점 : " + total2);
		System.out.println("총 점 : " + total3);
		System.out.println("평 균 : " + avg);

	}
}

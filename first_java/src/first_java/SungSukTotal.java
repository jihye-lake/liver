package first_java;

class Grade  		//  class�� ��ġ�� ���ֹ��� �ʴ´�(�� ������ ���� ���� ����, ������� �ٸ� Ŭ������ ���� ����� ����)
{						//  �ۺ��� �ٸ� java ������ ������� ���� ����, ���⼭�� ���� �ʱ�. �ߺ��� ��. * Ŭ������ �ϳ��� �ִ� �� ���� ���⼭�� ������ ���� ���� ��*
	int kor = 66;
	int eng = 77;
	int math = 88;
}

public class SungSukTotal{
	
	public static void main(String[] args) {   //  main �� �ִ�  class ������ �����ؾ� ������ ��.
		
		int total1, total2, total3;
		double avg;
		
		Grade grade1 = new Grade();
		//Grade grade2 = new Grade1();
		Grade grade2 = new Grade();
		
		grade1.kor	= 70;
		grade2.eng	= 55;
		
		total1	= grade1.kor + grade2.eng + grade1.math;
		total2	= grade2.kor + grade2.eng + grade2.math;   //   total 1, 2, 3 �� �Ȱ��� ���� �����ϰ� �ֱ� ������ ������ ������ ���� ����.
		total3	= grade2.kor + grade2.eng + grade1.math;
		avg = total1 / 3.0; 
	
		System.out.println(" �� �� : " + total1);
		System.out.println(" �� �� : " + total2);
		System.out.println(" �� �� : " + total3);
		System.out.println(" �� �� : " + avg);
		
		
	}

}

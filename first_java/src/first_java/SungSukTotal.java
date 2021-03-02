package first_java;

class Grade  		//  class는 위치에 구애받지 않는다(맨 밑으로 가든 위로 가든, 심지어는 다른 클래스에 만들어도 상관이 없다)
{						//  퍼블릭은 다른 java 문서를 만들었을 때는 쓰되, 여기서는 쓰지 않기. 중복이 됨. * 클래스는 하나만 있는 게 좋다 여기서는 설명을 위해 같이 둠*
	int kor = 66;
	int eng = 77;
	int math = 88;
}

public class SungSukTotal{
	
	public static void main(String[] args) {   //  main 이 있는  class 명으로 저장해야 실행이 됨.
		
		int total1, total2, total3;
		double avg;
		
		Grade grade1 = new Grade();
		//Grade grade2 = new Grade1();
		Grade grade2 = new Grade();
		
		grade1.kor	= 70;
		grade2.eng	= 55;
		
		total1	= grade1.kor + grade2.eng + grade1.math;
		total2	= grade2.kor + grade2.eng + grade2.math;   //   total 1, 2, 3 은 똑같은 값을 참조하고 있기 때문에 총점도 평점도 같게 나옴.
		total3	= grade2.kor + grade2.eng + grade1.math;
		avg = total1 / 3.0; 
	
		System.out.println(" 총 점 : " + total1);
		System.out.println(" 총 점 : " + total2);
		System.out.println(" 총 점 : " + total3);
		System.out.println(" 평 균 : " + avg);
		
		
	}

}

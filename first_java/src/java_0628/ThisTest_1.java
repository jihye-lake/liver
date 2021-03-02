package java_0628;

class This_1 {
	private int kor;
	private int eng;
	private int math;
	
	public This_1(int kor, int eng, int math) {	  //  밖에 있는 것과 안에 있는 매개변수가 같으면 안이 더 우선순위가 높음
		this.kor = kor;
		this.eng = eng;				//이런식으로 this. 를 앞에 붙여주면 정상적으로 계산이 됨(안 붙이려면 변수이름을 단 하나로 해야 함)
		this.math= math;
	}
	
	public int total() {  //  전역변수인 kor, eng, math 를 지칭하는 것이기 때문에 this 를 안 붙여도 자동으로 인식함
		return (kor + eng + math);
	}
}

public class ThisTest_1 {
	
	public static void main(String[] args) {
		This_1 obj_1 = new This_1(55, 77, 88);
		
		System.out.println(" 총 점 : " + obj_1.total());
	}

}

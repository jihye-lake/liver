package java_0628;

class This_1 {
	private int kor;
	private int eng;
	private int math;
	
	public This_1(int kor, int eng, int math) {	  //  �ۿ� �ִ� �Ͱ� �ȿ� �ִ� �Ű������� ������ ���� �� �켱������ ����
		this.kor = kor;
		this.eng = eng;				//�̷������� this. �� �տ� �ٿ��ָ� ���������� ����� ��(�� ���̷��� �����̸��� �� �ϳ��� �ؾ� ��)
		this.math= math;
	}
	
	public int total() {  //  ���������� kor, eng, math �� ��Ī�ϴ� ���̱� ������ this �� �� �ٿ��� �ڵ����� �ν���
		return (kor + eng + math);
	}
}

public class ThisTest_1 {
	
	public static void main(String[] args) {
		This_1 obj_1 = new This_1(55, 77, 88);
		
		System.out.println(" �� �� : " + obj_1.total());
	}

}

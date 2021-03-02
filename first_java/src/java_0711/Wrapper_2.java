package java_0711;

public class Wrapper_2 {
	public static void main(String[] args) {
		
		Integer abc_1 = new Integer(789);
		Integer abc_2 = new Integer(456);
		
		int kbs_1 = (int)abc_1;  //Unboxing  *box������ ���ٴ� �� class �� ���ٴ� �Ű�, unboxing �� class ������ ���Դٴ� ���̴�.
		int kbs_2 = abc_2;  //Auto Unboxing => �ڵ����� ��. �Ƚᵵ ������.
		
		Integer bbc_1 = (Integer)357;  //Boxing
		Integer bbc_2 = 589;  //Auto Boxing
		
		Integer king_1 = abc_1 + abc_2; //Wrapper ���� ����
		Integer king_2 = kbs_1 + kbs_2; //�⺻�� ���� ���� �� Auto Boxing
		
		int queen_1 = abc_1 + kbs_1; //�⺻���� Wrapper �� ����
		
		System.out.println("abc_1 : " + abc_1);
		System.out.println("abc_2 : " + abc_2);
		System.out.println("kbs_1 : " + kbs_1);
		System.out.println("kbs_2 : " + kbs_2);
		System.out.println("bbc_1 : " + bbc_1);
		System.out.println("bbc_2 : " + bbc_2);
		System.out.println("king_1 : " + king_1);
		System.out.println("king_2 : " + king_2);
		System.out.println("queen_1 : " + queen_1);
		
		/*
		 * �׷��ٸ� ����ü ���� ����ڽ̰� ��ڽ��� ����ؾ� �ұ��? 
		 * ���۷��� Ÿ�԰� �⺻ Ÿ�� ������ "���Ǵ��� ����ġ"�� �ִ� ��쿡�� ����ϼ���.(��, �⺻Ÿ���� �� �� ���� ��쿡�� ����) 
		 * ���� ��� Map �̳� Set ���� Jaca Collection ���� �⺻ Ÿ���� �� �ֱ� ������
		 * �̷� ��쿡�� ���۷��� Ÿ���� ���� �˴ϴ�. 
		 * ������ ���� ����̳�, ���ɿ� �ΰ��� ��� �ڵ忡 ����ڽ�/��ڽ��� ����ϴ� �� �������� �ʽ��ϴ�. 
		 * Integer �� int �� �Ϻ��ϰ� ��ü�� �� �����ϴ�. 
		 * ����ڽ̰� ��ڽ��� �⺻ Ÿ�԰� ���۷��� Ÿ�� ������ ������ �帴�ϰ� �����������, �� ���̸� �Ϻ��ϰ� ���ִ� ���� �ƴմϴ�.
		 */
		
	}

}

package java_0711;

public class Wrapper_9 {
	public static void main(String[] args) {
		
		int ss_data = 0;
		
		short max = Short.MAX_VALUE;
		short min = Short.MIN_VALUE;
		
//		Short ss = new Short("888"); //�빮�ڷ� �� �� class �ҹ��ڷ� �� �� keyword
//		ss_data = ss.intValue(); //�� �� ���� �Ʒ�ó�� �� �ٷ� ǥ���� �� ����
		
		int ss_data1 = new Short("888").shortValue();
		
		System.out.println("ss_data : " + ss_data1 + ", �ִ밪 : " +max+ " �ּҰ� : " + min);
		
		//2�� ����ü�� ���
	}

}

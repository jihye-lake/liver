package java_0712;

public class String_7 {
	public static void main(String[] args) {
		
		String str = "�� ���� �ܾ ���ԵǾ� �ֳ���!";
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)==' ') {  // ' ' ���̿� �����̽��� �ϳ� �ֱ� Space Bar = 32 ASCII Code �� ������ 32���̴�
				count ++;
				
			}
			
		}
		
		System.out.println("�ܾ��� ���� : " + (count + 1) + " ��");  //���⼭�� �ܾ�� ���ڰ� �پ��ִ� ����
		
	}

}

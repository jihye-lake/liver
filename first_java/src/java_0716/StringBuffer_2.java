package java_0716;

public class StringBuffer_2 {
	public static void main(String[] args) {
		
		StringBuffer stbf = new StringBuffer("Java");
		
		stbf.append(" Program");
		
		System.out.println(stbf);
		
		for (int i = 0; i < stbf.length(); i++) {
			
			System.out.print(stbf.charAt(i) + "\t");  //tabŰ��ŭ ���鼭 �ϳ��� ����
			
		}
		
		stbf.insert(4, "��");
		
		System.out.println("\n" + stbf);
		
		System.out.println("���ڿ��� ���� : " + stbf.length());
		
		stbf.setLength(5);  //set �� �ٲ۴ٴ� ��. get �� �����´ٴ� ��
		
		System.out.println("���ο� ���ڿ��� ���� : " + stbf.length());
		
		System.out.println("setLength(5) ���� ���ڿ� : " + stbf);
		
		System.out.println("���� ���ڿ� : " + stbf.reverse());
		
		//�������� �������ڿ��� �̰ɷ� �̿��ؼ� ������ �ߴ�
		//		System.out.println();
		//    for (int i = stbf.length()-1; i >=0; i--) {
		//			
        //		System.out.print(stbf.charAt(i) + "\t");  //tabŰ��ŭ ���鼭 �ϳ��� ����
			
		}
	}

//}

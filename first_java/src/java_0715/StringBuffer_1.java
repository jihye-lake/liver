package java_0715;

public class StringBuffer_1 {
	public static void main(String[] args) {
		
		StringBuffer stbf_1 = new StringBuffer("Java");
		StringBuffer stbf_2 = new StringBuffer(10);  //capasize�� 10���� ����
		StringBuffer stbf_3 = new StringBuffer();
		
		System.out.println("stbf_1.length : " + stbf_1.length());
		System.out.println("stbf_1.capacity : " + stbf_1.capacity());
		
		System.out.println();
		System.out.println("stbf_2.length : " + stbf_2.length());
		System.out.println("stbf_2.capacity : " + stbf_2.capacity());
		//capacity() : ���� ���ڿ��� ���� ũ�� => �ƹ��͵� �� ���� �� �⺻ ������� 16��
		
		System.out.println();
		System.out.println("stbf_3.length : " + stbf_3.length());
		System.out.println("stbf_3.capacity : " + stbf_3.capacity());
	}

}

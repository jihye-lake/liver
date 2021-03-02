package java_0711;

public class Wrapper_3 {
	public static void main(String[] args) {
		
		Integer kbs_1 = new Integer(300);
		Integer mbc_1 = new Integer(300);
		
		System.out.println("kbs_1 == mbc_1 : " + (kbs_1 == mbc_1));  //==�� �ּҰ��� �̰�
		
		System.out.println("kbs_1.equals(mbc_1) : " + (kbs_1.equals(mbc_1))); //equals �� �������
																									// equals �� object �� method �ϱ� ��밡��
//		System.out.println(kbs_1.hashCode());
//		System.out.println(mbc_1.hashCode());
	
		System.out.println("kbs_1.toString() : " + kbs_1.toString());
		System.out.println("mbc_1.toString() : " + mbc_1.toString());
		
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		
		System.out.println("SIZE : " + Integer.SIZE + "bits");  //int �� 4byte�̱� ������ 4(byte) * 8 (bit) = 32 bits �� ��
		System.out.println("TYPE : " + Integer.TYPE);	
		
	}

}

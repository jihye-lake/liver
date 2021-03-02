package java_0711;

public class Wrapper_3 {
	public static void main(String[] args) {
		
		Integer kbs_1 = new Integer(300);
		Integer mbc_1 = new Integer(300);
		
		System.out.println("kbs_1 == mbc_1 : " + (kbs_1 == mbc_1));  //==는 주소값비교 이고
		
		System.out.println("kbs_1.equals(mbc_1) : " + (kbs_1.equals(mbc_1))); //equals 는 내용비교임
																									// equals 는 object 속 method 니까 사용가능
//		System.out.println(kbs_1.hashCode());
//		System.out.println(mbc_1.hashCode());
	
		System.out.println("kbs_1.toString() : " + kbs_1.toString());
		System.out.println("mbc_1.toString() : " + mbc_1.toString());
		
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		
		System.out.println("SIZE : " + Integer.SIZE + "bits");  //int 는 4byte이기 때문에 4(byte) * 8 (bit) = 32 bits 가 됨
		System.out.println("TYPE : " + Integer.TYPE);	
		
	}

}

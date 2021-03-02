package java_0715;

public class StringBuffer_1 {
	public static void main(String[] args) {
		
		StringBuffer stbf_1 = new StringBuffer("Java");
		StringBuffer stbf_2 = new StringBuffer(10);  //capasize를 10으로 변경
		StringBuffer stbf_3 = new StringBuffer();
		
		System.out.println("stbf_1.length : " + stbf_1.length());
		System.out.println("stbf_1.capacity : " + stbf_1.capacity());
		
		System.out.println();
		System.out.println("stbf_2.length : " + stbf_2.length());
		System.out.println("stbf_2.capacity : " + stbf_2.capacity());
		//capacity() : 현재 문자열의 버퍼 크기 => 아무것도 안 썼을 때 기본 사이즈는 16임
		
		System.out.println();
		System.out.println("stbf_3.length : " + stbf_3.length());
		System.out.println("stbf_3.capacity : " + stbf_3.capacity());
	}

}

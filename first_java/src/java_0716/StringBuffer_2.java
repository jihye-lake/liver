package java_0716;

public class StringBuffer_2 {
	public static void main(String[] args) {
		
		StringBuffer stbf = new StringBuffer("Java");
		
		stbf.append(" Program");
		
		System.out.println(stbf);
		
		for (int i = 0; i < stbf.length(); i++) {
			
			System.out.print(stbf.charAt(i) + "\t");  //tab키만큼 띄우면서 하나씩 찍어내라
			
		}
		
		stbf.insert(4, "★");
		
		System.out.println("\n" + stbf);
		
		System.out.println("문자열의 길이 : " + stbf.length());
		
		stbf.setLength(5);  //set 은 바꾼다는 뜻. get 은 가져온다는 뜻
		
		System.out.println("새로운 문자열의 길이 : " + stbf.length());
		
		System.out.println("setLength(5) 적용 문자열 : " + stbf);
		
		System.out.println("반전 문자열 : " + stbf.reverse());
		
		//저번에는 반전문자열을 이걸로 이용해서 나오게 했다
		//		System.out.println();
		//    for (int i = stbf.length()-1; i >=0; i--) {
		//			
        //		System.out.print(stbf.charAt(i) + "\t");  //tab키만큼 띄우면서 하나씩 찍어내라
			
		}
	}

//}

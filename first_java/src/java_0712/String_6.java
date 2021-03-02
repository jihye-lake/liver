package java_0712;

public class String_6 {
	public static void main(String[] args) {
		
		String str = "자바는 정말 재미있습니다.";
		
		System.out.println(str.substring(1));  //1번 부터 시작해서 마지막까지 다 뽑아라
		System.out.println(str.substring(4,7)); //4번부터 시작해서 7번 앞까지 뽑아라
		System.out.println(str.substring(6,9));  //6번부터 시작해서 9번 앞까지 뽑아라
		System.out.println(str.substring(4,5));  //"정" 한 글자만 뽑기
	}
}

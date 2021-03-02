package java_0716;

public class String_16 {
	public static void main(String[] args) {
		
		String fullName = "Korea.java";
		
		//fullName 에서 '.' 점의 위치를 찾는다.
		
		int index = fullName.indexOf('.');  //indexOf => index 위치 찾기
		System.out.println(index); //5가 나옴. 점 앞까지라서
		
		//fullName 의 첫 번째 글자부터 '.' 이 있는 곳까지 문자열을 추출
		String fileName = fullName.substring(0,index);  //0,1,2,3,4 (index 5 앞까지이기 때문에)
		
		// '.' 다음 문자부터 시작 문자열 끝까지 추출
		String ext = fullName.substring(index + 1);  //5+1 부터 끝까지 나오니까 java 가 나옴
		//== 										  ((index + 1), fullName.length());
		
		System.out.println(fullName + "의 확장자를 제외한 이름 : " + fileName);
		System.out.println(fullName + "의 확장자는 : " + ext);
		
		//이게 파일이름과 확장자만 가져올 수 있는 방법이다.
	}

}

package java_0712;

public class String_11 {
	public static void main(String[] args) {
		
		String[] str = {"사랑", "자바", "love", "Love", "愛", "가", "하", "ㄱ", "ㅎ"};
		
		System.out.println("\n*** 정렬 전 수행 문자열 ***\n");
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + '\t');			
		}
		System.out.println("\n\n*** 정렬 후 수행 문자열 ***\n");
		
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {  //정렬식 외우기
				
				if (str[i].compareTo(str[j]) > 0) {  //0보다 크면 오름차순이고, 0보다 작으면 내림차순
					String temp = str[i];
					str[i] = str[j];       //세 줄은 예전에 구구단에서 했던 "스와핑" 식
					str[j] = temp;
					
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + '\t');	
		}
	}

}

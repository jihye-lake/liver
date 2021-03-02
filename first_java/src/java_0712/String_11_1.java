package java_0712;

public class String_11_1 {
	public static void main(String[] args) {
		
		int[] kor = { 67,89,45,87,73,35,93 };
		
		System.out.println("\n*** 정렬 전 수행 문자열 ***\n");
		
		for (int i = 0; i < kor.length; i++) {
			System.out.print(kor[i] + "\t");			
		}
		
		System.out.println("\n\n*** 정렬 후 수행 문자열 ***\n");
		
		for (int i = 0; i < kor.length - 1; i++) {
			for (int j = i+1; j < kor.length; j++) {  //정렬식 외우기
				
				if (kor[i] > kor[j]) {  // > 은 오름차순, < 는 내림차순
					int temp = kor[i];
					kor[i] = kor[j];       //세 줄은 예전에 구구단에서 했던 "스와핑" 식
					kor[j] = temp;
					
				}
			}
		}
		for (int i = 0; i < kor.length; i++) {
			System.out.print(kor[i] + "\t");	
		}
	}

}
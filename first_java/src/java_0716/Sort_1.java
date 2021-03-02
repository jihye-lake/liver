package java_0716;

public class Sort_1 {
	public static void main(String[] args) {
		
		int[] eng = {77,58,49,84,63,92,74};
		
		System.out.println("\n----------------정렬 전----------------\n");
		
		for (int i = 0; i < eng.length; i++) {  
			System.out.print(eng[i] + "\t");			
		}
		
		System.out.println("\n\n------------내림차순 정렬--------------\n");
		//선택정렬(Selection) : 속도는 느리지만 가장 이해하기 쉬운 정렬
		for (int i = 0; i < eng.length-1; i++) {  //마지막까지 갈 필요 없음. 한 단계 전까지만 가면 되니까 -1
			for (int j = i+1; j < eng.length; j++) {  //자기 자신과는 비교할 필요 없으므로 한 단계 위의 j = i+1 와 비교
				
				if (eng[i] < eng[j]) {  //내림차순 정렬이니 작으면 바꿔라(항상 왼쪽이 기준) // 문자열이면 compareto 를 사용
					int temp = eng[i];
					eng[i] = eng[j];
					eng[j] = temp;
					
				}
				
			}
			
		}
		
		for (int i = 0; i < eng.length; i++) {   //스와핑 후에 다시 찍어냄
			System.out.print(eng[i] + "\t");	
			
		}
	}

}

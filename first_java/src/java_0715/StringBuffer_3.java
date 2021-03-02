package java_0715;

public class StringBuffer_3 {
	public static void main(String[] args) {
		
		long start, end;
		
		String str_1 = new String("1 ~ 100 의 합 : ");
		StringBuffer stbf_2 = new StringBuffer("1 ~ 100 의 합 2");
		
		start = System.currentTimeMillis();
		int count = 0;
		
		for (int i = 0; i < 1000; i++) {
			
			count ++;
			str_1 += i;
			str_1 += "+";
			
			if (count % 10 == 0) {
				System.out.println();
				
			}
			System.out.println(str_1);
			
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("String Time : " + (end - start));
		
		
		start = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			
			count ++;
			stbf_2.append(i);  //StringBuffer 의 속도가 더 빠르다. 위와 같은 계산방식이지만 차이가 크다
			stbf_2.append("+");  //그러므로 문자에 빈번한 변동이 생기는 경우에는  Buffer 을 쓰는 게 효율적이다.
			
			if (count % 10 == 0) {
				System.out.println();
				
			}
			System.out.println(stbf_2);	
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("StringBuffer Time : " + (end - start));
	}
		
	}

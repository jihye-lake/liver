package java_0715;

public class StringBuffer_3 {
	public static void main(String[] args) {
		
		long start, end;
		
		String str_1 = new String("1 ~ 100 �� �� : ");
		StringBuffer stbf_2 = new StringBuffer("1 ~ 100 �� �� 2");
		
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
			stbf_2.append(i);  //StringBuffer �� �ӵ��� �� ������. ���� ���� ����������� ���̰� ũ��
			stbf_2.append("+");  //�׷��Ƿ� ���ڿ� ����� ������ ����� ��쿡��  Buffer �� ���� �� ȿ�����̴�.
			
			if (count % 10 == 0) {
				System.out.println();
				
			}
			System.out.println(stbf_2);	
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("StringBuffer Time : " + (end - start));
	}
		
	}

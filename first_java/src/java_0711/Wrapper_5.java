package java_0711;

public class Wrapper_5 {
	public static void main(String[] args) {
		
		Boolean bool_1 = new Boolean(true);
		Boolean bool_2 = new Boolean("345"); //true �ƴϸ� false �� ����ϴµ� �� �ܿ� �ٸ� ���� ���� false �� ���´�.
		
		if (bool_1.booleanValue()) {
			System.out.println("bool_1 ��ü�� true �Դϴ�.");
			
		} else 
			System.err.println("bool_1 ��ü�� flase �Դϴ�.");		
		
		if (bool_2.booleanValue()) {
			System.out.println("bool_2 ��ü�� true �Դϴ�.");
			
		} else 
			System.err.println("bool_2 ��ü�� flase �Դϴ�.");		
		
	}

}

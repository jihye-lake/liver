package white_0714;

class MyCounter_1 {
	int counter;
	
	MyCounter_1(int value) {
		counter = value;
	}
}

public class MyCounterTest_1 {
	public static void main(String[] args) {
		
		MyCounter_1 obj1 = new MyCounter_1(100);
		MyCounter_1 obj2 = new MyCounter_1(200);
		
		System.out.println("��ü 1�� counter = " + obj1.counter);
		System.out.println("��ü 2�� counter = " + obj2.counter);
		
		
	}

}

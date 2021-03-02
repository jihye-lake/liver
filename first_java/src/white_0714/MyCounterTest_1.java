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
		
		System.out.println("°´Ã¼ 1ÀÇ counter = " + obj1.counter);
		System.out.println("°´Ã¼ 2ÀÇ counter = " + obj2.counter);
		
		
	}

}

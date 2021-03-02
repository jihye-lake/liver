package java_0628;

class Block_1 {
	static {    //static block 은 공통적으로 감싸주기 때문에 한 번만 수행이 된다
		System.out.println("한 번 만 수행되는 블럭 ~~~");
	}
	
	{  //new 를 쓸 때마다 반복된다
		System.out.println("객체 생성시 마다 수행되는 블럭 !!!");
	}
	
	public Block_1() {
		System.out.println("나는야 자랑스러운 생성자 @@@");
	}
}

public class BlockTest_1 {
	
	public static void main(String[] args) {
		
		System.out.println("Block_1 obj_1 = new Block_1()11");
		Block_1 obj_1 = new Block_1();
		
		System.out.println("\nBlock_1 obj_2 = new Block_1()22");
		Block_1 obj_2 = new Block_1();
		
		System.out.println("\nBlock_1 obj_3 = new Block_1()33");
		Block_1 obj_3 = new Block_1();
	}

}

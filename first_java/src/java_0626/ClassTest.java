package java_0626;

class Data
{
	int x;
	int y;
}

public class ClassTest {
	
	public static void main(String[] args) {
		
		Data dd1 = new Data();
		
		dd1.x = 77;
		dd1.y = 88;
		
		System.out.println("main() x : " + dd1.x);
		
		change(dd1.x);
		
		System.out.println("After change(dd1.x) : " + dd1.x);
		System.out.println("main() x : " + dd1.x);
		
	}

	private static void change(int x) {  //  처음에 main이 static 으로 메소드 영역에서 만들어지는데 그 하위 메소드도 static 이어야 함(혹은 객체가 생성된 후에는 써도 됨)
		
		x = 1000;
		System.out.println("change() x : " + x);
		
	}

}

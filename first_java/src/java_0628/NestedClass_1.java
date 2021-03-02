package java_0628;

class AA {
	
	static class BB //Window - show view - navigator 누르면 $가 보이는데 내부클래스라는 뜻이다
					   //AA속에 BB, BB 속에 CC 이렇게 나타낸다
	{
		
	static int bbb = 777;
	
	static class CC{
		
	int ccc = bbb + 800;
	}
	}
}



public class NestedClass_1 {
	public static void main(String[] args) {
		
		AA.BB.CC obj = new AA.BB.CC();
		
		System.out.println("CC 클래스 내부 변수 ccc = " + obj.ccc);
		//System.out.println("BB 클래스 내부 변수 bbb = " + obj.bbb);
	}

}

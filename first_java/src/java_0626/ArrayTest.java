package java_0626;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		int[] x = {55,77,333};  //  new int 랑 같은 뜻임 / 배열도 객체이므로 heap 공간에 저장됨.
		
		
		System.out.println("main()1 : x = " + x[0]);
		
		change(x);  //  x라는 자체가 배열. 주소값을 전달 함.
		
		System.out.println("After change(x) ");
		System.out.println("main()2 : x = " + x[2]);  //  배열도 객체기 때문에 같은 곳을 참조하고 있기 때문에 값이 바뀔 수 있음.
		
	}
	
	
	static void change(int[] yy)    //  만들어진 값을 공유하고 있다.
	{
		yy[2] = 456789;
		System.out.println("change() : yy[0] = " + yy[2]);
	}
	

}

package java_0701;

class AA_5
{
	String str;
	public AA_5(String str) {
		this.str = str; 
		System.out.println("AA_5 생성자 호출" + str);
	}
}

class BB_5 extends AA_5
{
	public BB_5(String aa) {
		super(aa);
		System.out.println("BB_5 생성자 호출" + aa);
	}
}

class CC_5 extends BB_5
{
	public CC_5(String kk) {
		super(kk);  //그래서 슈퍼(혹은 this)는 가장 첫번째 줄에 기술되어야 한다.
		System.out.println("CC_5 생성자 호출" + kk);
	}
}

public class SuperTest_6 {
	public static void main(String[] args) {
		
		CC_5 obj_1 = new CC_5("맑은 하늘 시원한 물소리");  //문자열이니까 String
		
		System.out.println(obj_1.str);
		
	}

}

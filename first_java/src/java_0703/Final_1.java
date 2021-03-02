package java_0703;

//String 은 대표적인 final 클래스(완벽하기 때문에) 그래서 다른 클래스가 상속받지 못 한다.

class KingWordProcess
{
	void Input() {}  //메소드는 주로 소문자로 쓰지만, 눈에 잘 띄도록 대문자로 씀
	void Edit() {}
	void Print() {
		System.out.println("JH 회사 우수 제품입니다.");
	}
	void About() {
		System.out.println("King 회사 무적 제품");

	}
}

class SubWorldProcess extends KingWordProcess
{
	void About()
	{
		System.out.println("Sub 자회사 제품");
	}
}

public class Final_1 {
	public static void main(String[] args) {
		
		KingWordProcess obj = new SubWorldProcess();
		
		obj.Print();
		obj.About();
		
	}

}

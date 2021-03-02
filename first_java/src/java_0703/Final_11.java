package java_0703;

class Finall
{
	void aa()
	{
		System.out.println("aa 사의 피아노는 음색이 좋다");
	}
	
	void bb()
	{
		System.out.println("bb 사의 피아노는 무게가 가볍다");
	}
	
	void cc() {}
}

class Pentagon extends Finall
{
	void cc()
	{
		System.out.println("cc 사의 피아노는 컬러감이 뛰어나다");
	}
}

public class Final_11 {
	public static void main(String[] args) {
		
		Finall type = new Pentagon();
		
		type.aa();
		type.bb();
		type.cc();
		
	}

}

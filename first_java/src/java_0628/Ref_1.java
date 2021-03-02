package java_0628;

class Ref {
	String Refcolor;
	int Refsize;
	int Refdoor;
	String Refmaker;
	
	public Ref(String Refcolor, int Refsize, int Refdoor, String Refmaker ) {
		this.Refcolor = Refcolor;
		this.Refsize = Refsize;
		this.Refdoor = Refdoor;
		this.Refmaker = Refmaker;
	}
	
	public Ref() {  // 생성자의 Overloading 은 클래스 이름과 같아야 하고 시그니쳐(괄호 안 값) 이 달라야 한다.
		this("Green", 50, 5, "JH");
	}
	
	public Ref(int Refdoor) {
		this("Black", 30, Refdoor, "CH");
	}
	
	public Ref(String Refcolor, int Refdoor) {
		this(Refcolor, 60, Refdoor, "MJ");
	}
	
	public Ref(int Refsize, String Refmaker) {
		this("White", Refsize, 7, Refmaker);
	}
	
	public Ref(String Refmaker) {
		this("orange", 72, 7, Refmaker);
	}
	
	public void display() {
		System.out.println("Color : " + Refcolor + "	| Size : " + Refsize + "	| Door : " + Refdoor + "	| Maker : " + Refmaker);
	}
	
}

public class Ref_1 {
	
	public static void main(String[] args) {
		
		Ref MyRef_0 = new Ref("Yellow", 92, 5, "SH");
		Ref MyRef_1 = new Ref();
		Ref MyRef_2 = new Ref(4);
		Ref MyRef_3 = new Ref("Brown", 5);
		Ref MyRef_4 = new Ref(55, "JY");
		Ref MyRef_5 = new Ref("OR");
		Ref MyRef_6 = new Ref(88);  //int 는 하나밖에 없기 때문에 거기로 매치가 되는 것임 String 이었으면 String  하나만 있는 아무거나 매치가 된다
		//Ref MyRef_6 = new Ref("Blue", "GH");  // String이 두 개인 타입은 내가 만들어두지 않았기 때문에 만들 수 없음
		
		MyRef_0.display();
		MyRef_1.display();
		MyRef_2.display();
		MyRef_3.display();
		MyRef_4.display();
		MyRef_5.display();
		MyRef_6.display();
		
		
		
	}

}

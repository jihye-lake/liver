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
	
	public Ref() {  // �������� Overloading �� Ŭ���� �̸��� ���ƾ� �ϰ� �ñ״���(��ȣ �� ��) �� �޶�� �Ѵ�.
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
		Ref MyRef_6 = new Ref(88);  //int �� �ϳ��ۿ� ���� ������ �ű�� ��ġ�� �Ǵ� ���� String �̾����� String  �ϳ��� �ִ� �ƹ��ų� ��ġ�� �ȴ�
		//Ref MyRef_6 = new Ref("Blue", "GH");  // String�� �� ���� Ÿ���� ���� �������� �ʾұ� ������ ���� �� ����
		
		MyRef_0.display();
		MyRef_1.display();
		MyRef_2.display();
		MyRef_3.display();
		MyRef_4.display();
		MyRef_5.display();
		MyRef_6.display();
		
		
		
	}

}

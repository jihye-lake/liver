package java_0710;

class Card_1 {
	String kind;
	int number;
	
	Card_1() {
		this("SPACE",1);
	}
	
	Card_1(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind : " + kind + ", number : " + number;  //����Ʈ ������ ���������
	}
}

public class CardToString_1 {
	public static void main(String[] args) {
		
		Card_1 obj_1 = new Card_1();
		Card_1 obj_2 = new Card_1("HEART",9);  //�Ű������� �Ѱ��� ��
		
		System.out.println(obj_1.toString());
		System.out.println(obj_2.toString());
		System.out.println(obj_1);
		System.out.println(obj_2);
	}

}

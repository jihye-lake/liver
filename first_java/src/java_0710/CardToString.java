package java_0710;

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPACE",1);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "King";
	}
}

public class CardToString {
	public static void main(String[] args) {
		
		Card obj_1 = new Card();
		Card obj_2 = new Card();
		
		System.out.println(obj_1.toString());
		System.out.println(obj_2.toString());
		System.out.println(obj_1);
		System.out.println(obj_2);
	}

}

package java_0628;

class IceBox {
	String color;
	int size;
	int door;
	String maker;

	public IceBox() {
		this("Green", 87, 4, "JH");
	}



	public IceBox(String color, int size, int door, String maker) {
		this.color = color;
		this.size = size;
		this.door = door;
		this.maker = maker;
	}

	public IceBox(String color, int size, String maker) {
		this(color, size, 6, maker);
	}
	
	public IceBox(String maker, int size) {
		this("Blue", 66, 7, maker);
	}
	
	public IceBox(String maker) {
		this("black", 63, 2, maker);
	}
	
	public void display() {
		System.out.println("\ncolor : " +color+ "\nsize : " +size+ "\ndoor : " + door + "\nmaker : " + maker);
	}
	

}


public class IceBox_1 {
	public static void main(String[] args) {
		
		IceBox IceBox_1 = new IceBox();
		IceBox IceBox_2 = new IceBox("Yellow", 670, 6, "JH");
		IceBox IceBox_3 = new IceBox("Green", 342, "CH");
		IceBox IceBox_4 = new IceBox("white", 780);
		IceBox IceBox_5 = new IceBox("Red");
		
		IceBox_1.display();
		IceBox_2.display();
		IceBox_3.display();
		IceBox_4.display();
		IceBox_5.display();
		
		
	}

}

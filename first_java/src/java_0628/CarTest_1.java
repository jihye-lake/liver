package java_0628;

class Car_1 {
	String color;
	String gearType;
	int door;

	public Car_1() {
		this("white", "auto", 4);
	}

	public Car_1(String color, String gearType, int door) {
		
		this.color = color;
		this.gearType = gearType;
		this.door = door;

	}
	
	public Car_1(Car_1 car) {  //매개변수에 또 다른 클래스가 들어올 수 있다?
		color = car.color;
		gearType = car.gearType;
		door = car.door;
	}
}

public class CarTest_1 {
	
	public static void main(String[] args) {
		
		Car_1 obj_1 = new Car_1();
		Car_1 obj_2 = new Car_1(obj_1);   // obj_1 의 복사본 obj_2 생성
		
		System.out.println("\nobj_1 color = " +obj_1.color+ "\nobj_1 gearType = " +obj_1.gearType+ "\nobj_1 door = " +obj_1.door);
		System.out.println("\nobj_2 color = " +obj_2.color+ "\nobj_2 gearType = " +obj_2.gearType+ "\nobj_2 door = " +obj_2.door);
		
		
		obj_1.door = 88;
		
		System.out.println("\nobj_1 color = " +obj_1.color+ "\nobj_1 gearType = " +obj_1.gearType+ "\nobj_1 door = " +obj_1.door);
		System.out.println("\nobj_2 color = " +obj_2.color+ "\nobj_2 gearType = " +obj_2.gearType+ "\nobj_2 door = " +obj_2.door);
	}

}

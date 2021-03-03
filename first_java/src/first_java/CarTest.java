package first_java;

public class CarTest {
	
	public int door = 4;  // 멤버 변수
	public String gear = "AUTO";  // 멤버 변수
	public int speed = 60; // 멤버 변수
	
	public void speedUp()  // 멤버 메소드
	{
		speed++;  //  5씩 올리고 싶으면 speed += 5;
	}
	
	public void speedDown() // 멤버 메소드
	{
		speed--;  //  3씩 내리고 싶으면 speed -= 3;
	}
	
	
	
	public static void main(String[] args) {
		
		CarTest superCar = new CarTest();
		   //  superCar 객체 생성
		
		System.out.println("\n슈퍼카의 door : " +superCar.door+ "\n슈퍼카의 기어 : " +superCar.gear+ "\n슈퍼카의 속도 : " +superCar.speed+ "km/h");
		
		superCar.door = 7;
		superCar.speedUp();
		superCar.speedUp();
		superCar.speedUp();
		superCar.speedUp();
		superCar.speedDown();
		superCar.speedDown();
		
		
		System.out.println("\n슈퍼카의 door : " +superCar.door+ "\n슈퍼카의 기어 : " +superCar.gear+ "\n슈퍼카의 속도 : " +superCar.speed+ "km/h");
		
	}

}

package first_java;

public class CarTest {
	
	public int door = 4;  // ��� ����
	public String gear = "AUTO";  // ��� ����
	public int speed = 60; // ��� ����
	
	public void speedUp()  // ��� �޼ҵ�
	{
		speed++;  //  5�� �ø��� ������ speed += 5;
	}
	
	public void speedDown() // ��� �޼ҵ�
	{
		speed--;  //  3�� ������ ������ speed -= 3;
	}
	
	
	
	public static void main(String[] args) {
		
		CarTest superCar = new CarTest();
		   //  superCar ��ü ����
		
		System.out.println("\n����ī�� door : " +superCar.door+ "\n����ī�� ��� : " +superCar.gear+ "\n����ī�� �ӵ� : " +superCar.speed+ "km/h");
		
		superCar.door = 7;
		superCar.speedUp();
		superCar.speedUp();
		superCar.speedUp();
		superCar.speedUp();
		superCar.speedDown();
		superCar.speedDown();
		
		
		System.out.println("\n����ī�� door : " +superCar.door+ "\n����ī�� ��� : " +superCar.gear+ "\n����ī�� �ӵ� : " +superCar.speed+ "km/h");
		
	}

}

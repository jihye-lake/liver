package first_java;

class Car
{
	String Color;
	String gearType;
	int		door;
	String Maker;
		
	public Car() {    //  default 생성자 / 여러개의 생성자 => 생성자의 OverLoading! 3개 짜리도 존재하고, 4개 짜리도 존재 함
	}
	
	public Car(String c , String g , int d)
	{
		Color			= c;
		gearType		= g;
		door			= d;
		Maker		= "BMW";
	}
	
	public Car(String c , String g , int d, String m)
	{
		Color			= c;
		gearType		= g;
		door			= d;
		Maker		= m;
	}
	

	}

public class CarTest_2 {
	
	public static void main(String[] args) {
		
		Car cc1 = new Car();
		
		cc1.Color			= "white";    //  default 생성자를 만들고자 한다면 적어줘야 함
		cc1.gearType	= "AUTO";
		cc1.door			= 3;
		cc1.Maker		= "JH";
		
		
		Car cc2 = new Car("Black" , "STICK" ,8, "BMW");
		Car cc3 = new Car("Green" , "STICK" ,4 ,"CH");
		
		System.out.println("cc1 의 Color : " + cc1.Color + "\ncc1 의 gear : " + cc1.gearType + "\ncc2 door : " + cc1.door + "\ncc1 Maker : " + cc1.Maker);
		
		System.out.println("\ncc2 의 Color : " + cc2.Color + "\ncc2 의 gear : " + cc2.gearType + "\ncc2 door : " + cc2.door + "\ncc2 Maker : " + cc2.Maker);
		
		System.out.println("\ncc3 의 Color : " + cc3.Color + "\ncc3 의 gear : " + cc3.gearType + "\ncc3 door : " + cc3.door + "\ncc3 Maker : " + cc3.Maker);
	}

}

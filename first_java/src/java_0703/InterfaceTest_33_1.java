package java_0703;

interface Strawberry
{
	public void red();
}

class Blueberry implements Strawberry
{
	@Override
	public void red()
	{
		System.out.println("Strawberry Interface Method Override");
	}
	
	public void blue()
	{
		System.out.println("Blueberry vlass Method");
	}
}

public class InterfaceTest_33_1 {
	public static void main(String[] args) {
		
		Blueberry fruit_1 = new Blueberry();
		
		fruit_1.red();
		fruit_1.blue();
		
		System.out.println("============================");
		
		Strawberry fruit_2 = new Blueberry();
		
		fruit_2.red();
		//fruit_2.blue();
	}

}

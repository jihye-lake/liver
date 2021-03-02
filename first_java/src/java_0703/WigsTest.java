package java_0703;

interface Car
{
	void run();
}

interface Ship
{
	void navigation();
}

interface Mole
{
	void dig();
}

interface Wigs extends Car,Ship,Mole  //extends 라도 여러 개 올 수 있으니까 interface.
{
	void floating();
}

class EagleFive implements Wigs
{

	@Override  //재정의
	public void run() {
		System.out.println("황야를 달린다.");
		
	}

	@Override
	public void navigation() {
		System.out.println("바다를 향한다.");
		
	}

	@Override
	public void floating() {
		System.out.println("산위를 날아다닌다.");
		
	}

	@Override
	public void dig() {
		System.out.println("땅굴을 파고 들어간다.");
		
	}
	
}

public class WigsTest {
	public static void main(String[] args) {
		
		EagleFive animal = new EagleFive();
		
		
		animal.run();
		animal.navigation();
		animal.floating();
		animal.dig();
	}

}

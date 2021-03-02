package java_0703;

interface Bird
{
	public long speed = 50;  //static final 생략되어 있음
	public void fly(); //추상메소드 => 객체화 되지 못함
}

interface Hourse
{
	void run(); //추상메소드 => 객체화 되지 못함
}

interface Fish
{
	void swimming();
}

class Pegasus implements Bird, Hourse, Fish  //복수로 적어줄 수 있음(extends 는 하나만 가능했음) 한 번에 상속 가능
{

	@Override
	public void run() {
		System.out.println("대륙을 뛰어 다닌다.");
		
	}

	@Override
	public void fly() {
		System.out.println("하늘을 날아 다닌다.");
		
	}
	
	@Override
	public void swimming() {
		System.out.println("바다를 헤엄친다.");
	}
		
}

public class PegasusTest {
	public static void main(String[] args) {
		
		Pegasus animal = new Pegasus();  //Bird animal, Hourse animal, Fish animal 만 적으면 몇몇 개는 받을 수 없다.
		
		animal.fly();
		animal.run();
		animal.swimming();
		System.out.println(animal.speed);
		
	}

}

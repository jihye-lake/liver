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

interface Wigs extends Car,Ship,Mole  //extends �� ���� �� �� �� �����ϱ� interface.
{
	void floating();
}

class EagleFive implements Wigs
{

	@Override  //������
	public void run() {
		System.out.println("Ȳ�߸� �޸���.");
		
	}

	@Override
	public void navigation() {
		System.out.println("�ٴٸ� ���Ѵ�.");
		
	}

	@Override
	public void floating() {
		System.out.println("������ ���ƴٴѴ�.");
		
	}

	@Override
	public void dig() {
		System.out.println("������ �İ� ����.");
		
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

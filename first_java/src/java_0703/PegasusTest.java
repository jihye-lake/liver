package java_0703;

interface Bird
{
	public long speed = 50;  //static final �����Ǿ� ����
	public void fly(); //�߻�޼ҵ� => ��üȭ ���� ����
}

interface Hourse
{
	void run(); //�߻�޼ҵ� => ��üȭ ���� ����
}

interface Fish
{
	void swimming();
}

class Pegasus implements Bird, Hourse, Fish  //������ ������ �� ����(extends �� �ϳ��� ��������) �� ���� ��� ����
{

	@Override
	public void run() {
		System.out.println("����� �پ� �ٴѴ�.");
		
	}

	@Override
	public void fly() {
		System.out.println("�ϴ��� ���� �ٴѴ�.");
		
	}
	
	@Override
	public void swimming() {
		System.out.println("�ٴٸ� ���ģ��.");
	}
		
}

public class PegasusTest {
	public static void main(String[] args) {
		
		Pegasus animal = new Pegasus();  //Bird animal, Hourse animal, Fish animal �� ������ ��� ���� ���� �� ����.
		
		animal.fly();
		animal.run();
		animal.swimming();
		System.out.println(animal.speed);
		
	}

}

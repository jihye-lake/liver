package java_0703;

class Kbs
{
	void autoPlay(Mbc obj)  //���� Mbc�� interface��  //Mbc obj = new MySbs()
																			 //Mbc obj = new MyCnn()
	{
		obj.play();
	}
}

interface Mbc
{
	void play();
}

class MySbs implements Mbc
{
	public void play()
	{
		System.out.println(" MySbs Tv ������Դϴ�.");
	}
}

class MyCnn implements Mbc
{
	public void play()
	{
		System.out.println(" Mycnn Tv �߰����Դϴ�.");
	}
}

public class InterfaceTest_4 {
	public static void main(String[] args) {
		
		Kbs oop = new Kbs();
		
		oop.autoPlay(new MySbs());  //MySbs �� Mycnn �� ��� Mbc �� ���� �͵�
		oop.autoPlay(new MyCnn());
		
	}

}

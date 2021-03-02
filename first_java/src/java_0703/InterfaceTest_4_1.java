package java_0703;

class Orange
{
	void autoPlay(Mango fruit)
	{
		fruit.play();
	}
}

interface Mango
{
	void play();
}

class Lemon implements Mango
{
	public void play()
	{
		System.out.println(" There is Lemon that is yellow and sour.");
	}
}

class Cabbage implements Mango
{
	public void play()
	{
		System.out.println(" There is Cabbage that is green and A healthy taste.");
	}
}

public class InterfaceTest_4_1 {
	public static void main(String[] args) {
		
		Orange taste = new Orange();
		
		taste.autoPlay(new Lemon());
		taste.autoPlay(new Cabbage());
		
	}

}

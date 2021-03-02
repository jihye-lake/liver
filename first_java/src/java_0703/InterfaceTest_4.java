package java_0703;

class Kbs
{
	void autoPlay(Mbc obj)  //여기 Mbc는 interface임  //Mbc obj = new MySbs()
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
		System.out.println(" MySbs Tv 생방송입니다.");
	}
}

class MyCnn implements Mbc
{
	public void play()
	{
		System.out.println(" Mycnn Tv 중계방송입니다.");
	}
}

public class InterfaceTest_4 {
	public static void main(String[] args) {
		
		Kbs oop = new Kbs();
		
		oop.autoPlay(new MySbs());  //MySbs 와 Mycnn 은 모두 Mbc 를 받은 것들
		oop.autoPlay(new MyCnn());
		
	}

}

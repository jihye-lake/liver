package java_0701;

class SuperTV_1 extends Object {
	boolean power;
	int channel;
	int volume;
	
	void power_1() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void volumeUp() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
	
}

class MyTv_1 extends SuperTV {
	void displayCaption(String str) {
		if (power) {
			System.out.println(str);
			System.out.println("volume : " + volume);
		}
	}
}

public class SuperTest_2_1 {
	public static void main(String[] args) {
		MyTv myTV = new MyTv();
		
		myTV.channel = 9;
		myTV.volume = 15;
		myTV.channelUp();
		myTV.channelUp();
		myTV.channelUp();
		myTV.volumeDown();
		myTV.volumeDown();
		
		System.out.println("channel	: " + myTV.channel);
		
		myTV.displayCaption("caption	: " + "아름다운 강산");
		
		myTV.power_1();
		
		myTV.displayCaption("caption	: " + "시원한 가을 바람");
	}

}

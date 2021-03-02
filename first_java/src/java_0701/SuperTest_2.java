package java_0701;

class SuperTV extends Object // Object 를 안 써도 기본적으로 있다는 뜻이다. Object 를 상속받는다.
{
	boolean power; // boolean 의 default 값은 false임
	int channel;
	int volume; // = 15; 초기화는 아래에서 시켜줬음

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

class MyTv extends SuperTV // MyTv 가 여기서 상속을 받았음
{
	// boolean caption;

	void displayCaption(String str) {
		if (power) { // 원래는 if(caption)
			System.out.println(str);
			System.out.println("volume	: " + volume);
		}
	}
}

public class SuperTest_2 {
	public static void main(String[] args) {

		MyTv myTV = new MyTv();

		myTV.channel = 9;
		myTV.volume = 15;
		myTV.channelUp();
		myTV.channelUp();
		myTV.volumeDown();
		myTV.volumeDown();
		myTV.volumeDown();

		System.out.println("channel	: " + myTV.channel);
		// System.out.println("volume : " + myTV.volume);

		myTV.displayCaption("caption	: " + "아름다운 강산");

		myTV.power_1(); // 원래는 myTV.caption = true;

		myTV.displayCaption("caption	: " + "시원한 가을 바람");

	}

}

package java_0701;

class SuperTV extends Object // Object �� �� �ᵵ �⺻������ �ִٴ� ���̴�. Object �� ��ӹ޴´�.
{
	boolean power; // boolean �� default ���� false��
	int channel;
	int volume; // = 15; �ʱ�ȭ�� �Ʒ����� ��������

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

class MyTv extends SuperTV // MyTv �� ���⼭ ����� �޾���
{
	// boolean caption;

	void displayCaption(String str) {
		if (power) { // ������ if(caption)
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

		myTV.displayCaption("caption	: " + "�Ƹ��ٿ� ����");

		myTV.power_1(); // ������ myTV.caption = true;

		myTV.displayCaption("caption	: " + "�ÿ��� ���� �ٶ�");

	}

}

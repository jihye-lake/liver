package first_java;

public class MyTv {
	
	String tvType = "red";			//  ��� ����
	int tvSize = 30;					//  ��� ����
	boolean tvPower = false;	//  ��� ����
	int tvVolume = 10;				//  ��� ����
	int tvChannel = 9;				//  ��� ����
	String tvMaker = "JH";		//  ��� ����
	
	public MyTv() { 					 // default ������
		
	}
	
	public void powerOn()			//  ��� �޼ҵ�
	{
		tvPower = true;
	}
	
	public void powerOff()			//  ��� �޼ҵ�
	{
		tvPower = false;
	}
	
	/* Power on off �� �ϳ��� Ű�� �������?
	 * public void PowerOnOff()
	 * {
	 * 	  tvPower = !tvPower;
	 * }
	 * 
	 * �̷��� ���ָ� �� �� ������ ������, �� �� ������ ������ ������ ������ => �̰��� ���Ű��� �θ���.
	 */
	
	public void channelUp()		//  ��� �޼ҵ�
	{
		tvChannel ++;
	}
	
	public void channelDown()	//  ��� �޼ҵ�
	{
		tvChannel --;
	}
	
	public void volumeUp()		//  ��� �޼ҵ�
	{
		tvVolume ++;
	}
	
	public void volumeDown()	//  ��� �޼ҵ�
	{
		tvVolume --;
	}
	


	public static void main(String[] args) {
		
		MyTv  myTV = new MyTv();	 // myTV => ��ü ���� ����
		
		myTV.tvMaker = "CH";
		myTV.powerOn();
		myTV.channelUp();
		myTV.channelUp();
		myTV.channelUp();
		myTV.volumeUp();
		myTV.volumeUp();
		myTV.volumeUp();
		myTV.volumeUp();
		
		if(myTV.tvPower == true) {
			System.out.println("\nmyTV : " +myTV.tvMaker+ "\nmyTV : " +myTV.tvPower+ "\nmyTV : " +myTV.tvChannel+ "\nmyTV : " +myTV.tvVolume);
			
		}
		
		else
			System.out.println("TV �� �������ϴ�.");  //   TV ������ false �� �����ϸ�(Off) �����ٰ� ����.
	}

}

package first_java;

public class MyTv {
	
	String tvType = "red";			//  멤버 변수
	int tvSize = 30;					//  멤버 변수
	boolean tvPower = false;	//  멤버 변수
	int tvVolume = 10;				//  멤버 변수
	int tvChannel = 9;				//  멤버 변수
	String tvMaker = "JH";		//  멤버 변수
	
	public MyTv() { 					 // default 생성자
		
	}
	
	public void powerOn()			//  멤버 메소드
	{
		tvPower = true;
	}
	
	public void powerOff()			//  멤버 메소드
	{
		tvPower = false;
	}
	
	/* Power on off 를 하나의 키로 만들려면?
	 * public void PowerOnOff()
	 * {
	 * 	  tvPower = !tvPower;
	 * }
	 * 
	 * 이렇게 해주면 한 번 넣으면 켜지고, 두 번 누르면 꺼지는 설정이 가능함 => 이것을 토글키라고 부른다.
	 */
	
	public void channelUp()		//  멤버 메소드
	{
		tvChannel ++;
	}
	
	public void channelDown()	//  멤버 메소드
	{
		tvChannel --;
	}
	
	public void volumeUp()		//  멤버 메소드
	{
		tvVolume ++;
	}
	
	public void volumeDown()	//  멤버 메소드
	{
		tvVolume --;
	}
	


	public static void main(String[] args) {
		
		MyTv  myTV = new MyTv();	 // myTV => 객체 참조 변수
		
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
			System.out.println("TV 는 꺼졌습니다.");  //   TV 전원을 false 로 설정하면(Off) 꺼졌다고만 나옴.
	}

}

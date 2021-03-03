package first_java;

public class MyTVTest {
	
	public String tvCompany = "JH";
	public String tvColor = "BLACK";
	public int tvSize = 32;
	public boolean tvPower = false;
	public int tvVolume = 20;
	public int tvChannel = 30;
	
	public void tvPowerOn()
	{
		tvPower = true;
	}
	
	public void tvPowerOff()
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
	
	public void volumeUp() 
	{
		tvVolume += 2;
	}
	
	public void volumDown() 
	{
		tvVolume -= 2;
	}
	
	public void tvChannelUp()
	{
		tvChannel ++;
	}
	
	public void tvChannelDown()
	{
		tvChannel --;
	}
	
	public static void main(String[] args) {
		
		MyTVTest BestTV = new MyTVTest();  // new가 생성자를 만들도록 도와준다.
		
		BestTV.tvPowerOn();
		BestTV.tvChannelUp();
		BestTV.tvChannelUp();
		BestTV.tvChannelUp();
		BestTV.volumDown();
		BestTV.volumDown();
		
		if(BestTV.tvPower == true)
			{
			System.out.println("베스트 티비의 브랜드	: " +BestTV.tvCompany+ "\n브랜드는 "+BestTV.tvCompany+" 입니다. 고객센터 번호는 XXX-XXXX-XXXX 입니다."+
			"\n\n베스트 티비의 컬   러	: " +BestTV.tvColor+ "\n색상은 " + BestTV.tvColor + " 입니다." + 
			"\n\n베스트 티비의 사이즈	: " +BestTV.tvSize+ "\n사이즈는 " +BestTV.tvSize+ " inch입니다." + 
					"\n\n베스트 티비의 전   원	: " +BestTV.tvPower+ "\n전원은 " +BestTV.tvPower+ " 상태입니다." +
				"\n\n베스트 티비의 볼   륨	: " +BestTV.tvVolume+ "\n볼륨은 " +BestTV.tvVolume+ " 입니다. 고막을 조심하세요." + 
					
					"\n\n베스트 티비의 채   널	: " +BestTV.tvChannel+ "\n현재 채널은 " +BestTV.tvChannel+ " 번 입니다. 5분 뒤, 예약 프로그램이 8번에서 시작됩니다.");
			}
		
		else
			System.out.println("TV의 전원은 꺼진 상태입니다.");
		
	}

}

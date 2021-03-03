package first_java;

public class Radio {
	
	public String RMaker = "O!";
	public String RColor = "Green";
	public String RSize = "20x30x15";
	public int RPrice = 100000;
	public int RVolume = 50;
	public int RChannel = 109;
	public boolean RPower = false;
	
	public void RVolumeUp()
	{ 
		RVolume ++;
	}
	
	public void RVolumeDown()
	{
		RVolume -= 2;
	}
	
	public void RChannelUp()
	{
		RChannel ++;
	}
	
	public void RChannelDown()
	{
		RChannel -= 15;
	}
	
	public void RPowerOnOff()
	{
		RPower = !RPower;
	}
	
			
	public static void main(String[] args) {
		Radio ORadio = new Radio();  //  new가 객체를 heap에 생성해 준다
		
		ORadio.RPowerOnOff();
		// ORadio.RPowerOnOff();
		ORadio.RVolumeDown();
		ORadio.RVolumeDown();
		ORadio.RVolumeDown();
		ORadio.RVolumeDown();
		ORadio.RChannelDown();
		ORadio.RChannelDown();
		
		if(ORadio.RPower == true)
		{
			System.out.println("라디오의 브랜드 : " +ORadio.RMaker+"\n라디오의 컬   러 : "+ORadio.RColor + "\n라디오의 사이즈 : "
					+ORadio.RSize+ "\n라디오의 가   격 : " +ORadio.RPrice+ "\n라디오의 볼   륨 : " +ORadio.RVolume+"\n라디오의 현채널 : " 
					+ORadio.RChannel+ "\n라디오의 전   원 : " +ORadio.RPower);
		}
		
		else
			System.out.println("라디오의 전원이 꺼져있습니다. 왼쪽 상단의 버튼을 눌러 전원을 켜주십시오.");
		
	}

}

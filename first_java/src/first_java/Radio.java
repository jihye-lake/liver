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
		Radio ORadio = new Radio();  //  new�� ��ü�� heap�� ������ �ش�
		
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
			System.out.println("������ �귣�� : " +ORadio.RMaker+"\n������ ��   �� : "+ORadio.RColor + "\n������ ������ : "
					+ORadio.RSize+ "\n������ ��   �� : " +ORadio.RPrice+ "\n������ ��   �� : " +ORadio.RVolume+"\n������ ��ä�� : " 
					+ORadio.RChannel+ "\n������ ��   �� : " +ORadio.RPower);
		}
		
		else
			System.out.println("������ ������ �����ֽ��ϴ�. ���� ����� ��ư�� ���� ������ ���ֽʽÿ�.");
		
	}

}

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
	
	/* Power on off �� �ϳ��� Ű�� �������?
	 * public void PowerOnOff()
	 * {
	 * 	  tvPower = !tvPower;
	 * }
	 * 
	 * �̷��� ���ָ� �� �� ������ ������, �� �� ������ ������ ������ ������ => �̰��� ���Ű��� �θ���.
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
		
		MyTVTest BestTV = new MyTVTest();  // new�� �����ڸ� ���鵵�� �����ش�.
		
		BestTV.tvPowerOn();
		BestTV.tvChannelUp();
		BestTV.tvChannelUp();
		BestTV.tvChannelUp();
		BestTV.volumDown();
		BestTV.volumDown();
		
		if(BestTV.tvPower == true)
			{
			System.out.println("����Ʈ Ƽ���� �귣��	: " +BestTV.tvCompany+ "\n�귣��� "+BestTV.tvCompany+" �Դϴ�. ������ ��ȣ�� XXX-XXXX-XXXX �Դϴ�."+
			"\n\n����Ʈ Ƽ���� ��   ��	: " +BestTV.tvColor+ "\n������ " + BestTV.tvColor + " �Դϴ�." + 
			"\n\n����Ʈ Ƽ���� ������	: " +BestTV.tvSize+ "\n������� " +BestTV.tvSize+ " inch�Դϴ�." + 
					"\n\n����Ʈ Ƽ���� ��   ��	: " +BestTV.tvPower+ "\n������ " +BestTV.tvPower+ " �����Դϴ�." +
				"\n\n����Ʈ Ƽ���� ��   ��	: " +BestTV.tvVolume+ "\n������ " +BestTV.tvVolume+ " �Դϴ�. ���� �����ϼ���." + 
					
					"\n\n����Ʈ Ƽ���� ä   ��	: " +BestTV.tvChannel+ "\n���� ä���� " +BestTV.tvChannel+ " �� �Դϴ�. 5�� ��, ���� ���α׷��� 8������ ���۵˴ϴ�.");
			}
		
		else
			System.out.println("TV�� ������ ���� �����Դϴ�.");
		
	}

}

package java_0702;

public class TimeTest_2 {
	public static void main(String[] args) {
		
		Time_2 tt_2 = new Time_2(12,45);
		Time_3 tt_3 = new Time_3(30,99);
		
		System.out.println(tt_2);
		System.out.println(tt_3);
	}

}


class Time_2 
{
	private int hour;
	private int minute;
	
	public Time_2(int hour, int minute)
	{
		setHour(hour);
		setMinute(minute);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour<0 || hour>=24)
		{
			return;  //전달되지 않았으니까 if값에 해당되면 제로값이 되는 것임
		}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute<0 || minute>=60)
		{
			return;
		}
		this.minute = minute;
	}
	
	public String toString()
	{
		return hour + "시 " + minute + "분 ";
	}
	
}

class Time_3
{
	private int second;
	private int milsecond;
	
	public Time_3(int second, int milsecond)
	{
		setSecond(second);
		setMilsecond(milsecond);
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second<0 || second>=60)
		{
			return;
		}
		this.second = second;
	}

	public int getMilsecond() {
		return milsecond;
	}

	public void setMilsecond(int milsecond) {
		if(milsecond<0 || milsecond>=100) 
		{
			return;
		}
		this.milsecond = milsecond;
	}
	
	public String toString()
	{
		return second + "초 " + milsecond + "밀리초 ";
	}
	
	
}
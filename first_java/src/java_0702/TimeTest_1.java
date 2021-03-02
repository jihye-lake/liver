package java_0702;

public class TimeTest_1 {
	public static void main(String[] args) {
		
		Time_1 tt = new Time_1(10,05,20,99);  //���ڰ� ������ if�� ���������� ������ �ٸ� �ɷ� �Ѿ.1
		System.out.println(tt);
		
		tt.setHour(13);
		
		tt.setHour(tt.getHour() + 1);
		System.out.println(tt);
		
		
	}

}

class Time_1
{
	private int hour;  //�ۿ����� �ǵ� �� ���� private �� �޼ҵ带 �̿��ؼ� ���� �� �ִ�(���� ���� ���� setter �� ���� getter)
	private int minute;		//setter �� ���������� �����ϱ� void, getter �� �����ؾ� �ϴϱ� �ڷ��� �� 
	private int second;
	private int milsecond;

	
	//���⼭ Alt+Shift+S ������ Getter Setter ��¼�� ��� ������ Select All ������ Generate Ŭ��
	//Alt + Shift + S ������ 
	
	
	//set => ���� �����Ѵٴ� �ǹ�, �Ű������� ���� �ְ� void ������
	//get => �ҷ��´ٴ� �ǹ�, �Ű������� ����, return Ÿ���� ���� ����



	public Time_1(int hour, int minute, int second, int milsecond) { //2
	/*super();
	this.hour = hour;
	this.minute = minute;  �̰� �� ���ڴ�
	this.second = second;*/
		
	setHour(hour); //=> ȣ��
	setMinute(minute);
	setSecond(second);
	setMilsecond(milsecond);  //�޼ҵ带 ���ؼ� ���� ���
	//this.hour = hour; // ���� ���� ���
	//this.minute = minute;;

	
	//���⼭ Alt Shift S ������ getter setter �����
}


	public int getSecond() {
		return second;
	}



	public void setSecond(int second) {
		if (second<0 || second>=60) {  
			
			return;  //������ �����ϸ� dafault ���� 0�� ����
		}
		this.second = second;
	}



	public int getMilsecond() {
		return milsecond;
	}



	public void setMilsecond(int milsecond) {
		
		if (milsecond<0 || milsecond>=100)
		{
			return;
		}
		this.milsecond = milsecond;
	}


	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		
		if(hour <0 || hour >=24)
		{
			return;
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




	
	
	public String toString()  //�� ���� �������� ������ ��Ű��, Ŭ����, �ּҰ�(16�� �� ���´�
	{
		return hour + "�� " + minute + "�� " + second + "�� " + milsecond + "�и���";
	}


}
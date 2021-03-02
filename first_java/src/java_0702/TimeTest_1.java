package java_0702;

public class TimeTest_1 {
	public static void main(String[] args) {
		
		Time_1 tt = new Time_1(10,05,20,99);  //숫자가 넘으면 if를 나가버리기 때문에 다른 걸로 넘어감.1
		System.out.println(tt);
		
		tt.setHour(13);
		
		tt.setHour(tt.getHour() + 1);
		System.out.println(tt);
		
		
	}

}

class Time_1
{
	private int hour;  //밖에서는 건들 수 없는 private 는 메소드를 이용해서 만질 수 있다(값을 넣을 때는 setter 뺄 때는 getter)
	private int minute;		//setter 는 리턴해주지 않으니까 void, getter 는 리턴해야 하니까 자료형 등 
	private int second;
	private int milsecond;

	
	//여기서 Alt+Shift+S 누르면 Getter Setter 어쩌고 뜬다 눌러서 Select All 누르고 Generate 클릭
	//Alt + Shift + S 누르고 
	
	
	//set => 값을 변경한다는 의미, 매개변수를 갖고 있고 void 형태임
	//get => 불러온다는 의미, 매개변수가 없고, return 타입을 갖고 있음



	public Time_1(int hour, int minute, int second, int milsecond) { //2
	/*super();
	this.hour = hour;
	this.minute = minute;  이걸 안 쓰겠다
	this.second = second;*/
		
	setHour(hour); //=> 호출
	setMinute(minute);
	setSecond(second);
	setMilsecond(milsecond);  //메소드를 통해서 전달 방법
	//this.hour = hour; // 직접 전달 방법
	//this.minute = minute;;

	
	//여기서 Alt Shift S 누르고 getter setter 만들기
}


	public int getSecond() {
		return second;
	}



	public void setSecond(int second) {
		if (second<0 || second>=60) {  
			
			return;  //조건을 만족하면 dafault 값인 0이 나옴
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




	
	
	public String toString()  //이 값을 적어주지 않으면 패키지, 클래스, 주소값(16진 이 나온다
	{
		return hour + "시 " + minute + "분 " + second + "초 " + milsecond + "밀리초";
	}


}
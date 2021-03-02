package java_0716;

interface Carcontrol {
	public void start();
	public void stop();
}

class Car implements Carcontrol {
	boolean onOff = false;
	public void start() {
		onOff = true;
	}
	
	public void stop() {
		onOff = false;
	}
	
	public void setSpeed(int speed)
	
	int setSpeed;
	int turn;
	
}

public class CarTest {
	public static void main(String[] args) {
		
		Car MyCar = new Car();
		
		MyCar.setSpeed(30);
		
		System.out.println("자동차가 출발합니다." + onOff());
		
		
		
	}
	
	

}

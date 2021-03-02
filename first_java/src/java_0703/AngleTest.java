package java_0703;

public class AngleTest {
	public static void main(String[] args) {
		
		Angle fly = new Angle();
		
		fly.run();
		System.out.println("다리는 " + fly.leg + "개\n");
		
		fly.navigation();
		System.out.println("돛은 " + fly.sail + "개\n");
		
		fly.dig();
		System.out.println("부리는 " + fly.beak + "개\n");
		
		fly.floating();
		System.out.println("날개는 " + fly.wing + "개");
	}

}

package java_0703;

public class AngleTest {
	public static void main(String[] args) {
		
		Angle fly = new Angle();
		
		fly.run();
		System.out.println("�ٸ��� " + fly.leg + "��\n");
		
		fly.navigation();
		System.out.println("���� " + fly.sail + "��\n");
		
		fly.dig();
		System.out.println("�θ��� " + fly.beak + "��\n");
		
		fly.floating();
		System.out.println("������ " + fly.wing + "��");
	}

}

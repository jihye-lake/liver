package java_0710;

class Queen {
	public Queen() {
		System.out.println("Queen �⺻ �������Դϴ�.");
	}
	
	public String toString() {  //���⸦ �ּ�ó���ϸ� �ּҰ��� ���´�.
		return "Object Ŭ������ toString() �޼ҵ� ������";
	}
}

public class Object_2 {
	public static void main(String[] args) {
		
		Queen obj = new Queen();
		
		System.out.println(obj.toString());
	}

}

package java_0716;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Frame_4 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("�߾� �迭");
		
		ff.setSize(400, 300);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		// ������ Toolkit ��ü�� ��´�.
		
		Dimension screenSize = tk.getScreenSize();
		// ȭ���� ũ�⸦ ���Ѵ�
		
		ff.setLocation(screenSize.width/2 - 200, screenSize.height/2 - 150);
		ff.setVisible(true);
	}

}

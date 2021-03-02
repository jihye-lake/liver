package java_0729;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEvent_3 extends Frame{

	
	Frame[] win = new Frame[9];
	
	String[] str = {"����","��Ȳ","�Ķ�","���","�ʷ�","��ũ","����","������1","������2"};
	Color[] color = {Color.red, Color.orange, Color.blue, Color.yellow, Color.green, Color.pink, Color.black, new Color(70,150,65), new Color(40,42,245)};
	
	public WindowEvent_3(String title) {
		super(title);
		int i;
		
		for (i = 0; i < 9; i++) {
			win[i] = new Frame();
			win[i].setBackground(color[i]);
			win[i].setLocation(i*200, i*100);  // ���� �ø��� �� �ϸ��ϰ� ������, ���̸� �� ������� ���´�.
			win[i].setSize(150, 100);
			win[i].addWindowListener(new WindowHandler());
			win[i].setVisible(true);
			
		}
	}
	
	class WindowHandler extends WindowAdapter {
		public void windowClosing(WindowEvent e) {  // windowClosing ö�ڰ� Ʋ���� ������ ���� ������, �������� ����.
			String msg = "";  // null
			Window obj = (Window) e.getSource();
			
			for (int i = 0; i < 9; i++) {
				if (obj == win[i]) {
					msg = str[i];
					win[i].dispose();  // ������ �����츦 �ݾƶ�(�ϳ��� ���� �� ����)
				}
				
			}
			System.out.println("���� ������ �� : " + msg);
		}
		
		public void windowIconified(WindowEvent e) {  // �ּ�ȭ ������ ��ü�� ����(���ø����̼� ��ü�� ������ ��)
			System.out.println(" ������ �ݱ� ");  // exit �� ������ �ٲٸ� '������ �ݱ�'�� ���� ����
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		new WindowEvent_3("Window Event Test");
	}
}

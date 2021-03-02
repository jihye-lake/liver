package white_0720;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Exit extends  WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class GameTest_1 extends Frame {
	
	public GameTest_1(String title) {
		super(title);
		setLayout(null);
		
		Panel pn = new Panel();
		pn.add(new Button("주사위 흔들기"));
		pn.setSize(150, 700);
		pn.setLocation(100,100);
		
		add(pn);
		
		Exit end = new Exit();
		addWindowListener(end);
	
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new GameTest_1("GameTest");
	}

}

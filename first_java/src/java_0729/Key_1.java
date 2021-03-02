package java_0729;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key_1 extends Frame implements KeyListener{
	
	TextArea txt_info;
	TextField txt;
	
	public Key_1(String title) {
		super(title);
		
		txt = new TextField();
		txt.addKeyListener(this);
		
		add("Center", txt_info = new TextArea());
		add("South", txt);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Key_1("Key Event Test");
	}
	
	//Ű �ϳ� ��ü�� ������ ��

	@Override
	public void keyTyped(KeyEvent e) {
		txt_info.append(e.getKeyChar() + " �� �ԷµǾ����ϴ�. \n");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		txt_info.append(e.getKeyChar() + " �� ���Ƚ��ϴ�. \n");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		txt_info.append(e.getKeyChar() + " �� ���ҽ��ϴ�. \n");
		
	}
	
	

}

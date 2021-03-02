package java_0724;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Component_1 extends Frame implements ComponentListener, ActionListener {
																			// �� ���� �޼ҵ� ȣ��	// Actiomperformed �������̵�
	
	TextArea txt;
	Button btn;
	
	public Component_1(String title) {
		super(title);
		
		btn = new Button("ȭ�鿡�� ��� �����");
		btn.addActionListener(this);
		
		add("South", btn);
		
		txt = new TextArea();
		add("Center", txt);
		addComponentListener(this);  // �����ӿ� �޾Ƴ���
		
		setSize(300, 300);
		setVisible(true);
		

	}

	public static void main(String[] args) {
		new Component_1("Component Event Test");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
//			this.hide();
			this.setVisible(false);  // ȭ�鿡�� �����(hide �� ���� ��, ȭ���� ����� ��)
			
			Thread.sleep(3000); // 3��, Thread �� ���� ���ؼ� try catch �� �̿��ؼ� ����ó�� ������
			
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		this.setVisible(true);  // ȭ�鿡 �ٽ� ����
		
	}

		
		
		@Override
		public void componentResized(ComponentEvent e) {  // ũ�Ⱑ �ٲ� �� ȣ��
			txt.append(" ������Ʈ ũ�� ���� \n");
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {  // ������Ʈ�� ������ �� �߻�
		txt.append(" @@@������Ʈ ��ġ ����@@@ \n");
		
	}

	@Override
	public void componentShown(ComponentEvent e) {  // ������Ʈ�� ȭ��� ���� �� ��Ÿ��
		txt.append(" &&&&&������Ʈ�� ȭ�鿡 ��Ÿ��&&&&& \n");
	
	}

	@Override
	public void componentHidden(ComponentEvent e) {  // ������Ʈ�� ������ �ʰ� ������ �� ��Ÿ��
		txt.append(" %%%%%%%%%%������Ʈ�� ������%%%%%%%%%%% \n");  // ������ ���� �ؽ�Ʈ�� ������ ������ ȭ�鿡 ��Ÿ���� ������ �ѷȴ� ���� ������
		
	}

}

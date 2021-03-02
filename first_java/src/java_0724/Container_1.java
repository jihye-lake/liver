package java_0724;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

public class Container_1 extends Frame implements ContainerListener, ActionListener{
	
	Panel panel;
	Button btn, btn_s1, btn_s2;
	
	public Container_1(String title) {
		super(title);
		
		panel = new Panel();
		panel.setSize(200, 200);
		add("Center", panel);
		
		panel.addContainerListener(this);
		
		btn = new Button("������Ʈ �߰�");
		btn.addActionListener(this);
		add("South", btn);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Container_1("Container Test");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Button obj = (Button) e.getSource();  //  ���ڷ� ��ư ���ϱ�
		
		if (e.getActionCommand().equals("������Ʈ �߰�")) {
			panel.add(btn_s1 = new Button("�߰��� ��ư"));
			panel.add(btn_s2 = new Button("�߰��� ��ư"));
			setVisible(true);
			btn.setLabel("������Ʈ ����");
			
		}
		
		else {
//			panel.remove(btn_s1);  // removeall �� ���ָ� �Ѳ����� ���� �� ����
//			panel.remove(btn_s2); 
			panel.removeAll();
			btn.setLabel("������Ʈ �߰�");
		}
		
	}

	@Override
	public void componentAdded(ContainerEvent e) {  // ������Ʈ�� �߰� �Ǹ� 
		
		setTitle("�����̳ʿ� ������Ʈ �߰�");  // Ÿ��Ʋ�� �ٲٶ�� ��
		
	}

	@Override
	public void componentRemoved(ContainerEvent e) {
		setTitle("�����̳ʿ� ������Ʈ ���� @@@@@@@@@@@@@@");
		
	}

}

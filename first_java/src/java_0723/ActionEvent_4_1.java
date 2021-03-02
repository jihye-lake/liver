package java_0723;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_4_1 extends Frame implements ActionListener { // ��� ��ġ�� ���Բ� �ؽ�Ʈ ����
	
	TextField txt_1, txt_2, txt_3;
	
	public ActionEvent_4_1(String str) {
		super(str);
		txt_1 = new TextField("���ڸ� �Է��ϼ���.", 20);
		txt_2 = new TextField("...", 20);
		txt_3 = new TextField("%%%", 20);
		
		txt_1.addActionListener(this);
		txt_2.addActionListener(this);
		txt_3.addActionListener(this);
		
		add("North", txt_1);
		add("Center", txt_3);
		add("South", txt_2);
		
		setSize(300, 300);
		setVisible(true);
						
	}
	
	public static void main(String[] args) {
		new ActionEvent_4_1("ActionEvent Test");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		TextField obj = (TextField) e.getSource(); // �� �� �ؽ�Ʈ �ʵ����� �Ǵ��� �� ����
		
		if (obj == txt_1) {  // 1�� TextField ���� Enter Ű�� �ƴٸ�
			txt_2.setText(txt_1.getText());  // �ؽ�Ʈ1���� ���ڸ� �����ٰ� �ؽ�Ʈ 2���� ���������� ��
			txt_3.setText(txt_1.getText());
			txt_2.setFocusable(true);  //�״����� ��Ŀ���� 2������ �ű��
			txt_1.setFocusable(false);  //1�� ��Ŀ���� �׿���
			txt_3.setFocusable(false);
			
		} else if (obj == txt_2) {
			txt_1.setText(txt_2.getText());
			txt_3.setText(txt_2.getText());
			txt_3.setFocusable(true);  //  true ���� ���� �;���. �߰��� ���� �� ���� ���� �������.
			txt_1.setFocusable(false);
			txt_2.setFocusable(false);
			
		} else {   // 3�� �̶��
			txt_1.setText(txt_3.getText());
			txt_2.setText(txt_3.getText());
			txt_1.setFocusable(true);
			txt_2.setFocusable(false);
			txt_3.setFocusable(false);
	}			
		
	}

	
}
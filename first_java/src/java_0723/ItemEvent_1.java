package java_0723;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_1 extends Frame implements ItemListener{
	
	Checkbox ckb1, ckb2, ckb3, ckb4;
	TextArea txt_info;
	
	public ItemEvent_1(String title) {
		super(title);
		
		Label lbl = new Label(" ����� �����ϴ� ������? ");
		
		txt_info = new TextArea();
		Panel panel = new Panel();
		
		ckb1 = new Checkbox("��");
		ckb2 = new Checkbox("����");
		ckb3 = new Checkbox("����");
		ckb4 = new Checkbox("�ܿ�");
		
		 ckb1.addItemListener(this);
		 ckb2.addItemListener(this);  // �̺�Ʈ �޾��ֱ�
		 ckb3.addItemListener(this);
		 ckb4.addItemListener(this);
		 
		 panel.add(ckb1);
		 panel.add(ckb2);
		 panel.add(ckb3);
		 panel.add(ckb4);
		 
		 add("North", lbl);
		 add("Center", txt_info);
		 add("South", panel);
		 
		 setSize(300, 300);
		 setVisible(true);
	}
	
	public static void main(String[] args) {
		new ItemEvent_1("Item Event Test");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
//		txt_info.setText("");  // ���Ӱ� ���ٴ� ���̹Ƿ�, "~�� �����Ͻô±���. " �� ��� �����ؼ� ����ϰ� ������ �̰� ���ֱ�
		
		if (ckb1.getState()) {  // getState => üũ�� �Ǿ��ִ��� �� �Ǿ� �ִ� �� �Ǻ��ϴ� ���� ��(boolean ���� ���� => true, false)
			
			txt_info.append(" ���� �����Ͻô±���. \n");  // append "�����̴�, ÷���ϴ�"�� ��
			
		} if (ckb2.getState()) {
			
			txt_info.append(" ������ �����Ͻô±���. \n");
			
		} if (ckb3.getState()) {
			
			txt_info.append(" ������ �����Ͻô±���. \n");
			
		} if (ckb4.getState()) {
			
			txt_info.append(" �ܿ��� �����Ͻô±���. \n");
			
		}
		
	}
	

}

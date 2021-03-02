package java_0723;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_1_1 extends Frame implements ItemListener{  // ���� üũ�ڽ�
	
	Checkbox ckb1, ckb2, ckb3, ckb4;
	CheckboxGroup cbg;
	TextArea txt_info;
	
	public ItemEvent_1_1(String title) {
		super(title);
		
		Label lbl = new Label(" ����� �����ϴ� ������? ");
		
		txt_info = new TextArea();
		Panel panel = new Panel();
		
		cbg = new CheckboxGroup();
		
		ckb1 = new Checkbox("��", cbg, false);
		ckb2 = new Checkbox("����", cbg, false);
		ckb3 = new Checkbox("����", cbg, false);
		ckb4 = new Checkbox("�ܿ�", cbg, true);
		
		 ckb1.addItemListener(this);
		 ckb2.addItemListener(this);
		 ckb3.addItemListener(this);  // �̺�Ʈ �޾��ֱ�
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
		new ItemEvent_1_1("Item Event Test");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
//		txt_info.setText("");  // ���Ӱ� ���ٴ� ���̹Ƿ�, "~�� �����Ͻô±���. " �� ��� �����ؼ� ����ϰ� ������ �̰� ���ֱ�
		
		if (ckb1.getState()) {
			
			txt_info.append(" ���� �����Ͻô±���. \n");
			
		} if (ckb2.getState()) {
			
			txt_info.append(" ������ �����Ͻô±���. \n");
			
		} if (ckb3.getState()) {
			
			txt_info.append(" ������ �����Ͻô±���. \n");
			
		} if (ckb4.getState()) {
			
			txt_info.append(" �ܿ��� �����Ͻô±���. \n");
			
		}
		
	}
	

}
package java_0723;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_3 extends Frame implements ItemListener {
	
	Choice lst_1, lst_2;
	Label lbl_info;
	
	String[] ��� = {"�ƽþ�","����","������ī"};
	String[][] ���� = {{"�ѱ�","�߱�","�ʸ���"}, {"������","����","������"}, {"����Ʈ","���","�찣��"}};
	
	public ItemEvent_3(String title) {
		super(title);
		
		Label lbl = new Label("����� ���� �����Ͻÿ�.");
		Panel panel = new Panel();
		
		lbl_info = new Label();
		lst_1 = new Choice();
		lst_2 = new Choice();
		
		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		
		for (int i = 0; i < ���.length; i++) {
			
			lst_1.add(���[i]);
		}
		
		lst_2.add("                ");
		
		panel.add(lst_1);
		panel.add(lst_2);
		
		add("North", lbl);
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(250, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ItemEvent_3("Item Event Test");
	}
	

	@Override
	public void itemStateChanged(ItemEvent e) {  // Choice ���� �̺�Ʈ�� �߻��ϸ� �� �ڿ� �Ͼ�� ó������
		
		Choice obj = (Choice) e.getSource();
		String str = "������ ����� ���� : ";
		
		if (obj == lst_1) {
			
			lst_2.removeAll();
			int j = lst_1.getSelectedIndex();
			
			for (int i = 0; i < ����[j].length; i++) {
				
				lst_2.add(����[j][i]);
				
			}
		}else {
				str += lst_1.getSelectedItem();
				str += "-" + lst_2.getSelectedItem();
				
				lbl_info.setText(str);
			}
			
		}
	}

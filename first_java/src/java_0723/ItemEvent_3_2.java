package java_0723;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_3_2 extends Frame implements ItemListener {
	
	Choice lst_1, lst_2, lst_3;
	Label lbl_info;
	int j = 0;  // ItemEvent_3 ���� �ٸ��� ���������� ����
	
	String[] ��� = {"�ƽþ�","����","������ī"};
	String[][] ���� = {{"�ѱ�","�߱�","�ʸ���"}, {"������","����","������"}, {"����Ʈ","���","�찣��"}};
	String[][] ���� = {{"����","����¡","���Ҷ�"}, {"����","����","�ĸ�"}, {"ī�̷�","����ں�","į�ȶ�"}};
	
	public ItemEvent_3_2(String title) {
		super(title);
		
		Label lbl = new Label("����� ����� ������ �����Ͻÿ�.");
		Panel panel = new Panel();
		
		lbl_info = new Label();  // �� �Ʒ��� �ߴ� ���ڼ���
		lst_1 = new Choice();
		lst_2 = new Choice();
		lst_3 = new Choice();
		
		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		lst_3.addItemListener(this);
		
		for (int i = 0; i < ���.length; i++) {
			
			lst_1.add(���[i]);
		}
		
		lst_2.add("                ");  // ������� ����
		lst_3.add("                ");
		
		panel.add(lst_1);
		panel.add(lst_2);
		panel.add(lst_3);
		
		add("North", lbl);  // ���̺�
		add("Center", panel);  //�г�
		add("South", lbl_info);  //���̺� ����
		
		setSize(350, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ItemEvent_3_2("Item Event Test");
	}
	

	@Override
	public void itemStateChanged(ItemEvent e) {  // Choice ���� �̺�Ʈ�� �߻��ϸ� �� �ڿ� �Ͼ�� ó������
		
		Choice obj = (Choice) e.getSource();
		String str = "������ ����� ���� : ";
		
		if (obj == lst_1) {
			
			lst_2.removeAll();  // 1�� �������� �� 2�� �͵��� �� ������� ������ �ȴ�
			lst_3.removeAll();
			j = lst_1.getSelectedIndex();
			
			for (int i = 0; i < ����[j].length; i++) {
				
				lst_2.add(����[j][i]);  // j ����, i ����
				
			}
			
//			for (int i = 0; i < ����[j].length; i++) {
//				
//				lst_3.add(����[j][i]);  //  ������ j�� ������ j�� ����(����� ����)
//				
//			}
		
			
		}else if (obj == lst_2) {
			
			lst_3.removeAll();
			int k = lst_2.getSelectedIndex();
//			lst_3.add(����[j][k]);
			for (int i = 0; i < ����[j].length; i++) {
				
				lst_3.add(����[j][i]);
				
			}
			
		} else {
				str += lst_1.getSelectedItem();
				str += "-" + lst_2.getSelectedItem();  //  �ϴܿ� ������ī - ��� �̷������� ���´�
				str += "-" + lst_3.getSelectedItem();
				
				lbl_info.setText(str);
			}
			
		}
	}
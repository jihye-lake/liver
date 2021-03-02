package java_0724;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_4_1 extends Frame implements ItemListener {
	
	List lst_1, lst_2, lst_3;
	Label lbl_info;
	int j = 0;
	
	String[] continent = {"�ƽþ�","����","������ī"};
	String[][] country = {{"�ѱ�","�ʸ���","�ε�"},{"����","��Ż����","������"},{"����","���","�����"}};
	String[][] capital = {{"����","���Ҷ�","������"},{"������","�θ�","�ĸ�"},{"���긣��","����ں�","���Ʈ"}};
	
	public ItemEvent_4_1(String title) {
		super(title);
		
		Label lbl = new Label("����� ���� ����");
		Panel panel = new Panel();
		
		lbl_info = new Label();
		lst_1 = new List(2, false);
		lst_2 = new List(3, false);
		lst_3 = new List(4, false);
		
		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		lst_3.addItemListener(this);
		
		for (int i = 0; i < continent.length; i++) {
			lst_1.add(continent[i]);
		}
		
		lst_2.add("                ");
		lst_3.add("                ");
		
		panel.add(lst_1);
		panel.add(lst_2);
		panel.add(lst_3);
		
		add("North", lbl);
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(600, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ItemEvent_4_1("List Event Test");
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {  // �̺�Ʈ�� �߻��ϰ� �ؾߵ� �ϵ��� ���.
		
		List obj = (List) e.getSource();
		String str = "������ ����� ���� : ";
		
		if (obj == lst_1) {
			
			lst_2.removeAll();  // 1�� �������� �� 2�� �͵��� �� ������� ������ �ȴ�
			lst_3.removeAll();
			j = lst_1.getSelectedIndex();
			
			for (int i = 0; i < country[j].length; i++) {
				
				lst_2.add(country[j][i]);  // j ����, i ����
				
			}
			
		
			
		}else if (obj == lst_2) {
			
			lst_3.removeAll();
			for (int i = 0; i < capital[j].length; i++) {
				
				lst_3.add(capital[j][i]);
				
			}
		}
	
		else {
			str += lst_1.getSelectedItem();
			str += "-" + lst_2.getSelectedItem();
			str += "-" + lst_3.getSelectedItem();
			
			lbl_info.setText(str);
		}
		
	
	}	

}
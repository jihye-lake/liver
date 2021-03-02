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
	
	String[] 대륙 = {"아시아","유럽","아프리카"};
	String[][] 나라 = {{"한국","중국","필리핀"}, {"스위스","영국","프랑스"}, {"이집트","콩고","우간다"}};
	
	public ItemEvent_3(String title) {
		super(title);
		
		Label lbl = new Label("대륙과 나라를 선택하시오.");
		Panel panel = new Panel();
		
		lbl_info = new Label();
		lst_1 = new Choice();
		lst_2 = new Choice();
		
		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		
		for (int i = 0; i < 대륙.length; i++) {
			
			lst_1.add(대륙[i]);
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
	public void itemStateChanged(ItemEvent e) {  // Choice 에서 이벤트가 발생하면 그 뒤에 일어나는 처리내용
		
		Choice obj = (Choice) e.getSource();
		String str = "선택한 대륙과 나라 : ";
		
		if (obj == lst_1) {
			
			lst_2.removeAll();
			int j = lst_1.getSelectedIndex();
			
			for (int i = 0; i < 나라[j].length; i++) {
				
				lst_2.add(나라[j][i]);
				
			}
		}else {
				str += lst_1.getSelectedItem();
				str += "-" + lst_2.getSelectedItem();
				
				lbl_info.setText(str);
			}
			
		}
	}

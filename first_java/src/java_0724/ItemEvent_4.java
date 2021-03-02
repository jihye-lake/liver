package java_0724;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_4 extends Frame implements ItemListener {
	
	List lst_1, lst_2;
	Label lbl_info;
	
	String[] continent = {"아시아","유럽","아프리카"};
	String[][] country = {{"한국","필리핀","인도"},{"독일","이탈리아","프랑스"},{"가봉","콩고","모로코"}};
	
	public ItemEvent_4(String title) {
		super(title);
		
		Label lbl = new Label("대륙과 나라를 선택");
		Panel panel = new Panel();
		
		lbl_info = new Label();
		lst_1 = new List(2, false);
		lst_2 = new List(3, false);
		
		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		
		for (int i = 0; i < continent.length; i++) {
			lst_1.add(continent[i]);
		}
		
		lst_2.add("                ");
		
		panel.add(lst_1);
		panel.add(lst_2);
		
		add("North", lbl);
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ItemEvent_4("List Event Test");
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {  // 이벤트가 발생하고 해야될 일들을 기술.
		
		List obj = (List) e.getSource();
		String str = "선택한 대륙과 나라 : ";
		
		if (obj == lst_1) {
			lst_2.removeAll();
			int j = lst_1.getSelectedIndex();
			for (int i = 0; i < country[j].length; i++) {
				lst_2.add(country[j][i]);				
			}
		} else {
			str += lst_1.getSelectedItem();
			str += "-" + lst_2.getSelectedItem();
			System.out.println();
			
			lbl_info.setText(str);
		}
		
	}
	
	

}

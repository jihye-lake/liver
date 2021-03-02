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
	
	String[] continent = {"아시아","유럽","아프리카"};
	String[][] country = {{"한국","필리핀","인도"},{"독일","이탈리아","프랑스"},{"가봉","콩고","모로코"}};
	String[][] capital = {{"서울","마닐라","뉴델리"},{"베를린","로마","파리"},{"리브르빌","브라자빌","라바트"}};
	
	public ItemEvent_4_1(String title) {
		super(title);
		
		Label lbl = new Label("대륙과 나라를 선택");
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
	public void itemStateChanged(ItemEvent e) {  // 이벤트가 발생하고 해야될 일들을 기술.
		
		List obj = (List) e.getSource();
		String str = "선택한 대륙과 나라 : ";
		
		if (obj == lst_1) {
			
			lst_2.removeAll();  // 1을 선택했을 때 2의 것들은 다 사라지고 리셋이 된다
			lst_3.removeAll();
			j = lst_1.getSelectedIndex();
			
			for (int i = 0; i < country[j].length; i++) {
				
				lst_2.add(country[j][i]);  // j 국가, i 나라
				
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
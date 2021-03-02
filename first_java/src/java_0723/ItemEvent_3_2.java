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
	int j = 0;  // ItemEvent_3 과는 다르게 전역변수로 줬음
	
	String[] 대륙 = {"아시아","유럽","아프리카"};
	String[][] 나라 = {{"한국","중국","필리핀"}, {"스위스","영국","프랑스"}, {"이집트","콩고","우간다"}};
	String[][] 수도 = {{"서울","베이징","마닐라"}, {"베른","런던","파리"}, {"카이로","브라자빌","캄팔라"}};
	
	public ItemEvent_3_2(String title) {
		super(title);
		
		Label lbl = new Label("대륙과 나라와 수도를 선택하시오.");
		Panel panel = new Panel();
		
		lbl_info = new Label();  // 맨 아래에 뜨는 글자설명
		lst_1 = new Choice();
		lst_2 = new Choice();
		lst_3 = new Choice();
		
		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		lst_3.addItemListener(this);
		
		for (int i = 0; i < 대륙.length; i++) {
			
			lst_1.add(대륙[i]);
		}
		
		lst_2.add("                ");  // 공백띄우기 간격
		lst_3.add("                ");
		
		panel.add(lst_1);
		panel.add(lst_2);
		panel.add(lst_3);
		
		add("North", lbl);  // 레이블
		add("Center", panel);  //패널
		add("South", lbl_info);  //레이블 붙임
		
		setSize(350, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ItemEvent_3_2("Item Event Test");
	}
	

	@Override
	public void itemStateChanged(ItemEvent e) {  // Choice 에서 이벤트가 발생하면 그 뒤에 일어나는 처리내용
		
		Choice obj = (Choice) e.getSource();
		String str = "선택한 대륙과 나라 : ";
		
		if (obj == lst_1) {
			
			lst_2.removeAll();  // 1을 선택했을 때 2의 것들은 다 사라지고 리셋이 된다
			lst_3.removeAll();
			j = lst_1.getSelectedIndex();
			
			for (int i = 0; i < 나라[j].length; i++) {
				
				lst_2.add(나라[j][i]);  // j 국가, i 나라
				
			}
			
//			for (int i = 0; i < 수도[j].length; i++) {
//				
//				lst_3.add(수도[j][i]);  //  나라의 j와 수도의 j가 같음(행렬이 같다)
//				
//			}
		
			
		}else if (obj == lst_2) {
			
			lst_3.removeAll();
			int k = lst_2.getSelectedIndex();
//			lst_3.add(수도[j][k]);
			for (int i = 0; i < 수도[j].length; i++) {
				
				lst_3.add(수도[j][i]);
				
			}
			
		} else {
				str += lst_1.getSelectedItem();
				str += "-" + lst_2.getSelectedItem();  //  하단에 아프리카 - 콩고 이런식으로 나온다
				str += "-" + lst_3.getSelectedItem();
				
				lbl_info.setText(str);
			}
			
		}
	}
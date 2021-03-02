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
		
		Label lbl = new Label(" 당신이 좋아하는 계절은? ");
		
		txt_info = new TextArea();
		Panel panel = new Panel();
		
		ckb1 = new Checkbox("봄");
		ckb2 = new Checkbox("여름");
		ckb3 = new Checkbox("가을");
		ckb4 = new Checkbox("겨울");
		
		 ckb1.addItemListener(this);
		 ckb2.addItemListener(this);  // 이벤트 달아주기
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
		
//		txt_info.setText("");  // 새롭게 쓴다는 뜻이므로, "~을 좋아하시는군요. " 를 계속 누적해서 기록하고 싶으면 이걸 없애기
		
		if (ckb1.getState()) {  // getState => 체크가 되어있는지 안 되어 있는 지 판별하는 것이 됨(boolean 값이 리턴 => true, false)
			
			txt_info.append(" 봄을 좋아하시는군요. \n");  // append "덧붙이다, 첨부하다"는 뜻
			
		} if (ckb2.getState()) {
			
			txt_info.append(" 여름을 좋아하시는군요. \n");
			
		} if (ckb3.getState()) {
			
			txt_info.append(" 가을을 좋아하시는군요. \n");
			
		} if (ckb4.getState()) {
			
			txt_info.append(" 겨울을 좋아하시는군요. \n");
			
		}
		
	}
	

}

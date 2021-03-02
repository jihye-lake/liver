package java_0724;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_5 extends Frame implements ItemListener {
	
	Checkbox[] os = new Checkbox[5];
	Checkbox[] cpu = new Checkbox[3];
	Checkbox[] flw = new Checkbox[3];
	
	CheckboxGroup cbg;
	CheckboxGroup cbg1;
	
	Label lbl_info;
	
	String[] os_str = {"윈도우98","리눅스","윈도우10","MS_DOS","윈도우XP"};
	String[] cpu_str = {"AMD","인텔","사이릭스"};
	String[] flw_str = {"자이언트하귀드","드래곤플라워","수선화"};
	
	int i;
	
	public ItemEvent_5(String title) {
		super(title);
		
		Label lbl = new Label("설치된 운영체제와 CPU 를 선택하시오.");
		lbl_info = new Label();
		// *디폴트값이 flowlayout 이기 때문에 grid 를 안 넣어도 자동으로 개행이 됨*
		
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		Panel panel3 = new Panel();  // 2중으로 담기 위해서 세 개를 만듦(1, 2 패널을 다시 패널에 담아서 센터에 넣음)
		Panel panel4 = new Panel();
		
		for (int i = 0; i < os.length; i++) {
			
			os[i] = new Checkbox(os_str[i]);
			panel1.add(os[i]);  // OS 종류가 담긴다
			os[i].addItemListener(this);  // ItemEvent 를 담아준다
		}
		
		cbg = new CheckboxGroup();
		
		for (int i = 0; i < cpu.length; i++) {
			
			cpu[i] = new Checkbox(cpu_str[i], cbg, (i == 1)? true : false);  // i과 1과 같다면 true, 다르면 false (index 는 0부터 시작하니까)
			panel2.add(cpu[i]);
			cpu[i].addItemListener(this);
			
		}
		
		cbg1 = new CheckboxGroup();
		
		for (int i = 0; i < flw.length; i++) {
			
			flw[i] = new Checkbox(flw_str[i], cbg1, (i == 2)? true : false);  // i과 1과 같다면 true, 다르면 false (index 는 0부터 시작하니까)
			panel4.add(flw[i]);
			flw[i].addItemListener(this);
			
		}
		
		panel3.add(panel1);
		panel3.add(panel2);
		panel3.add(panel4);
		
		add("North", lbl);
		add("Center", panel3);
		add("South", lbl_info); // 정보가 나타날 위치
		
		setSize(400, 250);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ItemEvent_5("CheckboxEvent Test");
	}
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		String msg = "당신의 컴퓨터 OS 는 : ";
		for (int i = 0; i < os.length; i++) {
			if (os[i].getState()) {  // 체크되어 있으면 true
				msg += "[" +os[i].getLabel()+ "]";  // 그 Text 를 써라
				
			}
			
		}
		
		for (int i = 0; i < cpu.length; i++) {
			if (cpu[i].getState()) {
				msg += ", CPU : " +cpu[i].getLabel()+ " 입니다.";
				
			}
			
		}
		
		msg += " 당신이 좋아하는 꽃은 : ";  // *중요*
		for (int i = 0; i < flw.length; i++) {
			if (flw[i].getState()) {
				msg += ", 지혜 바보 : " + flw[i].getLabel() + " 입니다.";
				
			}
			
		}
		
		lbl_info.setText(msg);
	}

}

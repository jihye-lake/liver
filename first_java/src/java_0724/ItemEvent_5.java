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
	
	String[] os_str = {"������98","������","������10","MS_DOS","������XP"};
	String[] cpu_str = {"AMD","����","���̸���"};
	String[] flw_str = {"���̾�Ʈ�ϱ͵�","�巡���ö��","����ȭ"};
	
	int i;
	
	public ItemEvent_5(String title) {
		super(title);
		
		Label lbl = new Label("��ġ�� �ü���� CPU �� �����Ͻÿ�.");
		lbl_info = new Label();
		// *����Ʈ���� flowlayout �̱� ������ grid �� �� �־ �ڵ����� ������ ��*
		
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		Panel panel3 = new Panel();  // 2������ ��� ���ؼ� �� ���� ����(1, 2 �г��� �ٽ� �гο� ��Ƽ� ���Ϳ� ����)
		Panel panel4 = new Panel();
		
		for (int i = 0; i < os.length; i++) {
			
			os[i] = new Checkbox(os_str[i]);
			panel1.add(os[i]);  // OS ������ ����
			os[i].addItemListener(this);  // ItemEvent �� ����ش�
		}
		
		cbg = new CheckboxGroup();
		
		for (int i = 0; i < cpu.length; i++) {
			
			cpu[i] = new Checkbox(cpu_str[i], cbg, (i == 1)? true : false);  // i�� 1�� ���ٸ� true, �ٸ��� false (index �� 0���� �����ϴϱ�)
			panel2.add(cpu[i]);
			cpu[i].addItemListener(this);
			
		}
		
		cbg1 = new CheckboxGroup();
		
		for (int i = 0; i < flw.length; i++) {
			
			flw[i] = new Checkbox(flw_str[i], cbg1, (i == 2)? true : false);  // i�� 1�� ���ٸ� true, �ٸ��� false (index �� 0���� �����ϴϱ�)
			panel4.add(flw[i]);
			flw[i].addItemListener(this);
			
		}
		
		panel3.add(panel1);
		panel3.add(panel2);
		panel3.add(panel4);
		
		add("North", lbl);
		add("Center", panel3);
		add("South", lbl_info); // ������ ��Ÿ�� ��ġ
		
		setSize(400, 250);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ItemEvent_5("CheckboxEvent Test");
	}
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		String msg = "����� ��ǻ�� OS �� : ";
		for (int i = 0; i < os.length; i++) {
			if (os[i].getState()) {  // üũ�Ǿ� ������ true
				msg += "[" +os[i].getLabel()+ "]";  // �� Text �� ���
				
			}
			
		}
		
		for (int i = 0; i < cpu.length; i++) {
			if (cpu[i].getState()) {
				msg += ", CPU : " +cpu[i].getLabel()+ " �Դϴ�.";
				
			}
			
		}
		
		msg += " ����� �����ϴ� ���� : ";  // *�߿�*
		for (int i = 0; i < flw.length; i++) {
			if (flw[i].getState()) {
				msg += ", ���� �ٺ� : " + flw[i].getLabel() + " �Դϴ�.";
				
			}
			
		}
		
		lbl_info.setText(msg);
	}

}

package java_0719;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class GridLayout_2 extends Frame {
	public GridLayout_2(String title) {
		super(title);
		
		setLayout(new GridLayout(3,2));
		
		List list = new List();
		Panel pp = new Panel();
		Choice ch = new Choice();
		
		pp.setLayout(new FlowLayout());
		
		add(new Button("Button1"));
		list.add("Ʈ������");
		list.add("dfpfpfd");
		list.add("������");
		list.add("��������");
		ch.add("�ʷѷѷ�");
		add(new TextArea("�Ƹ��ٿ� ���", 5, 15));
		add(new TextField("TextField"));
		pp.add(new Button(" ��ư�Դϴ�1 "));
		pp.add(new Button(" ��ư�Դϴ�2 "));
		pp.add(new Button(" ��ư�Դϴ�3 "));
		
		add(pp);
		add(ch);
		add(list);
		
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayout_2("GridLayout Test");
	}

}

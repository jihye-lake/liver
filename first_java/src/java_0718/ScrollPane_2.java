 package java_0718;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScrollPane_2 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("ScrollPane Test");
		
		ff.setSize(300, 200);
		
		ScrollPane spp = new ScrollPane();  // ������Ʈ�� ��ũ�� ����� �����Ѵ�.
															// �� �гο� �� ��ũ�Ѹ� �����Ѵ�.
		Panel pp = new Panel();
		
		pp.setBackground(new Color(20,90,30));
		pp.add(new Button("ù ��°"));
		pp.add(new Button("�� ��°"));
		pp.add(new Button("�� ��°"));
		pp.add(new Button("�� ��°"));
		
		spp.add(pp);
		ff.add("Center",spp);
		
		ff.setVisible(true);
		
		
		
	}

}

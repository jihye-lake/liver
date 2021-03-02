package java_0805;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JApplet_1 extends JApplet{  // JApplet �̹Ƿ� main �� ����
	
	String[] fieldname = {"<html><font color = cyan size = 5>�й�</html></font>", 
								"<html><font color = red size = 5>����</html></font>", 
								"<html><font color = yellow size = 5>����</html></font>", 
								"<html><font color = blue size = 5>����</html></font>"};
	
	String[][] data = {{"20190801", "78", "89", "68"}, 
							 {"20190802", "35", "66", "93"}, 
							 {"20190803", "56", "23", "88"}, 
							 {"20190804", "89", "85", "67"}, 
							 {"20190805", "69", "70", "94"}, 
							 {"20190806", "90", "57", "54"}};
	
	String html = "<HTML><TABLE><TR>"  // TR /TR �� �� ���� ��Ÿ��
			+"<TD><font color=cyan size=5> �й� </font></TD>"
			+"<TD><font color=red size=5> ���� </font></TD>"
			+"<TD><font color=yellow size=5> ���� </font></TD>"
			+"<TD><font color=blue size=5> ���� </font></TD>"
			+"</TR><TR>"
			+"<TD>2001300912</TD>"
			+"<TD>67</TD><TD>90</TD><TD>80</TD><TR>"
			+"<TR><TD><2001201232></TD>"
			+"<TD>95</TD><TD>80</TD><TD>70</TD></TR>"
			+"<TR><TD colspan=4 align=center><font size=10>�������� ����</TD></TR>"
			// TR colspan=4 align=center �̰� �����ΰ�? ��(��) ����(����Ʈ ����) => https://2018-start.tistory.com/21
			+"<TR><TD colspan=4 align=center><img src=" + new File("images\\b1.gif").toURI() + " width=100 height=60></img></TD></TR>"
																									//src ����								���� ���� �߿�
			+"</TABLE></HTML>"; // HTML /HTML , TABLE /TABLE ���� �Ͱ� �ݴ� �͵�
			
	public void init() {
		getContentPane().setLayout(new BorderLayout());
		
		JTable table = new JTable(data, fieldname);
		JScrollPane sp = new JScrollPane(table);
		table.setToolTipText(html);  // table �� �����ϳ� // ToolTipText �̱� ������ �̹����� ���� �ʴ� �� ����
		
		ImageIcon img = new ImageIcon(getImage(getDocumentBase(), "popcorn.png"));
		JButton btn = new JButton("�̹���", img);
		btn.setToolTipText("<html><font size=6 color=pink> �ڹ� �ΰ� </font></html>");  // Button �� �����ϳ�
		
		getContentPane().add(btn, "North");
		getContentPane().add(sp, "Center");
		
		setSize(350, 250);
		
	}

}

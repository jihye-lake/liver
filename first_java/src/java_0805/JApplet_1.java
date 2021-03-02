package java_0805;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JApplet_1 extends JApplet{  // JApplet 이므로 main 이 없음
	
	String[] fieldname = {"<html><font color = cyan size = 5>학번</html></font>", 
								"<html><font color = red size = 5>국어</html></font>", 
								"<html><font color = yellow size = 5>영어</html></font>", 
								"<html><font color = blue size = 5>수학</html></font>"};
	
	String[][] data = {{"20190801", "78", "89", "68"}, 
							 {"20190802", "35", "66", "93"}, 
							 {"20190803", "56", "23", "88"}, 
							 {"20190804", "89", "85", "67"}, 
							 {"20190805", "69", "70", "94"}, 
							 {"20190806", "90", "57", "54"}};
	
	String html = "<HTML><TABLE><TR>"  // TR /TR 은 한 행을 나타냄
			+"<TD><font color=cyan size=5> 학번 </font></TD>"
			+"<TD><font color=red size=5> 국어 </font></TD>"
			+"<TD><font color=yellow size=5> 영어 </font></TD>"
			+"<TD><font color=blue size=5> 수학 </font></TD>"
			+"</TR><TR>"
			+"<TD>2001300912</TD>"
			+"<TD>67</TD><TD>90</TD><TD>80</TD><TR>"
			+"<TR><TD><2001201232></TD>"
			+"<TD>95</TD><TD>80</TD><TD>70</TD></TR>"
			+"<TR><TD colspan=4 align=center><font size=10>최지혜가 만듦</TD></TR>"
			// TR colspan=4 align=center 이건 무엇인가? 셀(행) 병합(사이트 참고) => https://2018-start.tistory.com/21
			+"<TR><TD colspan=4 align=center><img src=" + new File("images\\b1.gif").toURI() + " width=100 height=60></img></TD></TR>"
																									//src 빼고								여기 공백 중요
			+"</TABLE></HTML>"; // HTML /HTML , TABLE /TABLE 여는 것과 닫는 것들
			
	public void init() {
		getContentPane().setLayout(new BorderLayout());
		
		JTable table = new JTable(data, fieldname);
		JScrollPane sp = new JScrollPane(table);
		table.setToolTipText(html);  // table 에 툴팁하나 // ToolTipText 이기 때문에 이미지가 들어가지 않는 것 같음
		
		ImageIcon img = new ImageIcon(getImage(getDocumentBase(), "popcorn.png"));
		JButton btn = new JButton("이미지", img);
		btn.setToolTipText("<html><font size=6 color=pink> 자바 로고 </font></html>");  // Button 에 툴팁하나
		
		getContentPane().add(btn, "North");
		getContentPane().add(sp, "Center");
		
		setSize(350, 250);
		
	}

}

package java_0805;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable_1 extends JFrame {
	
	JTable table;
	
	String[] fieldName = {"<html><font color=red size=5>학번</html></font>", 
									"<html><font color=green size=5>국어</html></font>", 
									"<html><font color=green size=5>영어</html></font>", 
									"<html><font color=green size=5>수학</html></font>",
									"<html><font color=green size=5>과학</html></font>"};
	
	String[][] data = {{"20190801", "78", "89", "68", "56"}, 
							  {"20190802", "35", "66", "93", "87"}, 
							  {"20190803", "56", "23", "88", "52"}, 
							  {"20190804", "89", "85", "67", "92"}, 
							  {"20190805", "69", "70", "94", "93"}, 
							  {"20190806", "90", "57", "54", "75"}};
	
	public JTable_1(String title) {
		super(title);
		
		table = new JTable(data,fieldName);
		JScrollPane spp =  new JScrollPane(table);
		
		getContentPane().add(spp, "Center");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(350, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JTable_1("JTable Test");
	}

}

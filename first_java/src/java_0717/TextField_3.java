package java_0717;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextField_3 {
	
	public static void main(String[] args) {
	
		Frame  ff = new Frame("Login");
		
		ff.setLocation(900, 200);
		ff.setSize(400, 80);
		ff.setLayout(new FlowLayout());
		
		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		
		pwd.setEchoChar('*');
		
		lid.setBackground(new Color(207,144,255));
		id.setBackground(new Color(255,246,18));
		
		lpwd.setBackground(new Color(0,51,153));
		lpwd.setForeground(new Color(255,255,255));
		pwd.setBackground(new Color((int)(Math.random()*80), (int)((Math.random()*(255-200))+200), (int)((Math.random()*(255-200))+200)));		
		
		ff.add(lid);
		ff.add(id);
		ff.add(lpwd);
		ff.add(pwd);
		
		ff.setVisible(true);
		
		
	}

}

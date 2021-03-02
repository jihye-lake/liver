package java_0729;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Clock extends Frame implements ActionListener {
	
	Analog analog;
	Button btn;
	//»ý¼ºÀÚ
	public Clock(String title) {
		super(title);
		// ¾Æ³¯·Î±× ÇÁ·¹ÀÓ ºÙÀÌ±â
		analog = new Analog();
		analog.setSize(300, 330);
		btn = new Button("½Ã°è Á¾·á");
		btn.addActionListener(this);
		add("Center", analog);
		add("South", btn);
		setSize(330, 380);
		setVisible(true);
	}
	//½º·¹µå ½ÃÀÛ
	public void Start() {
		new Thread(analog).start();
	}
	//ÇÁ·Î±×·¥ °­Á¦ Á¾·á
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Clock clock = new Clock("¾Æ³¯·Î±× ½Ã°è");
		clock.Start();
	}

}

//»ç°¢Çü ¿µ¿ªÀ» ÀúÀåÇÏ´Â Å¬·¡½º

class RECT {
	int left;  // ¿ÞÂÊ X ÁÂÇ¥
	int top;  // À§ÂÊ Y ÁÂÇ¥
	int right; // ¿À¸¥ÂÊ X ÁÂÇ¥
	int bottom;  // ¿ÞÂÊ YÁÂÇ¥
	public RECT(int left, int top, int right, int bottom) {
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
	}
	
	// ¼öÆò ¹æÇâ, ¼öÁ÷ ¹æÇâ º¸Á¤
	public void offSet(int horizontal_offset, int vertical_offset) {
		left += horizontal_offset;
		right += horizontal_offset;
		top += vertical_offset;
		bottom += vertical_offset;
		
	}
}

//¾Æ³¯·Î±× Å¬·¡½º

class Analog extends Canvas implements Runnable {
	RECT rect;
	static int h; // ½Ã°£
	static int m; // ºÐ
	static int s; // ÃÊ
	static int center_x , center_y; // ½Ã°è ¹Ù´Ã Áß½É ÁÂÇ¥
	
	//»ý¼ºÀÚ
	public Analog() {
		rect = new RECT(10, 10, 290, 290);
		center_x = (rect.right + rect.left) / 2; // ½Ã°è Áß½É x ÁÂÇ¥
		center_y = (rect.bottom + rect.top) / 2; // ½Ã°è Áß½É y ÁÂÇ¥
		
	}
	
	// ÇöÀç ½Ã°£ ¾Ë¾Æ³»´Â ¸Þ¼­µå
	static void CurruntTime() {
		Date currentDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd hh:ss yyyy", Locale.getDefault());
		
		
   // ÃÊ ¾Ë¾Æ³»±â
	formatter.applyPattern("s");
	try {
		s = Integer.parseInt(formatter.format(currentDate));
	} catch (NumberFormatException e) {
		s = 0;
	}
  // ºÐ ¾Ë¾Æ³»±â
	formatter.applyPattern("m");
	try {
		m = Integer.parseInt(formatter.format(currentDate));
	} catch (NumberFormatException e) {
		m = 10;
	}
  // ½Ã ¾Ë¾Æ³»±â
	formatter.applyPattern("h");
	try {
		h = Integer.parseInt(formatter.format(currentDate));
	} catch (NumberFormatException e) {
		h = 10;
	}
	
	}
	//È­¸é¿¡ Ãâ·ÂÇÏ±â
	public void paint(Graphics g) {
		CurruntTime();
		// ½Ã°è ¸ð¾ç ±×¸®±â
		g.drawOval(rect.left,  rect.top,  rect.right,  rect.bottom);
		// ½Ã°£ ÁÂÇ¥
		int xh = (int) (Math.cos((h*30 + m / 2) * Math.PI / 180 - Math.PI / 2) * 70 + center_x);
		int yh = (int) (Math.sin((h*30 + m / 2) * Math.PI / 180 - Math.PI / 2) * 70 + center_y);
		
		// ºÐ ÁÂÇ¥
		int xm = (int) (Math.cos(m * Math.PI / 30 - Math.PI / 2) * 90 + center_x);
		int ym = (int) (Math.sin(m * Math.PI / 30 - Math.PI / 2) * 90 + center_y);
		
		//ÃÊ ÁÂÇ¥
		int xs = (int) (Math.cos(s * Math.PI / 30 - Math.PI / 2) * 110 + center_x);
		int ys = (int) (Math.sin(s * Math.PI / 30 - Math.PI / 2) * 110 + center_y);
		
		 String c;		// 1~12 ¼ýÀÚ ­x·Â ¹®ÀÚ ÀúÀå
		 RECT tRect = new RECT(0,0,0,0);		// ´«±Ý Ãâ·Â ¿µ¿ª ¼³Á¤
		 
		 // ´«±Ý Ãâ·Â ºÎºÐ
		 for (int i = 0; i < 60; i++) {
			 tRect.top = (int)(Math.cos(i * Math.PI / 30 - Math.PI / 2) * 125 + center_x);
			 tRect.left = (int)(Math.sin(i * Math.PI / 30 - Math.PI / 2) * 125 + center_y);
			 
			 if(i % 5 == 0) {
				 tRect.right = tRect.left + 9;
				 tRect.bottom = tRect.top + 9;
				 
				 tRect.offSet(7, 5);  // ´«±Ý ÁÂÇ¥ º¸Á¤
				 
				 if((i / 5) == 0)
					 c = "12";
				 else
					 c = (int)(i / 5) + "";
				 
				 g.setColor(new Color(0,0,0));
				 g.drawString(c,  tRect.top-2,  tRect.left-1);
				 
				 
			 }
			 
			 // ÃÊ ¹Ù´Ã ±×¸®±â
			 g.setColor(new Color(100,100,255));
			 g.drawLine(center_x,  center_y,  xs,  ys);
			 
			 // ºÐ ¹Ù´Ã ±×¸®±â
			 g.setColor(new Color(100,255,100));
			 g.drawLine(center_x,  center_y,  xm,  ym);
			 
			 // ½Ã ¹Ù´Ã ±×¸®±â
			 g.setColor(new Color(255,0,10));
			 g.drawLine(center_x,  center_y,  xh,  yh);
			
		}
		
	}
	
	public void run() {
		for (; ;) {
			try {
				Thread.sleep(1000);
				repaint();
			} catch (InterruptedException e) {	}
			
		}
	}
}

package java_0731;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Image_2 extends Frame implements ActionListener {

	Image img;
	XCanvas_3 canvas;
	
	Button[] btn = new Button[7];
	String[] btn_str = {"기본","확대","축소","상하","좌우","전부","이미지불러오기"};
	
	TextField txt;
	int message = 0;
	
	static final int 기본 = 0;
	static final int 확대 = 1;
	static final int 축소 = 2;
	static final int 상하 = 3;
	static final int 좌우 = 4;
	static final int 전부 = 5;

	String ss = "src\\images\\Daniel_1.jpg";
	
	public Image_2(String title) {
		super(title);
	
		img = Toolkit.getDefaultToolkit().getImage(ss);
		
		canvas = new XCanvas_3();
		canvas.setSize(600, 450);
		
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		
		panel1.setBackground(new Color(0,51,153));
		panel2.setBackground(new Color(255,205,18));
		
		for (int i = 0; i < 6; i++) {
			
			btn[i] = new Button(btn_str[i]);
			btn[i].addActionListener(this);
			panel1.add(btn[i]);
			
		}
		
		panel2.add(new Label("파일 불러오기"));
		txt = new TextField("src\\images\\combat.jpg", 20);
		
		panel2.add(txt);
		
		btn[6] = new Button(btn_str[6]);
		btn[6].addActionListener(this);
		panel2.add(btn[6]);
		
		add("North", panel2);
		add("Center", canvas);
		add("South", panel1);
		
		addWindowListener(new Handler());
		
		setSize(500, 700);
		setVisible(true);
	
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Button obj = (Button) e.getSource();
		
		if (obj == btn[0]) {
			
			message = 기본;
					
		} else if (obj == btn[1]) {
			message = 확대;
		} else if (obj == btn[2]) {
			message = 축소;
		} else if (obj == btn[3]) {
			message = 좌우;
		} else if (obj == btn[4]) {
			message = 상하;			
		} else if (obj == btn[5]) {
			message = 전부;
			
		} else {
			ss = txt.getText();
			img = Toolkit.getDefaultToolkit().getImage(ss);
		}
		
		canvas.repaint();
		
	}

	class XCanvas_3 extends Canvas {
		
		public void paint(Graphics g) {
			switch (message) {
			case 기본:
				
				g.drawImage(img,0,0,this);
				
				break;
				
			case 확대:
				
				g.drawImage(img,0,0,img.getWidth(this)*2,img.getHeight(this)*2,0,0,img.getWidth(this),img.getHeight(this),this);

				break;
				
			case 축소:
				
				g.drawImage(img,0,0,img.getWidth(this)/2,img.getHeight(this)/2,0,0,img.getWidth(this),img.getHeight(this),this);
				
				break;
				
			case 좌우:
				
				g.drawImage(img,img.getWidth(this),0,0,img.getHeight(this),0,0,img.getWidth(this),img.getHeight(this),this);
				
				break;
				
			case 상하:
			
				g.drawImage(img,0,img.getHeight(this),img.getWidth(this),0,0,0,img.getWidth(this),img.getHeight(this),this);
				
			break;
			
			case 전부:
				
				g.drawImage(img,img.getHeight(this),img.getWidth(this),0,0,0,0,img.getWidth(this),img.getHeight(this),this);
				
			break;
				
			default:
				break;
			}
		}
		
	}
	
	class Handler extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new Image_2("Image Test");
	}
	
}

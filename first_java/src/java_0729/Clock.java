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
	//������
	public Clock(String title) {
		super(title);
		// �Ƴ��α� ������ ���̱�
		analog = new Analog();
		analog.setSize(300, 330);
		btn = new Button("�ð� ����");
		btn.addActionListener(this);
		add("Center", analog);
		add("South", btn);
		setSize(330, 380);
		setVisible(true);
	}
	//������ ����
	public void Start() {
		new Thread(analog).start();
	}
	//���α׷� ���� ����
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Clock clock = new Clock("�Ƴ��α� �ð�");
		clock.Start();
	}

}

//�簢�� ������ �����ϴ� Ŭ����

class RECT {
	int left;  // ���� X ��ǥ
	int top;  // ���� Y ��ǥ
	int right; // ������ X ��ǥ
	int bottom;  // ���� Y��ǥ
	public RECT(int left, int top, int right, int bottom) {
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
	}
	
	// ���� ����, ���� ���� ����
	public void offSet(int horizontal_offset, int vertical_offset) {
		left += horizontal_offset;
		right += horizontal_offset;
		top += vertical_offset;
		bottom += vertical_offset;
		
	}
}

//�Ƴ��α� Ŭ����

class Analog extends Canvas implements Runnable {
	RECT rect;
	static int h; // �ð�
	static int m; // ��
	static int s; // ��
	static int center_x , center_y; // �ð� �ٴ� �߽� ��ǥ
	
	//������
	public Analog() {
		rect = new RECT(10, 10, 290, 290);
		center_x = (rect.right + rect.left) / 2; // �ð� �߽� x ��ǥ
		center_y = (rect.bottom + rect.top) / 2; // �ð� �߽� y ��ǥ
		
	}
	
	// ���� �ð� �˾Ƴ��� �޼���
	static void CurruntTime() {
		Date currentDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd hh:ss yyyy", Locale.getDefault());
		
		
   // �� �˾Ƴ���
	formatter.applyPattern("s");
	try {
		s = Integer.parseInt(formatter.format(currentDate));
	} catch (NumberFormatException e) {
		s = 0;
	}
  // �� �˾Ƴ���
	formatter.applyPattern("m");
	try {
		m = Integer.parseInt(formatter.format(currentDate));
	} catch (NumberFormatException e) {
		m = 10;
	}
  // �� �˾Ƴ���
	formatter.applyPattern("h");
	try {
		h = Integer.parseInt(formatter.format(currentDate));
	} catch (NumberFormatException e) {
		h = 10;
	}
	
	}
	//ȭ�鿡 ����ϱ�
	public void paint(Graphics g) {
		CurruntTime();
		// �ð� ��� �׸���
		g.drawOval(rect.left,  rect.top,  rect.right,  rect.bottom);
		// �ð� ��ǥ
		int xh = (int) (Math.cos((h*30 + m / 2) * Math.PI / 180 - Math.PI / 2) * 70 + center_x);
		int yh = (int) (Math.sin((h*30 + m / 2) * Math.PI / 180 - Math.PI / 2) * 70 + center_y);
		
		// �� ��ǥ
		int xm = (int) (Math.cos(m * Math.PI / 30 - Math.PI / 2) * 90 + center_x);
		int ym = (int) (Math.sin(m * Math.PI / 30 - Math.PI / 2) * 90 + center_y);
		
		//�� ��ǥ
		int xs = (int) (Math.cos(s * Math.PI / 30 - Math.PI / 2) * 110 + center_x);
		int ys = (int) (Math.sin(s * Math.PI / 30 - Math.PI / 2) * 110 + center_y);
		
		 String c;		// 1~12 ���� �x�� ���� ����
		 RECT tRect = new RECT(0,0,0,0);		// ���� ��� ���� ����
		 
		 // ���� ��� �κ�
		 for (int i = 0; i < 60; i++) {
			 tRect.top = (int)(Math.cos(i * Math.PI / 30 - Math.PI / 2) * 125 + center_x);
			 tRect.left = (int)(Math.sin(i * Math.PI / 30 - Math.PI / 2) * 125 + center_y);
			 
			 if(i % 5 == 0) {
				 tRect.right = tRect.left + 9;
				 tRect.bottom = tRect.top + 9;
				 
				 tRect.offSet(7, 5);  // ���� ��ǥ ����
				 
				 if((i / 5) == 0)
					 c = "12";
				 else
					 c = (int)(i / 5) + "";
				 
				 g.setColor(new Color(0,0,0));
				 g.drawString(c,  tRect.top-2,  tRect.left-1);
				 
				 
			 }
			 
			 // �� �ٴ� �׸���
			 g.setColor(new Color(100,100,255));
			 g.drawLine(center_x,  center_y,  xs,  ys);
			 
			 // �� �ٴ� �׸���
			 g.setColor(new Color(100,255,100));
			 g.drawLine(center_x,  center_y,  xm,  ym);
			 
			 // �� �ٴ� �׸���
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

package java_0805;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame_1 extends JFrame implements ActionListener {
	
	private int pieces = 4;
	private int totalPieces = pieces * pieces;
	private int[] pieceNumber;
	private BufferedImage img;
	
	public MyImageFrame_1() {
		setTitle("Image Draw Test");
		try {
			img = ImageIO.read(new File("src\\images\\hukei_1.jpg"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		pieceNumber = new int[totalPieces];
		for (int i = 0; i < totalPieces; i++) {
			pieceNumber[i] = i;
			
		}
		
		add(new MyPanel(), BorderLayout.CENTER);
		JButton button = new JButton("DIVIDE");
		
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH);
		setSize(img.getWidth(null), img.getHeight(null));
		setSize(1200, 800);
		setVisible(true);
		
	}
	
	void divide() {
		Random rand = new Random();
		int ri;
		for (int i = 0; i < totalPieces; i++) {
			ri = rand.nextInt(totalPieces);  // nextInt 에 16을 집어넣으면 0부터 15까지 나옴 (4*4)
			System.out.println(rand.nextInt(totalPieces));  // rand.nextInt(totalPieces) 대신에 ri 를 써도 됨
			int tmp = pieceNumber[i];
			pieceNumber[i] = pieceNumber[ri];
			pieceNumber[ri] = tmp;
			
		}		
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int pieceWidth = img.getWidth(null) / pieces;
			int pieceHeight = img.getHeight(null) / pieces;
			for (int x = 0; x < pieces; x++) {
				int sx = x * pieceWidth;
				for (int y = 0; y < pieces; y++) {
					int sy = y * pieceHeight;
					int number = pieceNumber[x * pieces + y];
					int dx = (number / pieces) * pieceWidth;
					int dy = (number % pieces) * pieceHeight;
					g.drawImage(img, dx, dy, dx + pieceWidth, dy + pieceHeight, sx, sy, sx + pieceWidth, sy + pieceHeight, null);
					// s(소스 원래 원본이 들어있는 좌표의 크기)
					
				}
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		new MyImageFrame_1();
	}
	
	public void actionPerformed(ActionEvent e) {
		divide();
		repaint();
	}

}

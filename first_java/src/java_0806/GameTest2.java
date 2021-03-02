package java_0806;

import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

public class GameTest2 {
	public static void main(String[] ar) {

		Frame f = new Frame();
	}
}

class Frame extends JFrame implements KeyListener, Runnable {  

	int f_width;
	int f_height;
	int x, y;
	boolean left = false;
	boolean right = false;
	boolean space = false;
	int c;
	int enemy_w, enemy_h;
	int missile_w, missile_h;
	int missile2_w, missile2_h;
	int boss_w, boss_h;
	int airplane_w, airplane_h;
	int game_Score;
	int player_hit;
	int missile_speed;
	int boss_hit;
	int boss_speed;
	Thread t;
	Toolkit tk = Toolkit.getDefaultToolkit();
	Image airplane_img;
	Image boss_img;
	Image missile_img;
	Image missile2_img;
	Image enemy_img;
	Image back_img;
	Image icon_img;
	ArrayList missile_list = new ArrayList();
	ArrayList missile2_list = new ArrayList();
	ArrayList enemy_list = new ArrayList();
	ArrayList boss_list = new ArrayList();
	Image bufI;
	Graphics buf;
	Missile ms;
	Missile2 ms2;
	Enemy en;
	Boss bs;

	Frame() {

		base();
		start();
		setIconImage(icon_img);
		setTitle("자바 슈팅게임 과제");
		setSize(f_width, f_height);
		setVisible(true);
	}

	public void base() { // 변수 내용
		x = 200;
		y = 650;
		f_width = 800;
		f_height = 1000;
		back_img = tk.getImage("popcorn_1.png");
		missile_img = tk.getImage("popcorn_2.png");
		missile2_img = tk.getImage("popcorn_2.png");
		airplane_img = tk.getImage("popcorn11.png");
		boss_img = tk.getImage("snack_bite.png");
		enemy_img = tk.getImage("cherry.png");
		icon_img = tk.getImage("popcorn_2.png");
		enemy_w = ImageWidthValue("cherry.png");
		enemy_h = ImageHeightValue("cherry.png");
		missile_w = ImageWidthValue("popcorn_2.png");
		missile_h = ImageHeightValue("popcorn_2.png");

		missile2_w = ImageWidthValue("popcorn_2.png");
		missile2_h = ImageHeightValue("popcorn_2.png");
		airplane_w = ImageWidthValue("popcorn11.png");
		airplane_h = ImageHeightValue("popcorn11.png");
		boss_w = ImageWidthValue("snack_bite.png");
		boss_h = ImageHeightValue("snack_bite.png");
		game_Score = 0;
		player_hit = 5;
		missile_speed = 15;
		boss_hit = 2;
		boss_speed = 4;
	}

	private int ImageHeightValue(String file) {
		int y = 0;
		try {
			File f = new File(file);
			BufferedImage bi = ImageIO.read(f);
			y = bi.getHeight();
		} catch (Exception e) {
		}
		return y;
	}

	private int ImageWidthValue(String file) {
		int x = 0;
		try {
			File f = new File(file);
			BufferedImage bi = ImageIO.read(f);
			x = bi.getWidth();
		} catch (Exception e) {
		}
		return x;
	}

	public void start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		try {
			while (true) {
				KeyProcess();
				MissileProcess();
				Missile2Process();
				EnemyProcess();
				bossProcess();
				repaint();
				Thread.sleep(20);
				c++;
			}
		} catch (Exception e) {
		}
	}

	public void bossProcess() { // 보스 작동 내용
		for (int i = 0; i < boss_list.size(); ++i) {
			bs = (Boss) (boss_list.get(i));
			bs.move();
			if (bs.y > 1000) {
				boss_list.remove(i);
				player_hit--;
			}
			if (Crash(x + 70, y + 80, bs.x, bs.y, airplane_w, airplane_h, boss_w, boss_h)) {
				player_hit--;
				boss_list.remove(i);
			}
		}
		if (game_Score <= 500) {
			if (c % 200 == 0) { // 루프 카운트 200회 마다
				bs = new Boss(80, -600);
				boss_list.add(bs);
				bs = new Boss(420, -600);
				boss_list.add(bs);
			}
		} else if (game_Score > 500) {
			if (c % 150 == 0) { // 루프 카운트 150회 마다
				bs = new Boss(80, -600);
				boss_list.add(bs);
				bs = new Boss(420, -600);
				boss_list.add(bs);
			}
		}

	}

	public void EnemyProcess() { // 몹 내용
		for (int i = 0; i < enemy_list.size(); ++i) {
			en = (Enemy) (enemy_list.get(i));
			en.move();
			if (en.y > 1000) {
				enemy_list.remove(i);
				player_hit--;
			}
			if (Crash(x + 70, y + 80, en.x, en.y, airplane_w, airplane_h, enemy_w, enemy_h)) {
				player_hit--;
				enemy_list.remove(i);
			}
		}

		if (game_Score <= 500) {
			if (c % 100 == 0) { // 루프 카운트 100회 마다
				en = new Enemy(580, -300);
				enemy_list.add(en);
				en = new Enemy(310, -300);
				enemy_list.add(en);
				en = new Enemy(50, -300);
				enemy_list.add(en);
				en = new Enemy(180, -500);
				enemy_list.add(en);
				en = new Enemy(420, -500);
				enemy_list.add(en);
			}
		} else if (game_Score > 500) {
			if (c % 70 == 0) { // 루프 카운트 70회 마다
				en = new Enemy(580, -250);
				enemy_list.add(en);
				en = new Enemy(310, -250);
				enemy_list.add(en);
				en = new Enemy(50, -250);
				enemy_list.add(en);
				en = new Enemy(180, -400);
				enemy_list.add(en);
				en = new Enemy(420, -400);
				enemy_list.add(en);
			}
		}

	}

	public void MissileProcess() { // 미사일 내용
		if (space == true) {
			if ((c % missile_speed) == 0) {
				ms = new Missile(x, y);
				missile_list.add(ms);
			}
		}
		for (int i = 0; i < missile_list.size(); ++i) {
			ms = (Missile) (missile_list.get(i));
			ms.move();
			if (ms.y > f_width) {
				missile_list.remove(i);
			}
			for (int j = 0; j < enemy_list.size(); ++j) {
				en = (Enemy) enemy_list.get(j);
				if (Crash(ms.x + 100, ms.y + 100, en.x, en.y, missile_w, missile_h, enemy_w, enemy_h)) {
					missile_list.remove(i);
					enemy_list.remove(j);
					game_Score += 10;
				}
// if (Crash(ms.x + 100,ms.y + 100,en.x,en.y, missile_w, missile_h, enemy_w, enemy_h)
// && Crash(ms.x + 100,ms.y + 100,bs.x,bs.y, missile_w, missile_h, boss_w, boss_h)){
// missile_list.remove(i);
// enemy_list.remove(j);
// game_Score += 10;
// }
			}
			for (int j = 0; j < boss_list.size(); ++j) {
				bs = (Boss) boss_list.get(j);
				if (Crash(ms.x + 100, ms.y + 100, bs.x, bs.y, missile_w, missile_h, boss_w, boss_h)) {
					missile_list.remove(i);
					boss_hit--;
					if (boss_hit == 0) {
						boss_list.remove(j);
						boss_hit = 2;
						game_Score += 20;
						boss_speed += 1;
					}
				}
// if (Crash(ms.x + 100,ms.y + 100,en.x,en.y, missile_w, missile_h, enemy_w, enemy_h)
// && Crash(ms.x + 100,ms.y + 100,bs.x,bs.y, missile_w, missile_h, boss_w, boss_h)){
// missile_list.remove(i);
// boss_hit--;
// if(boss_hit == 0) {
// boss_list.remove(j);
// boss_hit = 2;
// game_Score += 20;
// }
// }
			}
		}
	}

	public void Missile2Process() { // 미사일2 내용
		if (game_Score >= 500) {
			if (space == true) {
				if ((c % missile_speed) == 0) {
					ms2 = new Missile2(x, y);
					missile2_list.add(ms2);
				}
			}
			for (int i = 0; i < missile2_list.size(); ++i) {
				ms2 = (Missile2) (missile2_list.get(i));
				ms2.move();
				if (ms2.y > f_width) {
					missile2_list.remove(i);
				}
				for (int j = 0; j < enemy_list.size(); ++j) {
					en = (Enemy) enemy_list.get(j);
					if (Crash(ms2.x + 140, ms2.y + 100, en.x, en.y, missile2_w, missile2_h, enemy_w, enemy_h)) {
						missile2_list.remove(i);
						enemy_list.remove(j);
						game_Score += 10;
					}
				}
				for (int j = 0; j < boss_list.size(); ++j) {
					bs = (Boss) boss_list.get(j);
					if (Crash(ms2.x + 140, ms2.y + 100, bs.x, bs.y, missile2_w, missile2_h, boss_w, boss_h)) {
						missile2_list.remove(i);
						boss_hit--;
						if (boss_hit == 0) {
							boss_list.remove(j);
							boss_hit = 2;
							game_Score += 20;
							boss_speed += 1;
						}
					}
				}
			}
		}
	}

	public boolean Crash(int x1, int y1, int x2, int y2, int w1, int h1, int w2, int h2) { // 충돌 체크

		boolean check = false;

		if (Math.abs((x1 + w1 / 2) - (x2 + w2 / 2)) < (w2 / 2 + w1 / 2)
				&& Math.abs((y1 + h1 / 2) - (y2 + h2 / 2)) < (h2 / 2 + h1 / 2)) {
			check = true;
		} else {
			check = false;
		}

		return check;

	}

	public void paint(Graphics g) {
		bufI = createImage(f_width, f_height);
		buf = bufI.getGraphics();
		update(g);
	}

	public void update(Graphics g) {
		if (player_hit <= 0) {
			Draw_Back();
			Draw_Text2();
			g.drawImage(bufI, 0, 0, this);
			t.interrupt(); // 게임 오버시 점수 고정을 위해 Thread 종료
		} else {
			Draw_Back();
			Draw_Boss();
			Draw_Enemy();
			Draw_Missile();
			if (game_Score >= 500) {
				Draw_Missile2();
			}
			Draw_Char();

			Draw_Text();
			g.drawImage(bufI, 0, 0, this);
		}
	}

	public void Draw_Missile() { // 미사일 그려넣기
		for (int i = 0; i < missile_list.size(); ++i) {
			ms = (Missile) (missile_list.get(i));
			buf.drawImage(missile_img, ms.x + 100, ms.y + 100, this);
		}
	}

	public void Draw_Missile2() { // 미사일2 그려넣기
		for (int i = 0; i < missile2_list.size(); ++i) {
			ms2 = (Missile2) (missile2_list.get(i));
			buf.drawImage(missile2_img, ms2.x + 140, ms2.y + 50, this);
		}
	}

	public void Draw_Back() { // 배경 그려넣기
		buf.clearRect(0, 0, f_width, f_height);
		buf.drawImage(back_img, 0, 0, this);
	}

	public void Draw_Char() { // 플레이어 그려넣기
		buf.drawImage(airplane_img, x + 70, y + 80, this);
	}

	public void Draw_Boss() { // 보스 그려넣기
		for (int i = 0; i < boss_list.size(); ++i) {
			bs = (Boss) (boss_list.get(i));
			buf.drawImage(boss_img, bs.x, bs.y, this);
		}
	}

	public void Draw_Enemy() { // 몹 그려넣기
		for (int i = 0; i < enemy_list.size(); ++i) {
			en = (Enemy) (enemy_list.get(i));
			buf.drawImage(enemy_img, en.x, en.y, this);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) { // 사용하는 키 누를때
// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
		case KeyEvent.VK_SPACE:
			space = true;
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) { // 사용하는 키 땔때
// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = false;
			break;
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
		case KeyEvent.VK_SPACE:
			space = false;
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
// TODO Auto-generated method stub
	}

	public void Draw_Text() { // 게임 중 점수, 목숨 텍스트 송출
// TODO Auto-generated method stub
		buf.setFont(new Font("Defualt", Font.BOLD, 30));
		buf.setColor(new Color(255, 255, 255)); // 글자 색 흰색으로 변경
		buf.drawString("SCORE : " + game_Score, 50, 80);
		buf.drawString("Life : " + player_hit, 50, 120);
	}

	public void Draw_Text2() { // 게임 오버 텍스트 송출
// TODO Auto-generated method stub
		buf.setFont(new Font("Defualt", Font.BOLD, 100));
		buf.setColor(new Color(255, 255, 255));
		buf.drawString("GameOver", 150, 400);
//game_Score = game_Score;
		buf.drawString("SCORE : " + game_Score, 100, 700);
	}

	public void KeyProcess() { // 플레이어 키 작동 부분
		if (left == true) {
			if (x > -60) {
				x -= 15;
			}
		}
		if (right == true) {
			if (x + airplane_img.getWidth(null) + 80 < f_width) {
				x += 15;
			}
		}
	}

	class Missile { // 미사일 움직임, 속도
		int x;
		int y;

		Missile(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public void move() {
			y -= 15;
		}
	}

	class Missile2 { // 미사일2 움직임, 속도
		int x;
		int y;

		Missile2(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public void move() {
			y -= 15;
		}
	}

	class Enemy { // 몹 움직임, 속도
		int x;
		int y;

		Enemy(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public void move() {
			y += 4;
		}
	}

	class Boss { // 보스 움직임, 속도 증가
		int x;
		int y;

		Boss(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public void move() {
			y += boss_speed;
		}
	}
}
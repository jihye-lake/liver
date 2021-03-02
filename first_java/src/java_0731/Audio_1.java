package java_0731;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Audio_1 extends Applet implements ActionListener, ItemListener {  // Applet 은 main 이 없음
	
	AudioClip[] audio = new AudioClip[6];
	Label lbl_info;
	Button play,loop,stop;
	String[] audio_name = {"yahoo1.au","that.hurts.au","computer.au","spacemusic.au","gong.au","Aimer-02-Through-My-Blood-_AM_-Ninelie-EP-192.au"};
	
	Choice choice;
	
	int i = 0;   // 음악파일 지정
	

	
	public void init() {
		setLayout(new BorderLayout());
		
		for (int i = 0; i < audio_name.length; i++)			
			audio[i] = getAudioClip(getCodeBase(), audio_name[i]);
			
			choice = new Choice();
			
			for (int j = 0; j < audio_name.length; j++) {
				choice.add(audio_name[j]);				
			}
			
			play = new Button(" 재생 ");
			loop = new Button(" 반복 ");
			stop = new Button(" 중지 ");
			
			choice.addItemListener(this);
			play.addActionListener(this);
			loop.addActionListener(this);
			stop.addActionListener(this);
			
			Panel panel = new Panel();
			panel.add(play);
			panel.add(loop);
			panel.add(stop);
			
			add("North", choice);
			add("Center", lbl_info = new Label(audio_name[i] + "선택", Label.CENTER));
			add("South", panel);
			
	}
		
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		i = choice.getSelectedIndex();
		lbl_info.setText(audio_name[i] + "선택");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Button obj = (Button) e.getSource();
		
		if (obj == play) {
			audio[i].play();
			
		}
		
		if (obj == loop) {
			audio[i].loop();
			
		}
		
		if (obj == stop) {
			audio[i].stop();
			
		}
		
	}
	
		

}

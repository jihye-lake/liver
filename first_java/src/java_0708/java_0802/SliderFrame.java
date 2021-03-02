package java_0802;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class SliderFrame extends JFrame implements ChangeListener {
	static final int INIT_VALUE = 15;
	private JButton buttonOK;
	private JSlider slider;
	private JButton button;
	
	public SliderFrame() {
		JPanel panel;
		
		setTitle("�����̴� �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		
		JLabel label = new JLabel("�����̴��� ������������", JLabel.CENTER);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(label);
		
		slider = new JSlider(0, 30, INIT_VALUE);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(this);
		panel.add(slider);
		
		button = new JButton("  ");
		ImageIcon icon = new ImageIcon("src\\images\\snack_minis.jpg");
		button.setIcon(icon);
		button.setSize(INIT_VALUE * 10, INIT_VALUE * 10);
		panel.add(button);
		add(panel);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider) e.getSource();
		if (!source.getValueIsAdjusting()) {
			int value = (int) source.getValue();
			button.setSize(value * 10, value * 10);
			
		}
	}
	
	public static void main(String[] args) {
		new SliderFrame();
	}

}

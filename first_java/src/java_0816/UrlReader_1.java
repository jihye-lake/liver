package java_0816;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlReader_1 extends Frame implements ActionListener {

	Button btn_read, btn_exit;
	TextArea txt_list;
	TextField txt_input;
	URL url = null;
	URLConnection url_read = null;

	public UrlReader_1(String title) {
		super(title);

		btn_read = new Button("�о����");
		btn_exit = new Button("����");
		btn_read.addActionListener(this);
		btn_exit.addActionListener(this);
		txt_list = new TextArea();
		txt_input = new TextField("", 30);
		Panel panel = new Panel();
		panel.add(txt_input);
		panel.add(btn_read);
		add("North", panel);
		add("Center", txt_list);
		add("South", btn_exit);

		setSize(450, 450);
		setVisible(true);

	}

	public void AddString(String str) {
		txt_list.append(str + "\n");
	}
	
	// https://daum.net/index.html => ���� ����Ʈ

	@Override
	public void actionPerformed(ActionEvent ae) {
		Button obj = (Button) ae.getSource();
		if (obj == btn_read) { 
			if (txt_input.getText() == "")
				return;
			try {
				url = new URL(txt_input.getText());
				url_read = url.openConnection();
				int size = url_read.getContentLength();
				AddString("���� Ÿ�� : " + url_read.getContentType());
				AddString("���� ���� : " + url_read.getLastModified());
				AddString("���� ũ�� : " + size + "byte");
				if (size > 0) {
					InputStream is = url_read.getInputStream(); // ��Ʈ�� ����
					int ch;
					while ((ch = is.read()) != -1) {
						txt_list.append((char) ch + "");
					}
					is.close();
				} else {
					AddString("���� ������ �����ϴ�");
				}
			} catch (Exception e) {
				AddString(e.getMessage());
			}
		} else {
			System.exit(0); // ���α׷� ����
		}

	}
	
	public static void main(String[] args) {
		new UrlReader_1("������Ʈ �ҽ� �о���� ver 1.0");
	}

}

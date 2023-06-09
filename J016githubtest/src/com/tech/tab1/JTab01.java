package com.tech.tab1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTab01 extends JFrame implements ActionListener {

	JTabbedPane t = new JTabbedPane();
	JPanel p1 = new JPanel();
	JButton btn1 = new JButton("탭 연습");
	JButton btn2 = new JButton("탭 연습");
	JButton btn3 = new JButton("탭 연습");
	JTextField txt_1 = new JTextField("기본값", 25);

	public JTab01() {
		setTitle("Use Tab");
		setSize(450, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(txt_1);

		t.add("기록일지", new JTextArea());
		t.add("상태일지", p1);
		t.add("회원정보변경", new JTextArea());
		t.add("About", new JTextArea());

		add(t);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("신호");
		if (e.getSource() == btn1) {// btn1을 누르면 indexnumber 0번째의 탭으로 이동해라.
			t.setSelectedIndex(0);
		} else if (e.getSource() == btn2) {
			t.setSelectedIndex(2);
		} else if (e.getSource() == btn3) {
			t.setSelectedIndex(3);
		}
	}

	public static void main(String[] args) {
		new JTab01();
	}
}

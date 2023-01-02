package com.ibik.gui;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class AppActionListener extends JFrame implements ActionListener {
	
	private JButton btn1, btn2, btn3;
	
	AppActionListener(){
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(300,100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		initialize(this);
		setLayout(new FlowLayout());
	}
	
	public static void main(String[] args) {
		new AppActionListener();
	}
	
	private void initialize(AppActionListener frame) {
		btn1 = new JButton("Klik disini");
		btn1.addActionListener(frame);
		
//		btn2 = new JButton("Klik disini 2");
//		btn2.addActionListener(frame);
//		
//		btn3 = new JButton("Klik disini 3");
//		btn3.addActionListener(frame);
		
		frame.add(btn1);
//		frame.add(btn2);
//		frame.add(btn3);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			JOptionPane.showMessageDialog(null, "Hello Worlds!");
		} else if(e.getSource() == btn2) {
			JOptionPane.showMessageDialog(null, "Halo Dunia!");
		} else if(e.getSource() == btn3) {
			JOptionPane.showMessageDialog(null, "Hai!");
		}
	}
}

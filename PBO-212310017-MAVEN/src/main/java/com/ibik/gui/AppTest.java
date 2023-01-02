package com.ibik.gui;

import javax.swing.*;
import java.awt.*;

public class AppTest extends JFrame{
	
	AppTest() {
		setVisible(true);
		setSize(500, 500);
		pack();
		setTitle("Lorem");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateKotak(this);
	}
	
	public static void main(String[] args) {
		new AppTest();
	}
	
	private static void GenerateKotak(JFrame frame) {
		JLabel label_kotak = new JLabel();
		label_kotak.setBackground(Color.red);
		label_kotak.setBounds(0, 0, 50, 50);
		
		frame.add(label_kotak);
		frame.setLayout(null);
	}

}

package com.ibik.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;

public class App extends JFrame {
	App(){
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(800,500);
		setTitle("Contoh Flow Layout");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GeneratedUI(this);
	}
	
	public static void main(String[] args) {
		new App();
	}

	private void GeneratedUI(App frame) {
	//JButton button1 = new JButton("Button 1");
	//JButton button2 = new JButton("Button 2");
	//JButton button3 = new JButton("Button 3");
	//JButton button4 = new JButton("Button 4");
	//JButton button5 = new JButton("Button 5");
	//frame.add(button1, BorderLayout.NORTH);
	//frame.add(button2, BorderLayout.SOUTH);
	//frame.add(button3, BorderLayout.EAST);
	//frame.add(button4, BorderLayout.WEST);
	//frame.add(button5, BorderLayout.CENTER);
	
	JButton button6 = new JButton();
	 button6.setText("Klik saya");
	 button6.setIcon(new ImageIcon("D:\\cat.PNG"));
	 
	 //memberikan aksi event klik
	 button6.addActionListener(new ActionListener(){
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 JOptionPane.showMessageDialog(null, "Anda baru saja klik button");
		 }
	 });
	 
	 //sampai disini 
	 button6.setBounds(100,100, 512, 512);

	 frame.add(button6);
	 frame.setLayout(null);

	frame.setLayout(new FlowLayout());
	}
}
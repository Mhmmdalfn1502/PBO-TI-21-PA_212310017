package com.ibik.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.MouseInputListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Perpustakaan extends JFrame implements ActionListener{
	Perpustakaan(){
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(350,300);
		setTitle("Aplikasi Perpustakaan");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(true);
		UI(this);
	}
	private void UI(Perpustakaan frame) {
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		
		JLabel label1 = new JLabel("Aplikasi Pepustakaan");
		label1.setBounds(100,5,150,80);
		panel1.add(label1);
		
		JLabel label2 = new JLabel("Kode Buku");
		label2.setBounds(25,60,150,30);
		panel1.add(label2);
		
	
		final JTextField kode = new JTextField();
		kode.setBounds(120,60,150,30);
		panel1.add(kode);
		
		JLabel namaBuku = new JLabel ("Nama Buku");
		namaBuku.setBounds(25,100,150,30);
		panel1.add(namaBuku);
		
		final JTextField nmBuku = new JTextField();
		nmBuku.setBounds(120, 100,150,30);
		nmBuku.setText(null);
		panel1.add(nmBuku);
		
		JLabel membership = new JLabel("Membership");
		membership.setBounds(25,140,150,30);
		panel1.add(membership);
		
		
		
		JRadioButton member1 = new JRadioButton("VIP");
		member1.setBounds(105,140,100,30);
		panel1.add(member1);
		JRadioButton member2 = new JRadioButton("Umum");
		member2.setBounds(200,140,100,30);
		panel1.add(member2);
		
		ButtonGroup grpMember = new ButtonGroup();
		grpMember.add(member1);
		grpMember.add(member2);
		
		
		final JButton btnSimpan = new JButton ("Simpan");
		btnSimpan.setBounds(105,180,150,30);
		panel1.add(btnSimpan);
		btnSimpan.addActionListener(this);
		
		btnSimpan.addMouseListener(new MouseInputListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				btnSimpan.setBackground(Color.pink);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				btnSimpan.setBackground(Color.yellow);
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		kode.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					String buku [][] = {
							{"BK1", "PBO"},
							{"BK2", "JAVA"},
					};
					for (int i = 0; i<buku.length; i++) {
						if(kode.getText().equals(buku[i][0])) {
							nmBuku.setText(buku[i][1]);
						}
					}
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		frame.add(panel1);
	}
	public static void main(String[] args) {
		new Perpustakaan();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "BERHASIL");

	
		
	}

}
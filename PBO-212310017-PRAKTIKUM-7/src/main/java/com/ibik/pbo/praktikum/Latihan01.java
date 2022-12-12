package com.ibik.pbo.praktikum;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Latihan01 extends JFrame implements ActionListener {

    private JButton bttn1, bttn2, bttn3;

    Latihan01() {
        setTitle("Latihan 01");
        setVisible(true);
        pack();
        setSize(300, 150);
        setLocationRelativeTo(null);
        GenerateMenuButton(this);
    }

    public static void main(String[] args) {
        new Latihan01();
    }

    public void GenerateMenuButton(JFrame frame) {
        JPanel upperPanel = new JPanel();
        bttn1 = new JButton("مرحبا بالعالم");
        bttn2 = new JButton("こんにちは世界");

        upperPanel.add(bttn1);
        upperPanel.add(bttn2);

        JPanel bottomPanel = new JPanel();
        bttn3 = new JButton("你好世界");
        
        bottomPanel.add(bttn3);
        
        frame.add(upperPanel, BorderLayout.NORTH);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        bttn1.addActionListener(this);
        bttn2.addActionListener(this);
        bttn3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bttn1) {
            JOptionPane.showMessageDialog(null, "(Bahasa Arab) Halo Dunia");
        } else if(e.getSource() == bttn2) {
            JOptionPane.showMessageDialog(null, "(Bahasa Jepang) Halo Dunia");
        } else if(e.getSource() == bttn3) {
            JOptionPane.showMessageDialog(null, "(Bahasa Mandarin) Halo Dunia");
        }
        
        
    }
}
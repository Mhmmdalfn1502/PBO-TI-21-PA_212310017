package com.ibik.pbo.praktikum;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Latihan03 extends JFrame {

    private JTextField txt_email;
    private JPasswordField txt_password;
    private JButton btn_submit;

    Latihan03() {
        setTitle("Latihan03");
        setVisible(true);
        pack();
        setSize(350, 300);
//        setLocationRelati veTo(null);
        setLayout(null);
        GenerateLogin(this);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Latihan03();
    }

    private void GenerateLogin(Latihan03 frame) {
        JLabel label_email = new JLabel("Email");
        label_email.setBounds(20, 20, 80, 20);

        txt_email = new JTextField();
        txt_email.setBounds(100, 20, 200, 25);

        JLabel label_password = new JLabel("Password");
        label_password.setBounds(20, 60, 80, 20);
        
        txt_password = new JPasswordField();
        txt_password.setBounds(100, 60, 200, 25);

        JCheckBox check_remember = new JCheckBox("Remember account?");
        check_remember.setBounds(100, 100, 150, 20);

        btn_submit = new JButton("SUBMIT");
        btn_submit.setBounds(100, 140, 200, 40);

        frame.add(label_email);
        frame.add(txt_email);
        frame.add(label_password);
        frame.add(txt_password);
        frame.add(check_remember);
        frame.add(btn_submit);

        btn_submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_email.getText().isEmpty() || new String(txt_password.getPassword()).isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Gagal Login!");
                } else {
                    JOptionPane.showMessageDialog(null, "LOGIN!");
                }
            }
            
        }
        );

    }
    
}
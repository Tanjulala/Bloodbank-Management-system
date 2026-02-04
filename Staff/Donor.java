package Staff;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Donor extends JFrame implements ActionListener {
    JPanel panel;
    JLabel name, bg, phone;
    JTextField namefield, bgfield, phonefield;
    JButton add, back;
    Color myColor, myColor1, myColor2;
    Font myFont1, myFont2, myFont3;

    public Donor() {
        super("Add Donor");
        this.setBounds(400, 200, 600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myColor = new Color(255, 255, 255);
        myColor1 = new Color(240, 248, 255);
        myColor2 = new Color(65, 97, 69);
        myFont2 = new Font("Roboto", Font.BOLD, 30);
        myFont3 = new Font("Roboto", Font.PLAIN, 16);
        // myFont1=new Font("Helvetica", Font.ITALIC ,24 );
        myFont1 = new Font("Roboto", Font.PLAIN, 20);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(myColor);

        name = new JLabel("Name : ");
        name.setBounds(50, 50, 150, 30);
        name.setFont(myFont1);
        panel.add(name);

        namefield = new JTextField();
        namefield.setBounds(130, 40, 300, 50);
        namefield.setFont(myFont1);
        panel.add(namefield);

        bg = new JLabel("Blood Group : ");
        bg.setBounds(50, 135, 150, 30);
        bg.setFont(myFont1);
        panel.add(bg);

        bgfield = new JTextField();
        bgfield.setBounds(190, 125, 100, 50);
        bgfield.setFont(myFont1);
        panel.add(bgfield);

        phone = new JLabel("Phone : ");
        phone.setBounds(50, 210, 150, 30);
        phone.setFont(myFont1);
        panel.add(phone);

        phonefield = new JTextField();
        phonefield.setBounds(140, 215, 300, 30);
        phonefield.setFont(myFont1);
        panel.add(phonefield);

        add = new JButton("Add Donor");
        add.setBounds(300, 300, 150, 30);
        add.setFont(myFont1);
        add.setBackground(myColor2);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton(" \u2190 Back ");
        back.setBounds(50, 300, 100, 30);
        back.setFont(myFont1);
        back.setBackground(myColor);
        back.setForeground(Color.BLACK);
        back.setBackground(myColor1);
        back.setBorder(null);
        back.addActionListener(this);
        panel.add(back);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == back) {
            staffhome s1 = new staffhome();
            s1.setVisible(true);
            this.setVisible(false);
        }

        else if (ae.getSource() == add) {

            String name = namefield.getText();
            String bgrp = bgfield.getText();
            String phn = phonefield.getText();

            if (name.isEmpty() || bgrp.isEmpty() || phn.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill All");
            } else {

                JOptionPane.showMessageDialog(null, "Sucessfully Added");

            }
        }
    }

    public static void main(String[] args) {
        Donor f1 = new Donor();
        f1.setVisible(true);
    }
}
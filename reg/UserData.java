package reg;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;

public class UserData extends JFrame {

    Container c;
    ImageIcon icon;
    JLabel label1, imgLabel;
    Font f1, f2, f3;
    JScrollPane scroll;
    JButton btn1, btn2, btn3, btn4, btn5, nBtn;
    Cursor cursor;
    ImageIcon logo;

    private String[] column = { "User Name", "Password", "Email", "Security Question", "Answer", "Date and Time" };
    private String[] rows = new String[7];

    public UserData() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Blood Donation System");
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("images/blood-drop.png"));
        this.setIconImage(icon.getImage());

        // Image
        logo = new ImageIcon(getClass().getResource("images//blood-drop.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(195, 50, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 40);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 18);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Donor Dashboard");
        label1.setBounds(160, 320, 450, 80);
        label1.setFont(f1);
        c.add(label1);

        // JButtons
        btn1 = new JButton("Refresh");
        btn1.setBounds(54, 418, 278, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        c.add(btn1);

        btn3 = new JButton("Request Appointment");
        btn3.setBounds(342, 418, 284, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        btn4 = new JButton("Exit");
        btn4.setBounds(54, 480, 278, 50);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#C00000"));
        c.add(btn4);

        btn5 = new JButton("Back");
        btn5.setBounds(342, 480, 284, 50);
        btn5.setFont(f2);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#2E75B6"));
        c.add(btn5);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        String file = ".\\Data\\user_data.txt";
        String temp = ".\\Data\\temp.txt";

        // Refresh Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                UserData frame = new UserData();
                frame.setVisible(true);

            }
        });

        // Add Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                AdminAdd frame = new AdminAdd();
                frame.setVisible(true);
            }
        });

        // Exit Button
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                Admin frame = new Admin();
                frame.setVisible(true);
            }
        });
    }

}

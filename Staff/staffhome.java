package Staff;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class staffhome extends JFrame implements ActionListener {
    JPanel panel;
    JButton donor, bi, pro;
    Color myColor, myColor1, myColor2;
    Font myFont1, myFont2, myFont3;

    public staffhome() {
        super("Homepage");
        this.setBounds(400, 200, 700, 150);
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

        pro = new JButton("Profile");
        pro.setBounds(25, 35, 150, 30);
        pro.setFont(myFont1);
        pro.setBackground(myColor2);
        pro.setForeground(Color.WHITE);
        pro.addActionListener(this);
        panel.add(pro);

        donor = new JButton("Add Donor");
        donor.setBounds(250, 35, 150, 30);
        donor.setFont(myFont1);
        donor.setBackground(myColor2);
        donor.setForeground(Color.WHITE);
        donor.addActionListener(this);
        panel.add(donor);

        bi = new JButton("Blood Inventory");
        bi.setBounds(475, 35, 200, 30);
        bi.setFont(myFont1);
        bi.setBackground(myColor2);
        bi.setForeground(Color.WHITE);
        bi.addActionListener(this);
        panel.add(bi);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == donor) {
            Donor f1 = new Donor();
            f1.setVisible(true);
            this.setVisible(false);
        }

        else if (ae.getSource() == pro) {
            JOptionPane.showMessageDialog(null, "Staff Name : Fahima Akter Remu");
        }

        else if (ae.getSource() == bi) {
            BI b1 = new BI();
            b1.setVisible(true);
            this.setVisible(false);
        }
    }

}
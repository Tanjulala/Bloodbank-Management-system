package Staff;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BI extends JFrame implements ActionListener {
    JPanel panel;
    JButton add, view, rmv;
    Color myColor, myColor1, myColor2;
    Font myFont1, myFont2, myFont3;

    public BI() {
        super("Blood Inventory");
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

        add = new JButton("Add Blood");
        add.setBounds(25, 35, 150, 30);
        add.setFont(myFont1);
        add.setBackground(myColor2);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        view = new JButton("View Stock");
        view.setBounds(250, 35, 150, 30);
        view.setFont(myFont1);
        view.setBackground(myColor2);
        view.setForeground(Color.WHITE);
        view.addActionListener(this);
        panel.add(view);

        rmv = new JButton("Remove Blood");
        rmv.setBounds(475, 35, 170, 30);
        rmv.setFont(myFont1);
        rmv.setBackground(myColor2);
        rmv.setForeground(Color.WHITE);
        rmv.addActionListener(this);
        panel.add(rmv);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            AddB a1 = new AddB();
            a1.setVisible(true);
            this.setVisible(false);
        }

        else if (ae.getSource() == view) {
            JOptionPane.showMessageDialog(null, "Blood Stock : *** Unit");
        }

        else if (ae.getSource() == rmv) {
            RmvB r1 = new RmvB();
            r1.setVisible(true);
            this.setVisible(false);
        }
    }

}
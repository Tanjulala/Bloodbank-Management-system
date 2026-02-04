package Staff;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RmvB extends JFrame implements ActionListener {
    JPanel panel;
    JLabel bg, unit;
    JTextField bgfield, unitf;
    JButton add, back;
    Color myColor, myColor1, myColor2;
    Font myFont1, myFont2, myFont3;

    public RmvB() {
        super("Remove Blood");
        this.setBounds(400, 200, 500, 400);
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

        bg = new JLabel("Blood Group : ");
        bg.setBounds(50, 135, 150, 30);
        bg.setFont(myFont1);
        panel.add(bg);

        bgfield = new JTextField();
        bgfield.setBounds(190, 125, 100, 50);
        bgfield.setFont(myFont1);
        panel.add(bgfield);

        unit = new JLabel("Quantity : ");
        unit.setBounds(50, 210, 200, 30);
        unit.setFont(myFont1);
        panel.add(unit);

        unitf = new JTextField();
        unitf.setBounds(140, 215, 100, 30);
        unitf.setFont(myFont1);
        panel.add(unitf);

        add = new JButton("Remove Blood");
        add.setBounds(250, 300, 200, 30);
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
            BI b1 = new BI();
            b1.setVisible(true);
            this.setVisible(false);
        }

        else if (ae.getSource() == add) {

            String bg = bgfield.getText();
            String un = unitf.getText();

            if (bg.isEmpty() || un.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill All");
            } else {

                JOptionPane.showMessageDialog(null, "Sucessfully Deleted");

            }
        }
    }

    public static void main(String[] args) {
        RmvB r1 = new RmvB();
        r1.setVisible(true);
    }
}

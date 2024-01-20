package Swingg.Jpanel;

import javax.swing.*;
import java.awt.*;

class First extends JFrame
{
    JPanel panel,panel1;
    public First()
    {
        Container c=getContentPane();
        c.setLayout(null);
        panel=new JPanel();
        panel.setBounds(50,50,300,500);
        panel.setLayout(null);
        c.add(panel);
        panel.setBackground(Color.BLUE);

        panel1=new JPanel();
        panel1.setBounds(0,0,100,200);
        c.add(panel1);
        panel1.setBackground(Color.PINK);

        JButton b1=new JButton("Submit");
        panel1.add(b1);
        panel.add(panel1);

    }
}

public class Demo {
    public static void main(String[] args) {
       First c1=new First();
        c1.setVisible(true);
        c1.setTitle("Panel Demo");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,800);

    }
}

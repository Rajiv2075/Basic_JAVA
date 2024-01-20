package Swingg;

import javax.swing.*;
import java.awt.*;
class Comp5 extends JFrame
{
    JCheckBox g1,g2,g3;
    public Comp5()
    {
        g1=new JCheckBox("Male",true);
        g2=new JCheckBox("Female");
        g3=new JCheckBox("Others");
        Container c=getContentPane();
        c.setLayout(null);
        c.add(g1);
        c.add(g2);
        c.add(g3);
        //g1.setBounds(220,30,150,150);
        //g1.setLocation(220,80);
        g1.setSize(200,300);
        g2.setBounds(420,30,150,150);
        g3.setBounds(460,300,150,150);
        g1.setBackground(Color.BLUE);
        g2.setBackground(Color.yellow);

        g3.setBackground(Color.green);
        ButtonGroup bg=new ButtonGroup();
        bg.add(g1);
        bg.add(g2);
        bg.add(g3);
    }
}

public class Test5 {
    public static void main(String[] args) {
        Comp5 z=new Comp5();
        z.setTitle("My Check Button");
        z.setBounds(100, 50, 595, 840);
        z.setVisible(true);
        z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
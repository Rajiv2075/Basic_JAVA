package Swingg;

import javax.swing.*;
import java.awt.*;

class Comp6 extends JFrame
{
    JRadioButton g1,g2,g3;
    public Comp6()
    {
            g1=new JRadioButton("Male", true);
            g2=new JRadioButton("Female");
            g3=new JRadioButton("Others");
            Container c=getContentPane();
            c.setLayout(null);
            c.add(g1);
            c.add(g2);
            c.add(g3);
            g1.setBounds(220,30,150,150);
            g2.setBounds(420,30,150,150);
            g3.setBounds(620,30,150,150);
            ButtonGroup bg=new ButtonGroup();
            bg.add(g1);
            bg.add(g2);
            bg.add(g3);



    }
}

public class Test6 {
    public static void main(String[] args) {
        Comp6 z=new Comp6();
        z.setTitle("My Radio Button");
        z.setBounds(100, 50, 700, 800);
        z.setVisible(true);
        z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

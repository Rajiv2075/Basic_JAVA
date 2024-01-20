package Swingg.Layout;

import javax.swing.*;
import java.awt.*;

class Lay extends JFrame
{
    JButton r1,r2,r3,r4,r5;

    public Lay()
    {
        BorderLayout bg=new BorderLayout(20,10);
        Container c=getContentPane();
        c.setLayout(bg);
        r1=new JButton("Button 1");
        r2=new JButton("Button 2");
        r3=new JButton("Button 3");
        r4=new JButton("Button 4");
        r5=new JButton("Button 5");

//        c.add(r1,BorderLayout.NORTH);
//        c.add(r2,BorderLayout.SOUTH);
//        c.add(r3,BorderLayout.EAST);
//        c.add(r4,BorderLayout.WEST);
//        c.add(r5,BorderLayout.CENTER);

        c.add(r1,BorderLayout.PAGE_START);
        c.add(r2,BorderLayout.PAGE_END);
        c.add(r3,BorderLayout.LINE_START);
        c.add(r4,BorderLayout.LINE_END);
        c.add(r5,BorderLayout.CENTER);

    }
}
public class Border {
    public static void main(String[] args) {
        Lay c1=new Lay();
        c1.setVisible(true);
        c1.setTitle("Border Layout");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);
    }
}

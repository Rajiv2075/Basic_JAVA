package Swingg.Layout;

import javax.swing.*;
import java.awt.*;

class Null extends JFrame
{
    JButton r1,r2,r3,r4,r5;
    public Null()
    {
        Container c=getContentPane();
        c.setLayout(null);

        r1=new JButton("Button 1");
        r2=new JButton("Button 2");
        r3=new JButton("Button 3");
        r4=new JButton("Button 4");
        r5=new JButton("Button 5");


        r1.setBounds(50,50,100,50);
        c.add(r1);

        r2.setBounds(200,50,100,50);
        c.add(r2);

        r3.setBounds(350,50,100,50);
        c.add(r3);

        r4.setBounds(50,150,100,50);
        c.add(r4);

        r5.setBounds(250,150,100,50);
        c.add(r5);
    }
}

public class First {
    public static void main(String[] args) {
        Null c1=new Null();
        c1.setVisible(true);
        c1.setTitle("Window Listener");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);

    }
}

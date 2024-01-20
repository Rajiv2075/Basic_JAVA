package Swingg.Layout;

import javax.swing.*;
import java.awt.*;

class Lay4 extends JFrame
{
    JButton r1,r2,r3,r4,r5;

    public Lay4()
    {
        GridLayout gl=new GridLayout(3,2);
        GridLayout g2=new GridLayout();
        GridLayout g3=new GridLayout(3,2,20,10);

        Container c=getContentPane();
        c.setLayout(gl);

        gl.setHgap(20);
        gl.setVgap(10);

        r1=new JButton("Button 1");
        r2=new JButton("Button 2");
        r3=new JButton("Button 3");
        r4=new JButton("Button 4");
        r5=new JButton("Button 5");

        c.add(r1);
        c.add(r2);
        c.add(r3,0);
        c.add(r4);
        c.add(r5);
    }
}

public class Grid {
    public static void main(String[] args) {
        Lay4 c1=new Lay4();
        c1.setVisible(true);
        c1.setTitle("Flow Layout");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);

    }
}

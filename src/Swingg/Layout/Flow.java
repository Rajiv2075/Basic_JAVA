package Swingg.Layout;

import javax.swing.*;
import java.awt.*;

class Third extends JFrame
{
    JButton r1,r2,r3,r4,r5;
    public Third()
    {
       // FlowLayout fg=new FlowLayout(FlowLayout.RIGHT);
        FlowLayout fg=new FlowLayout(FlowLayout.RIGHT,10,20);

//        fg.setHgap(20);
//        fg.setVgap(10);

        Container c=getContentPane();
        c.setLayout(fg);
        r1=new JButton("Button 1");
        r2=new JButton("Button 2");
        r3=new JButton("Button 3");
        r4=new JButton("Button 4");
        r5=new JButton("Button 5");

        c.add(r1);
        c.add(r2);
        c.add(r3,0);
        c.add(r4,0);
        c.add(r5);

    }
}

public class Flow {
    public static void main(String[] args) {
        Third c1=new Third();
        c1.setVisible(true);
        c1.setTitle("Flow Layout");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);

    }
}

package Swingg.Layout;

import javax.swing.*;
import java.awt.*;

class Lay7 extends JFrame
{
        JButton r1,r2,r3,r4,r5;
    public Lay7()
    {
        Container con=getContentPane();
        BoxLayout bg=new BoxLayout(con,BoxLayout.Y_AXIS);
        con.setLayout(bg);

        r1=new JButton("Button 1");
        r2=new JButton("Button 2");
        r3=new JButton("Button 3");
        r4=new JButton("Button 4");
        r5=new JButton("Button 5");

        con.add(r1);
        con.add(r2);
        con.add(r3);
        con.add(r4);
        con.add(r5);

        r1.setAlignmentX(Component.CENTER_ALIGNMENT);
  //      con.add(Box.createRigitArea(new Dimension(0,80)));
        r3.setAlignmentX(Component.CENTER_ALIGNMENT);
        r4.setAlignmentX(Component.CENTER_ALIGNMENT);
        r5.setAlignmentX(Component.CENTER_ALIGNMENT);


    }
}

public class Box {
    public static void main(String[] args) {
        Lay7 c1=new Lay7();
        c1.setVisible(true);
        c1.setTitle("Box Layout");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}

package Swingg.Layout;

import javax.swing.*;
import java.awt.*;

class Lay5 extends JFrame
{
    JButton r1,r2,r3,r4,r5;
    public Lay5()
    {
        GridBagLayout gb=new GridBagLayout();

        GridBagConstraints gc=new GridBagConstraints();
        gc.fill=GridBagConstraints.HORIZONTAL;


        Container c=getContentPane();
        c.setLayout(gb);


        r1=new JButton("Button 1");
        r2=new JButton("Button 2");
        r3=new JButton("Button 3");
        r4=new JButton("Button 4");
        r5=new JButton("Button 5");

        gc.anchor=GridBagConstraints.NORTH;
        gc.weightx=0.5;
       gc.gridx=0;
       gc.gridy=0;
       c.add(r1,gc);

        gc.anchor=GridBagConstraints.NORTH;
        gc.weightx=0.5;
        gc.gridx=1;
        gc.gridy=0;
        c.add(r2,gc);

        gc.anchor=GridBagConstraints.NORTH;
        gc.weightx=0.5;
        gc.gridx=2;
        gc.gridy=0;
        c.add(r3,gc);

        gc.weightx=0.5;
        gc.gridwidth=3;
        gc.ipady=40;
        gc.gridx=0;
        gc.gridy=1;
        c.add(r4,gc);

        gc.ipady=0;
        gc.gridx=1;
        gc.gridy=2;
        gc.gridwidth=2;
        gc.anchor=GridBagConstraints.PAGE_END;
        gc.weighty=1;
        c.add(r5,gc);

        pack();
    }

}

public class BagGrid {
    public static void main(String[] args) {
        Lay5 c1=new Lay5();
        c1.setVisible(true);
        c1.setTitle("GridBag Layout");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}

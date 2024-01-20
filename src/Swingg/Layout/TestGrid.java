package Swingg.Layout;

import javax.swing.*;
import java.awt.*;
class A extends JFrame {
    JLabel lname,lage,lgender;
    JTextField tname,tage,tgender;
    JButton bok,bcancel;
    GridBagLayout gbc;
    GridBagConstraints g1;
    public A()  {
        gbc=new GridBagLayout();
        setLayout(gbc);
        g1=new GridBagConstraints();
        g1.insets=new Insets(10,10,10,10);
        g1.fill=GridBagConstraints.BOTH;

        g1.anchor=GridBagConstraints.NORTH;
        lname=new JLabel("Name");
        this.add(lname,g1);
        g1.gridy=0;
        g1.gridx=0;
        g1.gridwidth=1;
        g1.gridheight=1;

        g1.anchor=GridBagConstraints.NORTH;
        tname=new JTextField(5);
        this.add(tname,g1);
        g1.gridy=0;
        g1.gridx=3;
        g1.gridwidth=1;
        g1.gridheight=1;

        lage=new JLabel("Age");
        add(lage,g1);
        g1.gridy=1;
        g1.gridx=0;
        g1.gridwidth=1;
        g1.gridheight=1;

        tage=new JTextField(3);
        add(tage,g1);
        g1.gridy=1;
        g1.gridx=1;
        g1.gridwidth=1;
        g1.gridheight=1;
//        lgender=new JLabel("Gender");
//        add(lgender,g1);
//        g1.gridy=2;
//        g1.gridx=0;
//        g1.gridwidth=1;
//        g1.gridheight=1;
//
//        tgender=new JTextField(10);
//        add(tgender,g1);
//        g1.gridy=2;
//        g1.gridx=1;
//        g1.gridwidth=1;
//        g1.gridheight=1;

        pack();
    }
}

public class TestGrid  {
    public static void main(String args[])   {
        A a=new A();
        a.setVisible(true);
        a.setSize(400,600);
        // a.setBounds(150,100,175,125);
        a.setTitle("my frame");
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
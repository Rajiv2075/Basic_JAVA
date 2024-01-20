package Swingg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event4 {
    public  static Container c;
    public static void main(String[] args) {
        JFrame frame=new JFrame("Event 4");
        frame.setVisible(true);
        frame.setTitle("Button event 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,600);
        c=frame.getContentPane();
        c.setLayout(null);

        JButton bt1=new JButton("Red");
        JButton bt2=new JButton("Green");
        JButton bt3=new JButton("Blue");

        bt1.setBounds(50,50,100,40);
        bt2.setBounds(250,50,100,40);
        bt3.setBounds(450,50,100,40);

        c.add(bt1);
        c.add(bt2);
        c.add(bt3);

        bt1.addActionListener(new Bt1());
        bt2.addActionListener(new Bt2());
        bt3.addActionListener(new Bt3());

    }
}

class Bt1 implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        Event4.c.setBackground(Color.red);
    }
}

class Bt2 implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        Event4.c.setBackground(Color.green);
    }
}

class Bt3 implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        Event4.c.setBackground(Color.BLUE);
    }
}
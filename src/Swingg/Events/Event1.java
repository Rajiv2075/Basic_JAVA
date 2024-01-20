package Swingg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame1 extends JFrame implements ActionListener
{
    Container c;
    JButton bt1=new JButton("Red");
    JButton bt2=new JButton("Green");
    JButton bt3=new JButton("Blue");

    public MyFrame1()
    {
        c=this.getContentPane();
        c.setLayout(null);

        bt1.setBounds(50,50,100,40);
        bt2.setBounds(250,50,100,40);
        bt3.setBounds(450,50,100,40);

        c.add(bt1);
        c.add(bt2);
        c.add(bt3);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);

        Cursor c=new Cursor(Cursor.HAND_CURSOR);
        bt1.setCursor(c);
        bt2.setCursor(c);
        bt3.setCursor(c);

    }
    public  void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1){
            c.setBackground(Color.red);
        } else if (e.getSource()==bt2) {
            c.setBackground(Color.GREEN);
        }else
            c.setBackground(Color.BLUE);
    }
}
public class Event1 {
    public static void main(String[] args) {
        MyFrame1 m1 = new MyFrame1();
        m1.setVisible(true);
        m1.setTitle("Button event");
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m1.setBounds(100,100,1000,600);
    }
}
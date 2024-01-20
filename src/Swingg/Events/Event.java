package Swingg;

 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends JFrame implements ActionListener
{
    Container c;
    JButton bt;
     public MyFrame()
    {
        c=this.getContentPane();
        c.setLayout(null);
        bt=new JButton("Submit");
        bt.setBounds(50,50,100,40);
        c.add(bt);
        bt.addActionListener(this);
        Cursor c=new Cursor(Cursor.HAND_CURSOR);
        bt.setCursor(c);
    }
    public  void actionPerformed(ActionEvent e)
    {
        c.setBackground(Color.red);
    }
}
public class Event  {
    public static void main(String[] args) {
        MyFrame m1 = new MyFrame();
        m1.setVisible(true);
        m1.setTitle("Button event");
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m1.setBounds(100,100,1000,600);
    }
}
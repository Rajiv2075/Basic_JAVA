package Swingg.ActionList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Action1 extends JFrame implements ActionListener
{
   Container c;
   JButton b;
   public Action1()
   {
       c=this.getContentPane();
       c.setLayout(null);
       b=new JButton("Submit");
       b.setBounds(100,100,100,40);
       c.add(b);

       b.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
       String  str=b.getText();
       b.setText(str.toUpperCase());
   }
}

public class ActionR1 {
    public static void main(String[] args) {
        Action1 a1=new Action1();
        a1.setVisible(true);
        a1.setTitle("Button event");
        a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a1.setBounds(100,100,1000,600);
    }
}


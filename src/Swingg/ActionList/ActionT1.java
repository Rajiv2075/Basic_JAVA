package Swingg.ActionList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Action2 extends JFrame implements ActionListener
{
    Container c;
    JTextField t;
    public Action2()
    {
        c=this.getContentPane();
        c.setLayout(null);
        t=new JTextField();
        t.setBounds(100,100,200,80);
        c.add(t);

        t.setFont(new Font("Arial",Font.BOLD,24));

        t.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String  str=t.getText();
        t.setText(str.toUpperCase());
    }
}

public class ActionT1 {
    public static void main(String[] args) {
        Action2 a1=new Action2();
        a1.setVisible(true);
        a1.setTitle("Button event");
        a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a1.setBounds(100,100,1000,600);
    }
}


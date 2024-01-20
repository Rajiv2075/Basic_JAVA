
package Swingg.SmallPro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myfame extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t;
    JPasswordField p;
   JButton r;
    public Myfame()
    {

        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,1000,600);
         Container c=getContentPane();
        c.setLayout(null);

        l1=new JLabel("USERNAME: ");
        l1.setBounds(200,200,350,50);
        c.add(l1);

        t=new JTextField();
        t.setBounds(600,200,350,50);
        c.add(t);

        l2=new JLabel("PASSWORD: ");
        l2.setBounds(200,300,350,50);
        c.add(l2);

        p=new JPasswordField();
        p.setBounds(600,300,350,50);
        c.add(p);

        r=new JButton("Submit");
        r.setBounds(300,550,230,50);
        c.add(r);


        Cursor cr=new Cursor(Cursor.HAND_CURSOR);
        r.setCursor(cr);

        Font fo=new Font("Arial Black",Font.ITALIC,30);
        l1.setFont(fo);
        l2.setFont(fo);
        r.setFont(fo);

        r.addActionListener(this);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Username: "+t.getText());
        System.out.println("Password: "+p.getPassword());
    }
}

public class Login {
    public static void main(String[] args) {
        Myfame fame=new Myfame();
    }
}

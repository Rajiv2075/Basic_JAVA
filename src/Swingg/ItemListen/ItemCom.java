package Swingg.ItemListen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ItemA1 extends JFrame implements ItemListener
{
    JTextArea a;
    JRadioButton r1,r2,r3;
    public ItemA1()
    {
        Container c=getContentPane();
        c.setLayout(null);

        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        r3=new JRadioButton("Others");

        r1.setBounds(50,50,100,30);
        r2.setBounds(150,50,100,30);
        r3.setBounds(250,50,100,30);

        c.add(r1);
        c.add(r2);
        c.add(r3);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r3);

        a=new JTextArea();
        a.setBounds(350,30,300,400);
        c.add(a);

        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);

    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==r1)
        {
            a.setText("Male");
        }
        if(e.getSource()==r2)
        {
            a.setText("Female");
        }
        if(e.getSource()==r3)
        {
            a.setText("Others");
        }
    }

}
public class ItemCom {
    public static void main(String[] args) {
        ItemA1 c1=new ItemA1();
        c1.setVisible(true);
        c1.setTitle("Button event");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);

    }
}

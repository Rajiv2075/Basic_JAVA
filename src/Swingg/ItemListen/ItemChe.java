package Swingg.ItemListen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Item3 extends JFrame implements ItemListener
{
    JTextArea a;
    JCheckBox a1,a2,a3,a4;

    public Item3()
    {

        Container c=getContentPane();
        c.setLayout(null);

        a1=new JCheckBox("10th");
        a2=new JCheckBox("12th");
        a3=new JCheckBox("Graduate");
        a4=new JCheckBox("Post-Graduate");

        a1.setBounds(50,50,100,30);
        a2.setBounds(150,50,100,30);
        a3.setBounds(250,50,100,30);
        a4.setBounds(350,50,150,30);

        c.add(a1);
        c.add(a2);
        c.add(a3);
        c.add(a4);

        a1.addItemListener(this);
        a2.addItemListener(this);
        a3.addItemListener(this);
        a4.addItemListener(this);




        a=new JTextArea();
        a.setBounds(650,30,200,300);
        c.add(a);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(a1.isSelected()){
            a.setText("");
            a.setText("10th");
        }if(a2.isSelected()){
        a.setText(a.getText()+"\n"+"12th");
    }if(a3.isSelected()){
        a.setText(a.getText()+"\n"+"Graduate");
    }if(a4.isSelected()){
        a.setText(a.getText()+"\n"+"Post-Graduate");

    }
    }
}

public class ItemChe {
    public static void main(String[] args) {
        Item3 c1=new Item3();
        c1.setVisible(true);
        c1.setTitle("Button event");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);

    }
}

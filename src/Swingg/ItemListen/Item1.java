package Swingg.ItemListen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Combo extends JFrame implements ItemListener
{
    JComboBox com;
    JTextArea a;
    public Combo(){
        Container c=getContentPane();
        c.setLayout(null);
        String [] str={"A","B","C","D"};
        com=new JComboBox(str);
        com.setBounds(10,10,100,30);
        c.add(com);

        a=new JTextArea();
        a.setBounds(150,30,300,400);
        c.add(a);

        com.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        String  str=com.getSelectedItem().toString();
       a.setText(str);
    }
}
public class Item1 {
    public static void main(String[] args) {
        Combo c1=new Combo();
        c1.setVisible(true);
        c1.setTitle("Button event");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);

    }

}

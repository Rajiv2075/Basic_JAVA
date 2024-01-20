package Swingg.ItemListen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Item4 extends JFrame implements ItemListener
{
    JMenuBar bar;
    JMenu menu;
    JCheckBoxMenuItem c1;
    JTextArea a;
    public Item4()
    {
        Container c=getContentPane();
        c.setLayout(null);

        bar=new JMenuBar();
        menu=new JMenu("File");

        c1=new JCheckBoxMenuItem("Print");
        menu.add(c1);
        bar.add(menu);
        this.setJMenuBar(bar);

        c1.addItemListener(this);
        a=new JTextArea();
        a.setBounds(650,30,200,300);
        c.add(a);

    }
    public void itemStateChanged (ItemEvent e)
    {
        if(c1.isSelected())
        {
            a.setText("Printing is ON.");
        }else {
            a.setText("Printing is OFF.");
        }
    }
}

public class ItemMenu {
    public static void main(String[] args) {
        Item4 c1=new Item4();
        c1.setVisible(true);
        c1.setTitle("Button event");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);

    }
}

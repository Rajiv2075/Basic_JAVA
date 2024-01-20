package Swingg.Pane;

import javax.swing.*;
import java.awt.*;

class Pane1 extends JFrame
{

    public Pane1()
    {
    //    this.setLayout(new FlowLayout());
          this.setLayout(null);
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(50,50,200,200);
        this.add(tp);

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();

        p1.add(new JLabel("First Page."));
        p2.add(new JLabel("Second Page."));
        p3.add(new JLabel("Third Page."));

        tp.add("First",p1);
        tp.add("Second",p2);
        tp.add("Third",p3);
    }
}

public class Tab {
    public static void main(String[] args) {
        Pane1 c1=new Pane1();
        c1.setVisible(true);
        c1.setTitle("JTabbed Pane");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}

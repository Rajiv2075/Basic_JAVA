package Swingg.Pane;

import javax.swing.*;

class Pane2 extends JFrame
{

    public Pane2()
    {
        JButton r1=new JButton("Left");
        JButton r2=new JButton("Right");

        JSplitPane sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        sp.setTopComponent(r1);
        sp.setBottomComponent(r2);

        sp.setDividerSize(10);
        sp.setDividerLocation(100);
        sp.setOneTouchExpandable(true);
        add(sp);

        validate();

    }
}

public class Split {
    public static void main(String[] args) {
        Pane2 c1=new Pane2();
        c1.setVisible(true);
        c1.setTitle("JSplit  Pane");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}

package Swingg;

import javax.swing.*;
import java.awt.*;

public class JRadio {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,600);
        Container c=frame.getContentPane();
        c.setLayout(null);

        JRadioButton g1=new JRadioButton("Male", true);
        JRadioButton g2=new JRadioButton("Female");
        JRadioButton g3=new JRadioButton("Others");
        c.setLayout(null);
        c.add(g1);
        c.add(g2);
        c.add(g3);
        g1.setBounds(200,30,180,100);
        g2.setBounds(400,30,180,100);
        g3.setBounds(600,30,180,100);

        ButtonGroup bg=new ButtonGroup();
        bg.add(g1);
        bg.add(g2);
        bg.add(g3);

        g2.setSelected(true);
        g2.setEnabled(false);
    }
}

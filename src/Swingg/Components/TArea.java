package Swingg;

import javax.swing.*;
import java.awt.*;

public class TArea {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,600);
        Container c=frame.getContentPane();
        c.setLayout(null);

        JTextArea t=new JTextArea();
        t.setBounds(50,50,400,200);
        c.add(t);
        t.setLineWrap(true);

    }
}

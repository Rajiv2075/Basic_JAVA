package Swingg;

import javax.swing.*;
import java.awt.*;

public class Buton {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setTitle("Button event");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,600);
        Container c=frame.getContentPane();
        c.setLayout(null);
        JRadioButton g3=new JRadioButton("Others");
        c.add(g3);
        g3.setBounds(200,30,180,100);

        Font font=new Font("Algerian",Font.ITALIC,30);
        g3.setFont(font);
        c.add(g3);

    }

}

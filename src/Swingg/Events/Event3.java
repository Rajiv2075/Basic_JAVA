package Swingg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event3 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setTitle("Button event 3");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,1000,600);

        Container c=f.getContentPane();
        c.setLayout(null);

        JButton btn=new JButton("Suubmit");
        btn.setBounds(100,50,100,70);
        c.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.BLUE);
            }
        });

    }
}

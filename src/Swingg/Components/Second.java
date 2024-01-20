package Swingg;

import javax.swing.*;
import java.awt.*;

public class Second {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,600);
        Container c=frame.getContentPane();
        c.setLayout(null);
        JLabel label=new JLabel("Rajiv kumar");
        label.setForeground(Color.BLUE);
        label.setBounds(100,50,500,100);
      //  label.setText("Hello");

        Font font=new Font("Algerian",Font.ITALIC,30);
        label.setFont(font);
        c.add(label);

        ImageIcon im=new ImageIcon("download.png");
        JLabel la=new JLabel(im);
        la.setBounds(200,40,500,600);
        c.add(la);

    }
}

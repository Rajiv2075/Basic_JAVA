package Swingg.Layout;

import javax.swing.*;
import java.awt.*;

class Lay6 extends JFrame
{
    JButton r1,r2,r3,r4,r5;
    public Lay6()
    {
        Container container=getContentPane();

        CardLayout card=new CardLayout();
        container.setLayout(card);

        r1=new JButton("Button 1");
        r2=new JButton("Button 2");
        r3=new JButton("Button 3");
        r4=new JButton("Button 4");
        r5=new JButton("Button 5");
     //   JLabel lab=new JLabel("Hello");

       // container.add(lab,"0");
          container.add(r1,"1");
        container.add(r2,"2");
        container.add(r3,"3");
        container.add(r4,"4");
        container.add(r5,"5");

        card.next(container);
        card.previous(container);
        card.last(container);
        card.first(container);
        card.first(container);
        card.show(container,"3");


    }
}

public class Card {
    public static void main(String[] args) {
        Lay6 c1=new Lay6();
        c1.setVisible(true);
        c1.setTitle("Card Layout");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}

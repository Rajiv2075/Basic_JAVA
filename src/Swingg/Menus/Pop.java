package Swingg.Menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class  Mennu extends JFrame implements ActionListener
{
    JPopupMenu pm;
    JMenuItem m1,m2,m3;
    Container c=getContentPane();
    public Mennu()
    {
        c.setLayout(new FlowLayout());


        pm=new JPopupMenu("Menu");

        m1=new JMenuItem("Item 1");
        m2=new JMenuItem("Item 2");
        m3=new JMenuItem("Item 3");

        pm.add(m1);
        pm.add(m2);
        pm.add(m3);

        c.add(pm);

        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);


        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) { // Right mouse button
                    pm.show(Mennu.this, e.getX(), e.getY());
                }
            }
        });

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==m1)
        {
            System.out.println("Item 1 is selected.");
        } else if (e.getSource()==m2)
        {
            System.out.println("Item 2 is selected.");
        }else if(e.getSource()==m3)
        {
            System.out.println("Item 3 is selected.");
        }

    }
}

public class Pop {
    public static void main(String[] args) {
        Mennu c1=new Mennu();
        c1.setVisible(true);
        c1.setTitle("Message Dialog");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);


    }
}

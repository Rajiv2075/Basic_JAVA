package SwingSir;

import javax.swing.*;
import java.awt.*;

class Test2 extends JFrame
{
    JPanel p1,p2,p3;
    JLabel l1,l2,l3;
    public Test2()
    {
        BorderLayout bg=new BorderLayout();
        setLayout(bg);

        l1=new JLabel("Project Name : ");
        l2=new JLabel();
        l3=new JLabel("Design By: ");



        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();

        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);

        p1.setBackground(Color.YELLOW);
        p2.setBackground(Color.PINK);
        p3.setBackground(Color.CYAN);


        p1.add(l1);
        p2.add(l2);
        p3.add(l3);


    }
}

public class Border {
    public static void main(String[] args) {
        Test2 c1=new Test2();
        c1.setVisible(true);
        c1.setTitle("Border Layout");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);
    }
}

package SwingSir;

import javax.swing.*;
import java.awt.*;

class Comp1 extends JFrame
{
    JLabel l1,l2,l3,l4,l5;
    public Comp1()
    {
        Container c=getContentPane();
        BorderLayout br=new BorderLayout();

        l1=new JLabel("First");
        l2=new JLabel("second");
        l3=new JLabel("Third");
        l4=new JLabel("Fourth");
        l5=new JLabel("Fifth");

        add(l1,BorderLayout.NORTH);
        add(l2,BorderLayout.SOUTH);
        add(l3,BorderLayout.WEST);
        add(l4,BorderLayout.EAST);
        add(l5,BorderLayout.CENTER);


    }
}
public class Test1 {
    public static void main(String[] args) {
        Comp1 c1=new Comp1();
        c1.setVisible(true);
        c1.setSize(400,600);
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

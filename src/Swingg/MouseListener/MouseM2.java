package Swingg.MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class MouseMotion extends JFrame implements MouseMotionListener
{
    JTextArea a;
    JLabel l;
    public MouseMotion()
    {
        Container c=getContentPane();
        c.setLayout(null);

        a=new JTextArea();
        a.setBounds(330,30,300,400);
        c.add(a);

        l=new JLabel("Enter ");
        l.setBounds(40,40,150,50);
        l.setFont(new Font("Arial",Font.BOLD,20));
        l.addMouseMotionListener(this);
        c.add(l);
    }
    public void mouseMoved(MouseEvent e)
    {
        a.setText(a.getText()+"\n"+"Mouse is Moved: ");

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        a.setText(a.getText()+"\n"+"Mouse is Dragged: ");

    }

}
public class MouseM2 {
    public static void main(String[] args) {
        MouseMotion c1=new MouseMotion();
        c1.setVisible(true);
        c1.setTitle("Button event");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);

    }
}

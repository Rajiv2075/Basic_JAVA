package Swingg.MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class First extends JFrame implements MouseListener
{
    JTextArea a;
    JLabel l;
    public First()
    {
        Container c=getContentPane();
        c.setLayout(null);

        a=new JTextArea();
        a.setBounds(330,30,300,400);
        c.add(a);

        l=new JLabel("Enter ");
        l.setBounds(40,40,150,50);
        l.setFont(new Font("Arial",Font.BOLD,20));
        l.addMouseListener(this);
        c.add(l);
    }
    public void mouseEntered(MouseEvent e)
    {
        a.setText(a.getText()+"\n"+"Mouse is Entered: ");

    }
    public void mouseExited(MouseEvent e)
    {
        a.setText(a.getText()+"\n"+"Mouse is Exited: ");

    }public void mousePressed(MouseEvent e)
    {
        a.setText(a.getText()+"\n"+"Mouse is Pressed: ");

    }public void mouseClicked(MouseEvent e)
    {
        a.setText(a.getText()+"\n"+"Mouse is Clicked: ");

     }public void mouseReleased(MouseEvent e)
    {
        a.setText(a.getText()+"\n"+"Mouse is Released: ");

    }

}
public class Mouse1 {
    public static void main(String[] args) {
        First c1=new First();
        c1.setVisible(true);
        c1.setTitle("Button event");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);

    }
}

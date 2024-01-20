package Swingg.MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
class Focus extends JFrame implements java.awt.event.FocusListener
{
    JTextArea a;
    JTextField l;
    public Focus()
    {
        Container c=getContentPane();
        c.setLayout(null);

        a=new JTextArea();
        a.setBounds(330,30,300,400);
        c.add(a);

        l=new JTextField();
        l.setBounds(40,40,150,50);
    //    l.setFont(new Font("Arial",Font.BOLD,20));
        l.addFocusListener(this);
        c.add(l);
    }
    public void focusGained(FocusEvent e)
    {
        a.setText(a.getText()+"\n"+"Focus is Gained: ");

    }
    public  void focusLost(FocusEvent e)
    {
        a.setText(a.getText()+"\n"+"Focus is lost: ");

    }

}
public class FocusListener {
    public static void main(String[] args) {
        Focus c1=new Focus();
        c1.setVisible(true);
        c1.setTitle("Button event");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);

    }
}

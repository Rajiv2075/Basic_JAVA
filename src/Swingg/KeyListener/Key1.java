package Swingg.KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class First extends JFrame implements KeyListener
{
    JTextArea a;
    public First()
    {
        Container c=getContentPane();
        c.setLayout(null);

        a=new JTextArea();
        a.setBounds(330,30,300,400);
        c.add(a);

        a.addKeyListener(this);

    }
    public void keyPressed(KeyEvent e){
        a.setText(a.getText()+"\n"+"Key is pressed: "+e.getKeyChar());
    }
    public void keyReleased(KeyEvent e){
        a.setText(a.getText()+"\n"+"Key is Released: "+e.getKeyChar());

    }
    public void keyTyped(KeyEvent e){
        a.setText(a.getText()+"\n"+"Key is Typed: "+e.getKeyChar());

    }
}

public class Key1 {
    public static void main(String[] args) {
        First c1=new First();
        c1.setVisible(true);
        c1.setTitle("Button event");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);

    }
}

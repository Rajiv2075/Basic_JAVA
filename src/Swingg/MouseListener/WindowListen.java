package Swingg.MouseListener;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Window extends JFrame implements WindowListener
{
    public Window()
    {
        this.addWindowListener(this);
    }
    public void windowOpened(WindowEvent e)
    {
        System.out.println("Window is opening");
    }
    public void windowClosing(WindowEvent e)
    {
        System.out.println("Window is closing");
    }
    public void windowClosed(WindowEvent e)
    {
        System.out.println("Window is closed");
    }
    public void windowActivated(WindowEvent e)
    {
        System.out.println("Window is activated");
    }
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Window is de-activated");
    }
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Window is Minimize");
    }
    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Window is Maximise");
    }

}

public class WindowListen {
    public static void main(String[] args) {
        Window c1=new Window();
        c1.setVisible(true);
        c1.setTitle("Window Listener");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);

    }
}

package Swingg.MouseListener;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

class Caret extends JFrame implements CaretListener
{
    JTextArea a;
    JTextField l;
    public Caret()
    {
        Container c=getContentPane();
        c.setLayout(null);

        a=new JTextArea();
        a.setBounds(330,30,300,400);
        c.add(a);

        l=new JTextField();
        l.setBounds(40,40,150,50);
        //    l.setFont(new Font("Arial",Font.BOLD,20));
        l.addCaretListener(this);
        c.add(l);
    }
    public void caretUpdate(CaretEvent e)
    {
        a.setText(a.getText()+"\n"+"Caret is Updated: "+e.getDot());
    }
}
public class CaretListen {
    public static void main(String[] args) {
        Caret c1=new Caret();
        c1.setVisible(true);
        c1.setTitle("Button event");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,1000,600);

    }
}


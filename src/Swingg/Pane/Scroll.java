package Swingg.Pane;
import javax.swing.*;
import java.awt.*;

class Pane extends JFrame
{
    JTextArea t;
    public Pane()
    {
       this.setLayout(new FlowLayout());

     //   this.setLayout(null);

        t=new JTextArea(8,12);
   //    this.add(t);

        JScrollPane sp=new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(sp);

    }
}

public class Scroll {
    public static void main(String[] args) {
        Pane c1=new Pane();
        c1.setVisible(true);
        c1.setTitle("Message Dialog");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}

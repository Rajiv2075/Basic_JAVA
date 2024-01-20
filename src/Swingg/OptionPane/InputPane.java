package Swingg.OptionPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Pane extends JFrame implements ActionListener
{

    public Pane()
    {
        this.setLayout(new FlowLayout());

        JButton r1=new JButton("Sumit");
        this.add(r1);

        r1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String str=JOptionPane.showInputDialog("Enter your name: ");
        if(str.length()>0)
        {
            System.out.println("User Name : "+str);
        }
    }
}

public class InputPane {
    public static void main(String[] args) {
       Pane c1=new Pane();
        c1.setVisible(true);
        c1.setTitle("Input Dialog");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}

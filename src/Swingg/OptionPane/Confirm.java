package Swingg.OptionPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Pane2 extends JFrame
{
    JButton r1,r2,r3;
    public Pane2()
    {
        this.setLayout(new FlowLayout());
        r1=new JButton("Submit");
        this.add(r1);
        r1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sel=JOptionPane.showConfirmDialog(Pane2.this, "Are you sure to terminate the program ?","Message", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if (sel==JOptionPane.YES_OPTION)
                {
                    System.out.println("Yes option is selected.");
                    System.exit(0);
                }
               else if (sel==JOptionPane.NO_OPTION)
                {
                    System.out.println("No option is selected.");
                }else {
                    System.out.println("Cancel is selected.");
                }

            }
        });
    }
}

public class Confirm {
    public static void main(String[] args) {
        Pane2 c1=new Pane2();
        c1.setVisible(true);
        c1.setTitle("Message Dialog");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}

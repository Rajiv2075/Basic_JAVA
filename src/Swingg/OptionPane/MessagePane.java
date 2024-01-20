package Swingg.OptionPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Pane1 extends JFrame implements ActionListener
{
    JButton r1,r2,r3,r4,r5;
    public Pane1()
    {
        this.setLayout(new FlowLayout());

         r1=new JButton("Plain");
        this.add(r1);
        r1.addActionListener(this);

         r2=new JButton("Information");
        this.add(r2);
        r2.addActionListener(this);


        r3=new JButton("Question");
        this.add(r3);
        r3.addActionListener(this);


         r4=new JButton("Error");
        this.add(r4);
        r4.addActionListener(this);


        r5=new JButton("Warning");
        this.add(r5);
        r5.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== r1)
        {
            JOptionPane.showMessageDialog(this, "This is a Plain Text.", "Message", JOptionPane.PLAIN_MESSAGE);
        }
        else if(e.getSource()==r2){
        JOptionPane.showMessageDialog(this, "This is a Information Text.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==r3){
        JOptionPane.showMessageDialog(this, "This is a Question Text.", "Message", JOptionPane.QUESTION_MESSAGE);
         }
          else if(e.getSource()==r4){
        JOptionPane.showMessageDialog(this, "This is a Error Text.", "Message", JOptionPane.ERROR_MESSAGE);
          }
          else{
          JOptionPane.showMessageDialog(this, "This is a Warning Text.", "Message", JOptionPane.WARNING_MESSAGE);
           }
    }


}

public class MessagePane {
    public static void main(String[] args) {
        Pane1 c1=new Pane1();
        c1.setVisible(true);
        c1.setTitle("Message Dialog");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}


//    public Pane1()
//    {
//        this.setLayout(new FlowLayout());
//
//        JButton r1=new JButton("Plain");
//        this.add(r1);
//        r1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(Pane1.this,"This is a Plain Text.","Message",JOptionPane.PLAIN_MESSAGE);
//            }
//        });
//
//        JButton r2=new JButton("Information");
//        this.add(r2);
//        r2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(Pane1.this,"This is a Information Text.","Message",JOptionPane.INFORMATION_MESSAGE);
//            }
//        });
//
//        JButton r3=new JButton("Question");
//        this.add(r3);
//        r3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(Pane1.this,"This is a Question Text.","Message",JOptionPane.QUESTION_MESSAGE);
//            }
//        });
//
//        JButton r4=new JButton("Error");
//        this.add(r4);
//        r4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(Pane1.this,"This is a Error Text.","Message",JOptionPane.ERROR_MESSAGE);
//            }
//        });
//
//        JButton r5=new JButton("Warning");
//        this.add(r5);
//        r5.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(Pane1.this,"This is a Warning Text.","Message",JOptionPane.WARNING_MESSAGE);
//            }
//        });
//
//
//    }
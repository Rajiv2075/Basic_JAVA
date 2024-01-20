package Swingg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combo {
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,600);
        Container c=frame.getContentPane();
        c.setLayout(null);

        String[] values={"A","B","C","D"};

        JComboBox b=new JComboBox(values);
        b.setBounds(200,100,130,30);
        c.add(b);
        b.setEditable(true);
//        b.setSelectedItem("D");
        b.setSelectedIndex(2);
        b.addItem("F");
        b.addItem("C");
        b.addItem("H");
        b.addItem("I");

        b.removeItem("C");



        JButton bt=new JButton("OK");
        bt.setBounds(400,100,100,30);
        c.add(bt);

        JLabel l1=new JLabel("Result: ");
        l1.setBounds(300,200,200,50);
        c.add(l1);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//                String item= (String) b.getSelectedItem();
//                l1.setText("Result: "+item);

                String item= String.valueOf(b.getSelectedIndex());
                l1.setText("Result: "+item);

            }
        });







        frame.setVisible(true);
    }
}

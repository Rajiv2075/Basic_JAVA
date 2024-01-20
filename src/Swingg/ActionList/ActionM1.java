package Swingg.ActionList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Action3 extends JFrame implements ActionListener
{
    JMenuBar menu;
    JMenu file,edit;
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8;
    JTextArea a1;
    public Action3()
    {
        Container c=getContentPane();
        c.setLayout(null);
        menu=new JMenuBar();

        file=new JMenu("File");
        edit=new JMenu("Edit");

        i1=new JMenuItem("new");
        i2=new JMenuItem("open");
        i3=new JMenuItem("save");
        i4=new JMenuItem("save as");
        i5=new JMenuItem("close");
        i6=new JMenuItem("cut");
        i7=new JMenuItem("copy");
        i8=new JMenuItem("paste");

        file.add(i1);
        file.add(i2);
        file.add(i3);
        file.add(i4);
        file.add(i5);
        edit.add(i6);
        edit.add(i7);
        edit.add(i8);

        menu.add(file);
        menu.add(edit);

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);
        i8.addActionListener(this);


        a1=new JTextArea();
        a1.setLineWrap(true);
        a1.setBounds(100,100,300,400);
        c.add(a1);

        this.setJMenuBar(menu);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==i1){
            a1.setText("New File");
        }
        if(e.getSource()==i2){
        a1.setText("Open File");
    }
        if(e.getSource()==i3){
        a1.setText("Save File");
    }
        if(e.getSource()==i4){
        a1.setText("Save as File");
    }
        if(e.getSource()==i5){
        a1.setText("close File");
    }
        if(e.getSource()==i6){
        a1.setText("cut File");
    }
        if(e.getSource()==i7){
        a1.setText("copy File");
    }
        if(e.getSource()==i8){
            a1.setText("paste File");
        }
    }
}
public class ActionM1 {
    public static void main(String[] args) {
        Action3 a1=new Action3();
        a1.setVisible(true);
        a1.setTitle("Button event");
        a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a1.setBounds(100,100,1000,600);

    }
}

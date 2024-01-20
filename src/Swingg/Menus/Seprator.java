package Swingg.Menus;

import javax.swing.*;
import java.awt.*;

class Menu4 extends JFrame
{
    JMenuBar mm;
    JMenu file,edit;
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
    public Menu4()
    {

        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(0,1));
        panel.add(new JLabel("Label 1:"));
        panel.add(new JSeparator());
//      panel.add(new JSeparator(SwingConstants.HORIZONTAL));
        panel.add(new JLabel("Label 2:"));
        add(panel);

        mm=new JMenuBar();
        add(mm, BorderLayout.NORTH);

        file=new JMenu("File");

        i1=new JMenuItem("New");
        i2=new JMenuItem("Open");
        i3=new JMenuItem("Save");
        i4=new JMenuItem("Save as");
        i5=new JMenuItem("Close");

        file.add(i1);
        file.addSeparator();
        file.add(i2);
        file.addSeparator();
        file.add(i3);
        file.add(i4);
        file.addSeparator();
        file.add(i5);
        mm.add(file);

        edit=new JMenu("Edit");

        i6=new JMenuItem("Cut");
        i7=new JMenuItem("Copy");
        i8=new JMenuItem("Paste");
        i9=new JMenuItem("Undo");
        i10=new JMenuItem("Redo");

        edit.add(i6);
        edit.addSeparator();
        edit.add(i7);
        edit.add(i8);
        edit.addSeparator();
        edit.add(i9);
        edit.add(i10);
        mm.add(edit);



    }
}
public class Seprator {
    public static void main(String[] args) {
        Menu4 c1=new Menu4();
        c1.setVisible(true);
        c1.setTitle("CheckBox Menu");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}

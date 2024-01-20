package Swingg.Menus;

import javax.swing.*;
import java.awt.*;

public class Menu1 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,600);
        Container c=frame.getContentPane();
        c.setLayout(null);

        JMenuBar mm=new JMenuBar();

        JMenu file=new JMenu("File");

        JMenuItem i1=new JMenuItem("New");
        JMenuItem i2=new JMenuItem("Open");
        JMenuItem i3=new JMenuItem("Save");
        JMenuItem i4=new JMenuItem("Save as");
        JMenuItem i5=new JMenuItem("Close");

        file.add(i1);
        file.add(i2);
        file.add(i3);
        file.add(i4);
        file.add(i5);

        mm.add(file);

        JMenu edit=new JMenu("Edit");

        JMenuItem i6=new JMenuItem("Cut");
        JMenuItem i7=new JMenuItem("Copy");
        JMenuItem i8=new JMenuItem("Paste");
        JMenuItem i9=new JMenuItem("Undo");
        JMenuItem i10=new JMenuItem("Redo");

        edit.add(i6);
        edit.add(i7);
        edit.add(i8);
        edit.add(i9);
        edit.add(i10);

        mm.add(edit);

        frame.setJMenuBar(mm);


        frame.setVisible(true);

    }
}

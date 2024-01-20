package Swingg.Table;

import javax.swing.*;
import java.awt.*;

class Tabel extends JFrame
{
    public Tabel()
    {
        this.setLayout(new FlowLayout());
        String [] [] data={
                {"101","Raj","20"},{"201","Rajiv","07"},{"301","Sunny","10"}};

        String [] column={"ID No.","Name","Roll No"};

        JTable table=new JTable(data,column);
        this.add(new JScrollPane(table));
    }
}

public class Demo {
    public static void main(String[] args) {
        Tabel c1=new Tabel();
        c1.setVisible(true);
        c1.setTitle("JSplit  Pane");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}

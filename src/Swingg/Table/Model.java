package Swingg.Table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Tabel1 extends JFrame
{
    JTextField t1,t2,t3;
    JButton r1,r2,r3;
    DefaultTableModel tm;
    public Tabel1()
    {
        Object [] [] data={
                {"101","Raj","20"},{"201","Rajiv","07"},{"301","Sunny","10"},{"401","Raja","02"},{"501","Aman","09"}};

        String [] x={"ID No.","Name","Roll No"};

         tm=new DefaultTableModel(data,x);
        JTable table=new JTable(tm);
        add(table);


        setLayout(new GridLayout(3,1));


        JPanel p1=new JPanel(new BorderLayout());
        p1.add(new JScrollPane(table));
        add(p1);

        JPanel p2 = new JPanel();
        add(p2);

        JPanel p3 = new JPanel(new GridLayout(3, 3));

       t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();

        r1=new JButton("Add");
        r2=new JButton("Update");
        r3=new JButton("Delete");

        p3.add(new JLabel("ID No: "));
        p3.add(t1);
        p3.add(r1);

        p3.add(new JLabel("Name : "));
        p3.add(t2);
        p3.add(r2);

        p3.add(new JLabel("Roll No: "));
        p3.add(t3);
        p3.add(r3);

        add(p3);

        r1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                     if (t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty() || t3.getText().toString().isEmpty()) {
                          JOptionPane.showMessageDialog(p3, "Please Enter the Data", "Error", JOptionPane.ERROR_MESSAGE);
                     }
                     else {
                         int roll = Integer.parseInt(t3.getText().toString());
                        String name = t2.getText().toString();
                        int id = Integer.parseInt(t1.getText().toString());

                        Object[] newrow = {id, name, roll};
                        tm.addRow(newrow);
                        JOptionPane.showMessageDialog(p3,"New Row added.","Information",JOptionPane.INFORMATION_MESSAGE);
                        t1.setText(null);
                        t2.setText(null);
                        t3.setText(null);
                        System.out.println("hello");
                    }
                }
                catch (NumberFormatException e1)
                {
                    JOptionPane.showMessageDialog(p3, "Please Enter Valid data only.. ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               int rowIndex=table.getSelectedRow();

               String idNo = (String)tm.getValueAt(rowIndex,0);
                String name =(String) tm.getValueAt(rowIndex,1);
                String rollNo = (String)tm.getValueAt(rowIndex,2);

                t1.setText((idNo));
                t2.setText(name);
                t3.setText(rollNo);
            }
        });

        r2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    if (t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty() || t3.getText().toString().isEmpty()) {
                        JOptionPane.showMessageDialog(p3, "Please Select the row.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        int roll = Integer.parseInt(t3.getText().toString());
                        String name = t2.getText().toString();
                        int id = Integer.parseInt(t1.getText().toString());

                        int row=table.getSelectedRow();
                        tm.setValueAt(id,row,0);
                        tm.setValueAt(name,row,1);
                        tm.setValueAt(roll,row,2);

                        JOptionPane.showMessageDialog(p3, "Data Updated.. ", "Information", JOptionPane.INFORMATION_MESSAGE);
                        t1.setText(null);
                        t2.setText(null);
                        t3.setText(null);
                        System.out.println("Chalo");
                    }
                }
                catch (NumberFormatException e1)
                {
                    JOptionPane.showMessageDialog(p3, "Please select existing row or existing data  only. ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        r3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(table.getSelectedRow()==-1)
                {
                    JOptionPane.showMessageDialog(p3, "Please Select the row for Delete.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    tm.removeRow(table.getSelectedRow());
                    int sel=JOptionPane.showConfirmDialog(p3,"Do you want to delete permanently","Confirm",JOptionPane.YES_NO_CANCEL_OPTION);

                    if(sel==JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(p3, "Row Deleted.. ", "Information", JOptionPane.INFORMATION_MESSAGE);
                        t1.setText(null);
                        t2.setText(null);
                        t3.setText(null);
                        System.out.println("Yes Nikalo");
                    } else if (sel==JOptionPane.NO_OPTION){
                        JOptionPane.showMessageDialog(p3, "Row not Deleted.. ", "Information", JOptionPane.INFORMATION_MESSAGE);
                        t1.setText(null);
                        t2.setText(null);
                        t3.setText(null);
                        System.out.println("No Nikalo");
                    }else {
                        t1.getText();
                        t2.getText();
                        t3.getText();
                        System.out.println("Cancel Nikalo");
                    }
                }
            }
        });


        validate();
    }

}

public class Model {
    public static void main(String[] args) {
        Tabel1 c1=new Tabel1();
        c1.setVisible(true);
        c1.setTitle("Table Model");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);
    }
}
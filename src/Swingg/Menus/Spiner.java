package Swingg.Menus;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class Spin extends JFrame implements ChangeListener
{
    JSpinner s1,s2,s3;
    SpinnerModel m1,m2,m3;
    JLabel l2;
    public Spin()
    {
        FlowLayout f1=new FlowLayout();

        Container c=getContentPane();
        c.setLayout(f1);

        JLabel l1=new JLabel("Enter the age: ");
        c.add(l1);

        String [] str={"January","February","March","April","May","June","July","August","September","October","November","December"};
       m1=new SpinnerNumberModel(01,1,31,1);
       m2=new SpinnerListModel(str);
       m3=new SpinnerNumberModel(2000,1994,2023,1);   //String year=String.valueOf(java.time.Year.now());

        s1=new JSpinner(m1);
        s2=new JSpinner(m2);
        s3=new JSpinner(m3);

        c.add(s1);
        c.add(s2);
        c.add(s3);

        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);



        l2=new JLabel();
        c.add(l2);
        setDOB();

        validate();
    }

    public void setDOB()
    {
        int date=(Integer)s1.getValue();
        int year=(Integer)s3.getValue();
        String month=(String)s2.getValue();
        l2.setText("DOB is : "+date+"-"+month+"-"+year);

    }

    public void stateChanged(ChangeEvent e)
    {
        setDOB();
    }
}

public class Spiner {
    public static void main(String[] args) {
        Spin c1=new Spin();
        c1.setVisible(true);
        c1.setTitle("CheckBox Menu");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}

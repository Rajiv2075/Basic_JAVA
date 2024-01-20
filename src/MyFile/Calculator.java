package MyFile;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

class Cal extends JFrame implements ActionListener
{
    JLabel l1,l2,lr;
    JTextField t1,t2;
    JButton r1,r2,r3,r4,r5;
    public Cal()
    {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,1000,600);
        Container c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        l1=new JLabel("Enter First Number: ");
        l1.setBounds(100,100,350,50);
        c.add(l1);

        t1=new JTextField();
        t1.setBounds(500,100,350,50);
        c.add(t1);

        l2=new JLabel("Enter Second Number: ");
        l2.setBounds(100,200,390,50);
        c.add(l2);

        t2=new JTextField();
        t2.setBounds(500,200,350,50);
        c.add(t2);

        r1=new JButton("+");
        r1.setBounds(100,300,100,50);
        c.add(r1);

        r2=new JButton("-");
        r2.setBounds(250,300,100,50);
        c.add(r2);

        r3=new JButton("*");
        r3.setBounds(400,300,100,50);
        c.add(r3);

        r4=new JButton("/");
        r4.setBounds(550,300,100,50);
        c.add(r4);

        r5=new JButton("%");
        r5.setBounds(700,300,100,50);
        c.add(r5);

        lr=new JLabel("Result : ");
        lr.setBounds(150,400,800,50);
        c.add(lr);

        Cursor cr=new Cursor(Cursor.HAND_CURSOR);
        r1.setCursor(cr);
        r2.setCursor(cr);
        r3.setCursor(cr);
        r4.setCursor(cr);
        r5.setCursor(cr);

        Font fo=new Font("Arial Black",Font.ITALIC,30);
        l1.setFont(fo);
        l2.setFont(fo);
        r1.setFont(fo);
        r2.setFont(fo);
        r3.setFont(fo);
        r4.setFont(fo);
        r5.setFont(fo);
        lr.setFont(fo);
        t1.setFont(fo);
        t2.setFont(fo);



        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        r4.addActionListener(this);
        r5.addActionListener(this);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
       try
       {
           double a=Double.parseDouble(t1.getText());
           double b=Double.parseDouble(t2.getText());
           double c;
           lr.setForeground(Color.black);

           if (e.getSource()==r1){
               c=a+b;
               lr.setText("Result :   "+c);
           }

           if (e.getSource()==r2){
               c=a-b;
               lr.setText("Result :   "+c);
           }

           if (e.getSource()==r3){
                c=a*b;
               lr.setText("Result :   "+c);
           }

           if (e.getSource()==r4){
               c=a/b;
               lr.setText("Result :   "+c);
           }

           if (e.getSource()==r5){
                c=a%b;
               lr.setText("Result :   "+c);
           }
       }
       catch(NumberFormatException n){
           lr.setForeground(Color.RED);
           lr.setText("Result: "+" Please enter only Integer Number");
       }
       catch (ArithmeticException a){
           lr.setForeground(Color.RED);
          lr.setText("Result: "+" Cannot divided by zero");
       }
    }
}

public class Calculator
{
    public static void main(String[] args) {
        Cal ca=new Cal();
    }
}

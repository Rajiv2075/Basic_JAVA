package Swingg.SmallPro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Res extends JFrame implements ActionListener
{
    JLabel a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a12,a14,ar,a4a,a6a,a8a,a12a,a14a;
    JTextField f1,f2,f3,f4,f5,f6,f7,f8,f12,f13,f4f,f6f,f8f,f12f,f14f,f14a;
    JRadioButton r9a,r9b,r10a,r10b,r10c;
    Container c=getContentPane();
    public Res() {
        c.setLayout(null);

        ar = new JLabel("Registration Form");
        c.add(ar);
        ar.setBounds(100, 50, 400, 80);
        Font font=new Font("Algerian",Font.ITALIC,30);
        ar.setFont(font);
        ar.setForeground(Color.RED);

        a1 = new JLabel("Student's Name: ");
        c.add(a1);
        a1.setBounds(50, 150, 100, 30);

        f1=new JTextField();
        c.add(f1);
        f1.setBounds(250, 150, 350, 30);

        a2 = new JLabel("Father's Name: ");
        c.add(a2);
        a2.setBounds(50, 200, 150, 30);

        f2=new JTextField();
        c.add(f2);
        f2.setBounds(250, 200, 350, 30);

        a3 = new JLabel("Mother's Name: ");
        c.add(a3);
        a3.setBounds(50, 250, 150, 30);

        f3=new JTextField();
        c.add(f3);
        f3.setBounds(250, 250, 350, 30);

        a4 = new JLabel("Date of Birth: ");
        c.add(a4);
        a4.setBounds(50, 300, 100, 30);

        f4=new JTextField();
        c.add(f4);
        f4.setBounds(200, 300, 350, 30);

        a4a = new JLabel("Aadhar No.: ");
        c.add(a4a);
        a4a.setBounds(600, 300, 100, 30);

        f4f=new JTextField();
        c.add(f4f);
        f4f.setBounds(750, 300, 350, 30);

        a5 = new JLabel("College Name: ");
        c.add(a5);
        a5.setBounds(50, 350, 150, 30);

        f5=new JTextField();
        c.add(f5);
        f5.setBounds(250, 350, 350, 30);

        a6 = new JLabel("Board's Roll Number: ");
        c.add(a6);
        a6.setBounds(50, 400, 150, 30);

        f6=new JTextField();
        c.add(f6);
        f6.setBounds(250, 400, 150, 30);

        a6a = new JLabel("Session: ");
        c.add(a6a);
        a6a.setBounds(450, 400, 100, 30);

        f6f=new JTextField();
        c.add(f6f);
        f6f.setBounds(600, 400, 200, 30);

        a7 = new JLabel("Board's Registration No.: ");
        c.add(a7);
        a7.setBounds(50, 450, 300, 30);

        f7=new JTextField();
        c.add(f7);
        f7.setBounds(350, 450, 300, 30);

        a8 = new JLabel("Branch Name: ");
        c.add(a8);
        a8.setBounds(50, 500, 150, 30);

        f8=new JTextField();
        c.add(f8);
        f8.setBounds(250, 500, 300, 30);

        a8a = new JLabel("Semester : ");
        c.add(a8a);
        a8a.setBounds(600, 500, 100, 30);

        f8f=new JTextField();
        c.add(f8f);
        f8f.setBounds(750, 500, 80, 30);

        a9 = new JLabel("Catogory Mode: ");
        c.add(a9);
        a9.setBounds(50, 550, 200, 30);

        r9a=new JRadioButton("Regular",true);
        c.add(r9a);
        r9a.setBounds(300,550,70,30);

        r9b=new JRadioButton("Lateral Entry");
        c.add(r9b);
        r9b.setBounds(430,550,100,30);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r9a);
        bg.add(r9b);

        a10 = new JLabel("Gender: ");
        c.add(a10);
        a10.setBounds(50, 600, 100, 30);

        r10a=new JRadioButton("Male",true);
        c.add(r10a);
        r10a.setBounds(200,600,70,30);

        r10b=new JRadioButton("Female");
        c.add(r10b);
        r10b.setBounds(320,600,100,30);

        r10c=new JRadioButton("Others");
        c.add(r10c);
        r10c.setBounds(420,600,100,30);

        ButtonGroup bg1=new ButtonGroup();
        bg1.add(r10a);
        bg1.add(r10b);
        bg1.add(r10c);

        a12 = new JLabel("Contract Number: ");
        c.add(a12);
        a12.setBounds(50, 650, 150, 30);

        f12=new JTextField();
        c.add(f12);
        f12.setBounds(250, 650, 150, 30);

        a12a = new JLabel("Email Id : ");
        c.add(a12a);
        a12a.setBounds(450, 650, 100, 30);

        f12f=new JTextField();
        c.add(f12f);
        f12f.setBounds(600, 650, 200, 30);

        a14 = new JLabel("Address : ");
        c.add(a14);
        a14.setBounds(50, 700, 100, 30);

        f13=new JTextField();
        c.add(f13);
        f13.setBounds(250, 700, 400, 30);

        f14f=new JTextField();
        c.add(f14f);
        f14f.setBounds(50, 750, 250, 30);

        a14a = new JLabel("Pin : ");
        c.add(a14a);
        a14a.setBounds(350, 750, 100, 30);

        f14a=new JTextField();
        c.add(f14a);
        f14a.setBounds(500, 750, 200, 30);

        JButton b=new JButton("Submit");
        c.add(b);
        b.setBounds(900,650,150,80);
        Font font1=new Font("Arial",Font.BOLD,20);
        b.setFont(font1);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Student's Name: "+f1.getText());
        System.out.println("Father's Name: "+f2.getText());
        System.out.println("Mother's Name: "+f3.getText());
        System.out.println("Date of Birth: "+f4.getText());
        System.out.println("Aadhar No.: "+f4f.getText());
        System.out.println("College Name: "+f5.getText());
        System.out.println("Board's Roll Number: "+f6.getText());
        System.out.println("Session: "+f6f.getText());
        System.out.println("Board's Registration No.: "+f7.getText());
        System.out.println("Branch Name: "+f8.getText());
        System.out.println("Semester: "+f8f.getText());

        if (r9a.isSelected()) {
            System.out.println("Catogory Mode: " + r9a.getText());
        }else{
            System.out.println("Catogory Mode: " + r9b.getText());

        }

        if(r10a.isSelected()){
            System.out.println("Gender: "+r10a.getText());
        } else if (r10b.isSelected()) {
            System.out.println("Gender: "+r10b.getText());
        }else {
            System.out.println("Gender: "+r10c.getText());
        }

        System.out.println("Contract Number: "+f12.getText());
        System.out.println("Email ID: "+f12f.getText());
        System.out.println("Address: "+f13.getText()+" "+f14f.getText());
        System.out.println("Pin No.: "+f14a.getText());
    }
}

public class Register {
    public static void main(String[] args) {
        Res r=new Res();
        r.setTitle("Registration Form");
        r.setBounds(100, 50, 595, 842);
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

package Swingg.ToolTip;

import javax.swing.*;

class Tools extends JFrame
{
    public Tools()
    {
        setLayout(null);
        JLabel lpass=new JLabel("Enter the password: ");
        lpass.setBounds(50,50,150,30);
        add(lpass);

        JPasswordField tpass=new JPasswordField();
        tpass.setBounds(250,50,100,30);
        add(tpass);

        String str="<html>"
                +"<div bgcolor='#800080' color='white'>"
                +"Enter your password<br>"
                +"password contain digit only"
                +"</div>"
                +"</html>";

//        tpass.setToolTipText("Enter your password.");

        tpass.setToolTipText(str);


    }
}

public class Demo {
    public static void main(String[] args) {
        Tools c1=new Tools();
        c1.setVisible(true);
        c1.setTitle("CheckBox Menu");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}

package Swingg;
import javax.swing.*;
import java.awt.*;

class Ytest1  {
    public static void main(String args[])  {
        JFrame frame= new JFrame();
        frame.setTitle("My Frame");
        frame.setVisible(true);
        frame.setSize(600,500);
        frame.setBounds(100,100,100,500);

        // ImageIcon icon=new ImageIcon("small_IMG-20230309-WA0013.jpg");
        // frame.setIconImage(icon.getImage());

        //Container c=frame.getContentPane();
        frame.setBackground(Color.RED);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

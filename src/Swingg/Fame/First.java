package Swingg;
import javax.swing.*;
import java.awt.*;


public class First {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(700,500);
//        frame.setLocation(250,100);
        frame.setBounds(100,100,1000,600);
  frame.setTitle("MY cycle");
  ImageIcon con=new ImageIcon("download.png");
frame.setIconImage(con.getImage());
Container c=frame.getContentPane();
c.setBackground(Color.green);
//frame.setResizable(false);
        frame.setResizable(false);
        ImageIcon in=new ImageIcon("https://www.google.com/search?sca_esv=566820395&rlz=1C1UEAD_enIN1066IN1066&q=logo&tbm=isch&source=lnms&sa=X&ved=2ahUKEwi1r62No7iBAxXpcfUHHZg8BDIQ0pQJegQIDBAB&biw=1536&bih=707&dpr=1.25#imgrc=3ST7o_s3LRDxoM");
        //frame.setIconImage(in.getImage());



    }
}

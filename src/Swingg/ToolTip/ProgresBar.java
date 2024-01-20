package Swingg.ToolTip;

import javax.swing.*;
import java.awt.*;



//    error hai Thread me

class Progress extends JFrame
{

    public Progress()
    {
        setLayout(new FlowLayout());

        JProgressBar pb=new JProgressBar(0,100);
        this.add(pb);
     //   pb.setBackground(Color.BLUE);

        pb.setStringPainted(true);
          int i=0;
          while(i<=100)
          {
              if(i>=0&&i<=50){
                  pb.setString("Processing....");
              } else if (i>50&&i<=70) {
                  pb.setString("Wait for Sometimes....");
              } else if (i>70&&i<=90) {
                  pb.setString("About to complete....");

              }else if (i>90&&i<100) {
                  pb.setString("Finished....");

              }

              pb.setValue(i);
              try
              {
                  Thread.sleep(500);
              }catch(Exception e){
                  System.out.println("Noting");
              }

                i=i+20;
          }

   }
}

public class ProgresBar {
    public static void main(String[] args) {
        Progress c1=new Progress();
        c1.setVisible(true);
        c1.setTitle("CheckBox Menu");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }
}

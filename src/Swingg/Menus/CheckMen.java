package Swingg.Menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MenuCheck extends JFrame
{
    JMenuBar mm;
    JMenu file,edit,format;
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;

    JCheckBoxMenuItem wrap=new JCheckBoxMenuItem("Word Wrap");

    JTextArea t1=new JTextArea("Lorem ipsum dolor, sit amet consectetur adipisicing elit. Nisi magnam perferendis recusandae quam, ex magni ipsa quidem similique! Doloremque debitis eos reprehenderit blanditiis nam aut praesentium ipsum beatae vero, maiores dolores illo ab dignissimos doloribus alias optio eius assumenda temporibus sapiente architecto necessitatibus error nihil expedita saepe! Aliquam eveniet sequi ducimus, eligendi magni distinctio soluta corporis illo reprehenderit adipisci tenetur, accusantium consectetur, fugiat ullam voluptate nobis! Neque deserunt repudiandae ipsam quae autem ea voluptate sed alias, ipsum sint vero blanditiis aliquid quisquam, saepe quas, iure beatae! Corporis vel assumenda quas voluptas quidem eligendi sint velit labore expedita praesentium, perferendis eos suscipit ipsum quibusdam voluptates, nulla nobis aliquid excepturi quis libero hic aperiam corrupti autem eius? Rem, eligendi? Hic, eum. Ex ipsa corporis esse dicta nobis omnis nisi voluptates assumenda ullam!");

    public MenuCheck()
    {
       // setLayout(new FlowLayout());
         mm=new JMenuBar();
        add(mm, BorderLayout.NORTH);

         file=new JMenu("File");

         i1=new JMenuItem("New");
         i2=new JMenuItem("Open");
         i3=new JMenuItem("Save");
         i4=new JMenuItem("Save as");
         i5=new JMenuItem("Close");

        file.add(i1);
        file.add(i2);
        file.add(i3);
        file.add(i4);
        file.add(i5);
        mm.add(file);

         edit=new JMenu("Edit");

         i6=new JMenuItem("Cut");
         i7=new JMenuItem("Copy");
         i8=new JMenuItem("Paste");
         i9=new JMenuItem("Undo");
         i10=new JMenuItem("Redo");

        edit.add(i6);
        edit.add(i7);
        edit.add(i8);
        edit.add(i9);
        edit.add(i10);
        mm.add(edit);

        format=new JMenu("Format");
        format.add(wrap);
        mm.add(format);

        add(t1,BorderLayout.CENTER);

        wrap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(wrap.isSelected()){
                    t1.setLineWrap(true);
                    t1.setWrapStyleWord(true);
                }else{
                    t1.setLineWrap(false);
                    t1.setWrapStyleWord(false);
                }
            }
        });

        validate();
    }
}

public class CheckMen {
    public static void main(String[] args) {
        MenuCheck c1=new MenuCheck();
        c1.setVisible(true);
        c1.setTitle("CheckBox Menu");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setBounds(100,100,500,300);

    }

}

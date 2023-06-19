package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

//Java Swing is used to create window-based applications.
public class MyWindow extends JFrame{ //JFrame is a class in Java and has its own methods and constructors.
    // The J identifies all Swing components.
    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("",Font.BOLD,35);


     MyWindow()
    {
        super.setTitle("MyClock");
        super.setSize(800,600);
        super.setLocation(400,100);
        this.createGUI();
        this.startclock();
        super.setVisible(true);
    }

    public void createGUI(){

         //GUI coding
        heading = new JLabel("MyClock");
        clockLabel=new JLabel("Clock");

        heading.setFont(font);
        clockLabel.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);

    }

    public void startclock(){

         Timer timer= new Timer(1000, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
//                 String datetime = new Date().toString();
                 String datetime= new Date().toLocaleString();
                 clockLabel.setText(datetime);
             }
         });

         timer.start();
    }

}

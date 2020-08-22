package mypackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author olari
 */
public class myApplet extends Applet implements ActionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Button bt1, bt2, bt3;
    int type = -1;
    public void init() {
      
    setLayout(null) ;
    bt1 = new Button("Line");
    bt2 = new Button("Rectangle");
    bt3 = new Button("Oval");
    bt1.addActionListener(this);
    bt2.addActionListener(this);
    bt3.addActionListener(this);
    
    bt1.setBounds(10, 20, 100, 50);
    bt2.setBounds(120, 20, 100, 50);
    bt3.setBounds(230, 20, 100, 50);
    
    bt1.setForeground(new Color(255, 10, 25));
    bt2.setForeground(new Color(0, 255, 25));
    bt3.setForeground(new Color(55, 10, 255));
    
    bt1.setFont(new Font("Times New Roman", Font.BOLD, 16));
    bt2.setFont(new Font("Times New Roman", Font.BOLD, 16));
    bt3.setFont(new Font("Times New Roman", Font.BOLD, 16));
    add(bt1); add(bt2); add(bt3);
// TODO start asynchronous download of heavy resources
    }

    public void actionPerformed(ActionEvent er)
    {
        Button ref;
        ref = (Button)er.getSource();
        
        if(ref == bt1)
            type = 1;
        else if (ref == bt2)
            type = 2;
        else
            type = 3;
        repaint();
    }
    
    public void paint(Graphics gr)
    {
        if(type == 1)
            gr.drawLine(100,65,90,150);
        else if(type == 2)
            gr.drawRect(100, 65, 90, 190);
        else if(type == 3)
            gr.drawOval(100, 65, 90, 175);
    }
    
    // TODO overwrite start(), stop() and destroy() methods
}

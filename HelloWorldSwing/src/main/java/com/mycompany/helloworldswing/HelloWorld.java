/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldswing;
import javax.swing.*;
/**
 *
 * @author Cna
 */
public class HelloWorld extends JFrame{
    JButton btn;
    JLabel lbl;
    JPanel panel;
    public HelloWorld(){        
        btn = new JButton();
        lbl = new JLabel();
        btn.setText("Click Me!");
        this.setTitle("Hello World from Swing");
        panel = new JPanel();
        btn.setToolTipText("Click the button");
        
        this.setSize(500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        panel.add(btn);
        panel.add(lbl);
        add(panel);
        
        btn.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(java.awt.event.MouseEvent ae) {
                btnMouseClicked(ae);
            }
        });
    }
    private void btnMouseClicked(java.awt.event.MouseEvent ae)
    {
        lbl.setText("Hello World");
        
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new HelloWorld();
            }
            
        });
    }
            
            
    
}

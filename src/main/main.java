/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
/**
 *
 * @author Elizabeth Stiles
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame jFrame = new JFrame("Stiles");
        jFrame.setBounds(50, 50, 480,200);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        
        JLabel colorLbl = new JLabel("Secret Color:");
        colorLbl.setBounds(25,5, colorLbl.getPreferredSize().width+250, colorLbl.getPreferredSize().height+100);
        colorLbl.setFont(new Font("Courier New", Font.BOLD, 30));
        MouseEvents e = new MouseEvents(colorLbl);
        colorLbl.addMouseListener(e);
        jFrame.add(colorLbl);
        
        JTextField enterColor = new JTextField();
        enterColor.setBounds(colorLbl.getWidth()-40,52, 120, 25);
        enterColor.setFont(new Font("Courier New", Font.BOLD, 30));        
        jFrame.add(enterColor);

        JButton quitBtn = new JButton("Quit");
        quitBtn.setBounds(160, 120, 62, 26);
        quitBtn.addActionListener((event) -> System.exit(0));
        quitBtn.setVisible(false);
        jFrame.add(quitBtn);
        
        enterColor.addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent e){}
            public void keyTyped(KeyEvent e){}
            public void keyReleased(KeyEvent e){
        
                if("blue".equalsIgnoreCase(enterColor.getText())){
                    quitBtn.setVisible(true);
                } else if(!"blue".equalsIgnoreCase(enterColor.getText())){
                    quitBtn.setVisible(false);                    
                }  
            }
        });        
        
        jFrame.setVisible(true); 
    }
}

class MouseEvents implements MouseListener{
    JLabel colorLbl = new JLabel("Secret Color:");
    MouseEvents(JLabel colorLbl){
        this.colorLbl = colorLbl;
    }
    public void mousePressed(MouseEvent e) {
        colorLbl.setForeground(Color.blue);
    }

    public void mouseReleased(MouseEvent e) {
        colorLbl.setForeground(Color.gray);        
    }

    public void mouseEntered(MouseEvent e) {        
    }
    public void mouseExited(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {  
        }
    }

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours8.Activités;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author Sklaerenn
 */
public class Fenetre extends JFrame implements MouseListener {
    
    JPanel pan = new JPanel();
    JLabel label = new JLabel("Boutons normaux : ");
    JButton bouton1 = new JButton("Clic ici");
    JButton bouton2 = new JButton("Clic là");

    public Fenetre(){
        this.setTitle("Ma première page web");
        this.setSize(350, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pan.setLayout(new GridLayout(4,1));
        
        Color c = new Color(154, 217, 171);
        pan.setBackground(c);
        
        label.setForeground(Color.blue); 
       
        pan.add(label);
        pan.add(bouton1);
        pan.add(bouton2);
        
        this.add(pan);
        
        addMouseListener(this);
        
    }
    
    public void mouseClicked(MouseEvent e){
        System.out.println("clic dans fenetre");
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e){}
    
    
    
}

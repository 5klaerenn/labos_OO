/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cours8.Labo;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author abenkhedher
 */
public class Exerci4 extends JFrame implements MouseListener {
    
    JPanel pan = new JPanel();
    JButton b = new JButton("Compteur d'événements de souris");
    
    public int cpteEntree = 0;
    public int cpteSortie = 0;
    public int cpteClic = 0; 

    public Exerci4 ()
    {
        this.setTitle("Exercice 4");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pan.add(b);
        this.add(pan); 
         
        pan.setLayout(new GridLayout(2,1));
        b.setForeground(Color.red);
        
        b.addMouseListener(this);
    }

 @Override
    public void mouseClicked(MouseEvent e) {
       cpteClic += 1; 
       System.out.println("Nombre de clics sur le bouton : " + cpteClic);
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        cpteEntree += 1;
        System.out.println("Le nombre d'entrée sur le bouton : " + cpteEntree);
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        cpteSortie += 1;
        System.out.println("Le nombre de sortie du bouton : " + cpteSortie);
        
    }
}

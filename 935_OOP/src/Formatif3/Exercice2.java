/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Sklaerenn
 */
public class Exercice2 extends JFrame implements ActionListener {
    
    JPanel p = new JPanel(new FlowLayout());
    JButton btn1;
    JLabel lb1;
    JTextField resultat;
    
    public Exercice2(){
        this.setTitle("Exercice 2");        
        this.setSize(450, 200);
        this.setDefaultCloseOperation(3);
        
        btn1 = new JButton("+1");
        btn1.setBackground(Color.orange);
        p.add(btn1);
        
        lb1 = new JLabel("Nombre: ");
        p.add(lb1);
        
        resultat = new JTextField("0");
        resultat.setPreferredSize(new Dimension(240, 25));
        resultat.setBackground(Color.yellow);
        p.add(resultat);
      
        this.add(p);
        
        btn1.addActionListener(this);
        
    }
    
    public void ajouter(){
        int nbr1 = Integer.parseInt(resultat.getText());
        int nbr2 = Integer.parseInt(resultat.getText());
        
        nbr2 += 1;
        
        resultat.setText(Integer.toString(nbr2));
    }
    
    public void actionPerformed(ActionEvent e){
        ajouter();     
    } 
}

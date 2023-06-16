/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Exercice3;

import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author Sklaerenn
 */
public class Calculatrice extends JFrame implements ActionListener{
    
    JPanel p = new JPanel(new GridLayout(5, 2));
    JLabel lab1, lab2, lab3;
    JTextField txt1, txt2, txt3;
    JButton btn1, btn2, btn3, btn4;
    
    public Calculatrice(){
        this.setTitle("Ex3Examen");
        this.setSize(400, 600);
        this.setDefaultCloseOperation(3);
        
        lab1 = new JLabel("Entrez le premier nombre : "); 
        p.add(lab1);
        
        txt1 = new JTextField();
        p.add(txt1);
        
        lab2 = new JLabel("Entrez le deuxième nombre : ");
        p.add(lab2);
        
        txt2 = new JTextField();
        p.add(txt2);
        
        lab3 = new JLabel("Résultat : ");
        p.add(lab3);
        
        txt3 = new JTextField();
        txt3.setBackground(Color.black);
        txt3.setForeground(Color.green);
        txt3.setFocusable(false);
        p.add(txt3);
        
        btn1 = new JButton("Addition");
        p.add(btn1);
        
        btn2 = new JButton("Multiplication");
        p.add(btn2);
        
        btn3 = new JButton("Division");
        p.add(btn3);
        
        btn4 = new JButton("Soustraction");
        p.add(btn4);
        
        this.add(p);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

    }
    
    public void additionner(){
        double nbr1 = Double.parseDouble(txt1.getText());
        double nbr2 = Double.parseDouble(txt2.getText());
                
        txt3.setText(Double.toString(nbr1 + nbr2));
    }
    
    public void multiplier(){
        double nbr1 = Double.parseDouble(txt1.getText());
        double nbr2 = Double.parseDouble(txt2.getText());
                
        txt3.setText(Double.toString(nbr1 * nbr2));
    }
   
    public void diviser(){
        double nbr1 = Double.parseDouble(txt1.getText());
        double nbr2 = Double.parseDouble(txt2.getText());
        
        if(nbr2 == 0){
            txt3.setText("Division par 0 !");
        } else {
            txt3.setText(Double.toString(nbr1 / nbr2));
        }
    }
    
    public void soustraire(){
        double nbr1 = Double.parseDouble(txt1.getText());
        double nbr2 = Double.parseDouble(txt2.getText());
                
        txt3.setText(Double.toString(nbr1 - nbr2));
    }
    
    public void actionPerformed(ActionEvent e){
        
        Object source = e.getSource();
        
        if(source == btn1){
            additionner();
        } else if (source == btn2){
            multiplier();
        } else if(source == btn3){
            diviser();
        } else {
            soustraire();
        }
    }

}

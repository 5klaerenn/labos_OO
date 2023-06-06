/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Asma
 */
public class Radio extends JFrame implements ActionListener {

    private JRadioButton rb1, rb2, rb3;
    private JPanel p;
    JButton btn = new JButton("État");
    
    
    public Radio() {
        this.setTitle("Test pour fenêtre avec RadioButton");
        p = new JPanel(new GridLayout(1, 3));
        this.setSize(400, 400);

        this.add(p);

        ButtonGroup groupe = new ButtonGroup();

        rb1 = new JRadioButton("radio 1", true);
        groupe.add(rb1);
        p.add(rb1);

        rb2 = new JRadioButton("radio 2");
        groupe.add(rb2);
        p.add(rb2);

        rb3 = new JRadioButton("radio 3");
        groupe.add(rb3);
        p.add(rb3);
        
        p.add(btn);
        
        btn.addActionListener(this);
        
    }
    
        
    public void actionPerformed(ActionEvent e){

        System.out.println("L'état des 3 boutons est : " + rb1.isSelected() + " - " + rb2.isSelected() + " - " + rb3.isSelected());
               
    } 

}

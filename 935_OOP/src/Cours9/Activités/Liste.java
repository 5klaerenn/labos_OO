/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.*;

/**
 *
 * @author Asma
 */

public class Liste extends JFrame implements ListSelectionListener {
    private String[] data = {"Objet", "Classe", "Heritage", "Interface"};
    private JPanel p;
    private JList myList = new JList (data);
    
    public Liste ()  
    {
        this.setTitle("Test pour fenêtre avec JList");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p = new JPanel ();

        myList.setBackground(Color.cyan);
        p.add(myList);
        this.add(p);
        
        myList.addListSelectionListener(this);
        
    }
    
    public void valueChanged(ListSelectionEvent e){
        
        if(e.getValueIsAdjusting()){
            System.out.println("Indice de l'élément sélectionné : "+ myList.getSelectedIndex() + " // Valeur de l'élément sélectionné : "+ myList.getSelectedValue());
        }
    }

   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Ex3 extends JFrame implements ListSelectionListener{
	
        JPanel p = new JPanel(new FlowLayout());
        String[] data = {"Londres, Grande Bretagne", "Dublin, Irlande", "Amsterdam, Pays-Bas"};
        JList myList = new JList(data);
        JLabel lb1;
        JTextField txt;
            
    public Ex3() {
        this.setTitle("Ex3");
        this.setSize(700, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	p.add(myList);
        
        lb1 = new JLabel(" Horaire du vol : "); 
        p.add(lb1);
        
        txt = new JTextField();
        txt.setPreferredSize(new Dimension(350, 20));
        p.add(txt);
        
        this.add(p);
        
        myList.addListSelectionListener(this);
       
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        
        String option = (String) myList.getSelectedValue();

        switch(option){
            case "Londres, Grande Bretagne" :
                txt.setText("Vol pour Londres : Lundi 16h30");
                break;
            case "Dublin, Irlande":
                txt.setText("Vol pour Dublin : Mercredi 9h45");
                break;
            case "Amsterdam, Pays-Bas":
                txt.setText("Vol pour Amsterdam : Dimanche 16h20");
                break;
            default:
                System.out.println("Erreur");
                break;
        }
           

    }

}

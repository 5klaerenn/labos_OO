/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours9.Activités;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Sklaerenn
 */
public class Cases extends JFrame {
    
    JPanel pan = new JPanel();
    JCheckBox cb1 = new JCheckBox("choix a", true);
    JCheckBox cb2;

    public Cases() {
        this.setTitle("Test pour fenêtres avec CheckBox");        
        this.setSize(700, 700);
        this.setDefaultCloseOperation(3); // equivaut à exit_on_close
        
        pan.add(cb1);
        
        ImageIcon imag = new ImageIcon("C:\\Users\\Sklaerenn\\Documents\\Code\\935_POO\\Labos\\935_OOP\\src\\Cours9\\Activités\\fleche.png");
        cb2 = new JCheckBox("choix b", imag);
        pan.add(cb2);
               
        this.add(pan);
    }
    
    
    
}
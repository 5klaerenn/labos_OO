/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boutons_Radio;

import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Asma
 */
public class Radio extends JFrame {

    private JRadioButton rb1, rb2, rb3;
    private JPanel p;

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

    }

}

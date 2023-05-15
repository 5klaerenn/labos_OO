/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cours4.Activités;

/**
 *
 * @author Asma
 */
import java.util.Vector;

public class Beatles
{
   public static void main (String[] args)
   {
      Vector<String> band = new Vector<String>();

      band.addElement ("Paul");
      band.addElement ("Pete");
      band.addElement ("John");
      band.addElement ("George");

      System.out.println (band);
      
      //Ajout de Ringo
      
      String nouveauP = new String("Ringo");
      band.insertElementAt(nouveauP, 2);
      System.out.println(band);
       
      // Suppression de Pete en cherchant son indice
      int indice;
      indice = band.indexOf("Pete");
      band.removeElementAt(indice);
      System.out.println(band);
      
      
   }
}

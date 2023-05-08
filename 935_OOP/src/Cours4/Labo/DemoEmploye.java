/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours4.Labo;

import java.util.ArrayList;

/**
 *
 * @author Sklaerenn
 */
public class DemoEmploye {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Employe> listEmp = new ArrayList();
        
        Employe e1 = new Employe("Paul", 32, 75000);
        Employe e2 = new Employe("Ringo", 27, 110000);
        Employe e3 = new Employe("John", 30, 25000);
        Employe e4 = new Employe("George", 44, 66000);
        
        listEmp.add(e1);
        listEmp.add(e2);
        listEmp.add(e3);
        listEmp.add(e4);
        
        afficherEmp(listEmp);
        
        Employe e5 = new Employe ("Pete", 43, 45000 );
        listEmp.add(1, e5);
        
        afficherEmp(listEmp);
        
        plus30(listEmp);
        
        System.out.println("Moyenne des salaires :");
        System.out.println(moyenneSalaire(listEmp));
        

    }
    
    static void afficherEmp(ArrayList<Employe> listEmp){
        for(int i = 0; i < listEmp.size(); i++){
            System.out.println(listEmp.get(i).toString());
        }
        System.out.println("");
    }
    
    static void plus30(ArrayList<Employe> listEmp){
        for(int i = 0; i < listEmp.size(); i++){
            if((listEmp.get(i).getAge()) > 30){
                System.out.println(listEmp.get(i).toString());
            }
        } System.out.println("");
    }
    
    static double moyenneSalaire(ArrayList<Employe> listEmp){
        double sum = 0;
        
        for(int i = 0; i < listEmp.size(); i++){
            sum += listEmp.get(i).getSalaire(); 
        }
        
        return sum/listEmp.size();
    }
}

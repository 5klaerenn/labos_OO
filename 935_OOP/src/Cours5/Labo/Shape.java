/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cours5.Labo;

/**
 *
 * @author abenkhedher
 */
public class Shape {
    
    double x, y ;

    public Shape() {
        x = 0 ; y = 0 ;
    }
                
    public Shape(double x, double y) {
        this.x = x ; this.y = y ;
    }
    
    public String toString() {
       return "Position : (" + x + "," + y + ")" ;
    }
    
}

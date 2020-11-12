/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioedd3;

import java.util.Scanner;

/**
 *
 * @author Abel Dominguez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
               
        Triangle triangleUser = new Triangle();
        
        System.out.println("¿Cuál es la altura del triángulo?");
        triangleUser.setHeight(reader.nextFloat());
                
        System.out.println("¿Cuál es la base del triángulo?");
        triangleUser.setBase(reader.nextFloat());
        
        System.out.println("El área del triangulo introducido por el usuario es: "+triangleUser.calculateArea());
        
        Triangle triangleSystem = new Triangle(5,6);
        
        System.out.println("El area del triangulo del sistema es: "+triangleSystem.calculateArea());
        
    }
    
}

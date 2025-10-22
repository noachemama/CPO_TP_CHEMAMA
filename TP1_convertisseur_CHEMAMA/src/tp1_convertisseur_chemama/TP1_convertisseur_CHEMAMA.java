/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_chemama;

import java.util.Scanner;

/**
 *
 * @author Noa Chemama
 */
public class TP1_convertisseur_CHEMAMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre reel :");
        double val = sc.nextDouble();
    val= val+273.0   ; 
  
    System.out.println("la temperature vaut "+ val +"K");
        
        
        
    }
    
}

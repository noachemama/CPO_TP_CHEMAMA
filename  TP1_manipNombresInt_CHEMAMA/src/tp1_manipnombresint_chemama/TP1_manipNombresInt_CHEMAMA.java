/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_chemama;

import java.util.Scanner;

/**
 *
 * @author Noa Chemama
 */
public class TP1_manipNombresInt_CHEMAMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le premier entier :");
        int nbr1 = sc.nextInt();

        System.out.println("Entrer le deuxieme entier :");
        int nbr2 = sc.nextInt();
         
        int somme = nbr1+nbr2;
        int soustraction = nbr1-nbr2;
        int produit = nbr1*nbr2;
        int div = nbr1/nbr2;
        int reste =nbr1%nbr2;
                
               
        System.out.println("la somme des deux nombres et egale a " + somme + ", la difference est egale a " + soustraction + " et le produit vaut " + produit + "");
        System.out.println("le quotient entier est egale a "+ div +" et le reste de la division euclidienne est egale a "+reste+".") ;       
                
    }
    
}

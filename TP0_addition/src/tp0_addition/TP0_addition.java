/*
 * TP0 addition 20/10
 */
package tp0_addition;

import java.util.Scanner;

/**
 *
 * @author Noa Chemama
 */
public class TP0_addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
System.out.println("Entrer le nombre :");
        int nb = sc.nextInt();
int result; // resultat
int ind; //indice
// initialisation
result=0;
// addition des nb premiers entiers
ind=1;
while (ind< nb) {
result=result+ind;
ind++;
}
// affichage du resultat
System.out.println("la somme des " + nb + " entiers est: "+result);
        // TODO code application logic here
    }
    
}

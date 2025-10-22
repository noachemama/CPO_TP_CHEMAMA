/*
 * TP0 Calculette 20/10
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author Noa Chemama
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:\n"
                + "1) add \n"
                + "2) substract\n"
                + "3) multiply\n "
                + "4) divide \n"
                + "5) modulo ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer l'operateur :");
        int operateur = sc.nextInt();

        System.out.println("Entrer le premier nombre :");
        int nombre1 = sc.nextInt();

        System.out.println("Entrer le second nombre :");
        int nombre2 = sc.nextInt();
        int resultat = 0;

        if (operateur == 1) {
            resultat = nombre1 + nombre2;
        } else if (operateur == 2) {
            resultat = nombre1 - nombre2;
        } else if (operateur == 3) {
            resultat = nombre1 * nombre2;
        } else if (operateur == 4) {
            resultat = nombre1 / nombre2;
        } else if (operateur == 5) {
            resultat = nombre1 % nombre2;
        }

        System.out.println("le resultat est egale a " + resultat + "");
    }
}

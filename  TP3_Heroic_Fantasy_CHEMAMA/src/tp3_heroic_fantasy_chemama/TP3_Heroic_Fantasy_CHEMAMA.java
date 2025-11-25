/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_chemama;

import Personnages.Guerrier;
import Armes.*;
import Personnages.*;
import java.util.ArrayList;
/**
 *
 * @author Noa Chemama
 */
public class TP3_Heroic_Fantasy_CHEMAMA {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {

        // --- TEST PERSONNAGES ----
        Magicien m1 = new Magicien("Gandalf", 65, true);
        Magicien m2 = new Magicien("Garcimore", 44, false);

        Guerrier g1 = new Guerrier("Conan", 78, false);
        Guerrier g2 = new Guerrier("Lannister", 45, true);

        ArrayList<Personnage> persos = new ArrayList<>();
        persos.add(m1);
        persos.add(m2);
        persos.add(g1);
        persos.add(g2);

        // --- TEST ARMES ----
        Epee e1 = new Epee(7, 5, "Excalibur");
        Epee e2 = new Epee(4, 7, "Durandal");
        Baton b1 = new Baton(4, 5, "Chene");
        Baton b2 = new Baton(5, 6, "Charme");

        ArrayList<Arme> armes = new ArrayList<>();
        armes.add(e1);
        armes.add(e2);
        armes.add(b1);
        armes.add(b2);

        // ----- GESTION DES ARMES -----
        g1.ajouterArme(e1);
        g1.ajouterArme(e2);
        g1.ajouterArme(b1);

        g1.equiper("Excalibur");

        m1.ajouterArme(b1);
        m1.ajouterArme(b2);
        m1.ajouterArme(e2);

        m1.equiper("Chene");

        // --- COMBAT TEST -----
        System.out.println("\n--- COMBAT ---");

        m1.attaquer(g1);
        g1.attaquer(m1);

        for (Personnage p : persos) {
            System.out.println(p);
        }

        System.out.println("Personnages vivants ? ");
        System.out.println("Gandalf : " + m1.estVivant());
        System.out.println("Conan : " + g1.estVivant());

        System.out.println("\nNb guerriers : " + Personnage.nbGuerriers);
        System.out.println("Nb magiciens : " + Personnage.nbMagiciens);
        System.out.println("Nb personnages : " + Personnage.nbPersonnages);
    }
    
}

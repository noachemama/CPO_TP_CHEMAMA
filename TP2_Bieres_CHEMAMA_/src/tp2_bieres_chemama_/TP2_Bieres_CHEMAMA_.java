/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_chemama_;

/**
 *
 * @author Noa Chemama
 */
public class TP2_Bieres_CHEMAMA_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0,"Duboisson");
    uneBiere.nom = "Cuvée des trolls";
    uneBiere.degreAlcool = 7.0 ;
    uneBiere.brasserie ="Dubuisson";
    uneBiere.ouverte=false;
    BouteilleBiere deuxBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
    BouteilleBiere troisBiere = new BouteilleBiere("Pietra",7.2,"Brasserie Pietra");
    BouteilleBiere quatreBiere =new BouteilleBiere("jean",6.2,"Nemar");
    BouteilleBiere cinqBiere =new BouteilleBiere("Aller l'OM",13,"A jamais les premiers");
           
    System.out.println(uneBiere) ;
    
    uneBiere.Decapsuler();
    uneBiere.lireEtiquette();
    deuxBiere.lireEtiquette();
    troisBiere.lireEtiquette();
    quatreBiere.lireEtiquette();
    cinqBiere.lireEtiquette();
    }
    
}

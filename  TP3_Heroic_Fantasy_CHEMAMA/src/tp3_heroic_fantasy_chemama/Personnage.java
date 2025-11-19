package tp3_heroic_fantasy_chemama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa Chemama
 */
abstract class Personnage {
    String nom;
    int niveaudevie;

    public Personnage(String nom, int niveaudevie) {
        this.nom = nom;
        this.niveaudevie = niveaudevie;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", niveaudevie=" + niveaudevie + '}';
    }
    
            
    
}

package tp3_heroic_fantasy_chemama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa Chemama
 */
public abstract class Arme {       
 int niveau_at;
String nom;

    public Arme(int niveau_at, String nom) {
        this.niveau_at = niveau_at;
        this.nom = nom;
        if (niveau_at <= 100){
        niveau_at =100;    
        }
    }

    @Override
    public String toString() {
        return "Arme{" + "niveau_at=" + niveau_at + ", nom=" + nom + '}';
    }
     
}

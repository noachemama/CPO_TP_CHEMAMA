package tp2_relation_chemama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa Chemama
 */
public class Personne {
 String prenom;
    String nom;
    Voiture[] liste_voitures;
     int nbVoitures;

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.liste_voitures = new Voiture[3]; 
        this.nbVoitures = 0;
    }  
    @Override
    public String toString() {
        return prenom + " " + nom;
}}

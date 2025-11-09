package tp2_relation_chemama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa Chemama
 */
public class Voiture {
String modele;
String marque;
int nb;
    public Voiture(String modele, String marque, int nb) {
        this.modele = modele;
        this.marque = marque;
        this.nb = nb;    
}
     @Override
    public String toString() {
        return marque + " " + modele + " ( nombre disponible :" + nb + ")";
}
}
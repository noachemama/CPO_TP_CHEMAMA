/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_chemama;

/**
 *
 * @author Noa Chemama
 */
public class Baton extends Arme{
    double age;

    public Baton(double age, int niveau_at, String nom) {
        super(niveau_at, nom);
        this.age = age;
    }

}

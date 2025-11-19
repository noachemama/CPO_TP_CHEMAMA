/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

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

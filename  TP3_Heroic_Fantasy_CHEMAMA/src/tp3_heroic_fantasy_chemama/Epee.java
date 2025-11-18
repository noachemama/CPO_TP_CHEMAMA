package tp3_heroic_fantasy_chemama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa Chemama
 */
public class Epee extends Arme{
    double finesse;
    
    public Epee(double finesse, int niveau_at, String nom) {
        super(niveau_at, nom);
        this.finesse = finesse;
        if (finesse<0){
            finesse=-finesse;
        }
        if (finesse>100){
            finesse=100;
        }
    }
  
}

package la_chevauchée_fantastique_chemama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa Chemama
 */
public class cavalier {
    int ligne;
    int col;

    public cavalier(int ligne, int col) {
        this.ligne = ligne;
        this.col = col;
    }

    int getLigne() {
        return ligne;
    }

    int getCol() {
        return col;
    }

    boolean deplacementValide(int nouvelleLigne, int nouvelleCol) {

        int diffLigne = Math.abs(nouvelleLigne - ligne);
        int diffCol = Math.abs(nouvelleCol - col);

        return (diffLigne == 2 && diffCol == 1) ||
               (diffLigne == 1 && diffCol == 2);
    }

    void deplacer(int nouvelleLigne, int nouvelleCol) {
        ligne = nouvelleLigne;
        col = nouvelleCol;
    }
}
    


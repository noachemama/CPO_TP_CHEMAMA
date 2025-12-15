package la_chevauchée_fantastique_chemama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa Chemama
 */
public class Board {

    int nbLignes;
    int nbColonnes;
    Case[][] cases;

    public Board(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;

        cases = new Case[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                cases[i][j] = new Case(j, i, true);
            }
        }
    }
    Case getCase(int ligne, int col) {
        return cases[ligne][col];
    }
}

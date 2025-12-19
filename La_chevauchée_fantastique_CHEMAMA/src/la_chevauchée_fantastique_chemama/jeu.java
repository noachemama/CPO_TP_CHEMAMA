package la_chevauchée_fantastique_chemama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa Chemama
 */
public class jeu {

Board board;
    cavalier knight;

    public jeu(int nbLignes, int nbColonnes, int ligneDepart, int colDepart) {

        board = new Board(nbLignes, nbColonnes);
        knight = new cavalier(ligneDepart, colDepart);

        board.getCase(ligneDepart, colDepart).eteindre();
    }

    boolean jouer(int ligne, int col) {

        if (!knight.deplacementValide(ligne, col)) {
            return false;
        }

        knight.deplacer(ligne, col);
        board.getCase(ligne, col).eteindre();
        
        if (board.toutesEteintes()) {
    System.out.println("Partie terminée !");
        }

        return true;
        
       
    }
 public int getChevalierLigne() {
        return knight.getLigne();
    }

    public int getChevalierCol() {
        return knight.getCol();
    }
}

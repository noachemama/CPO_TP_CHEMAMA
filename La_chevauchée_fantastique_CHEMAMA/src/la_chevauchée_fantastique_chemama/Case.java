package la_chevauchée_fantastique_chemama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa Chemama
 */
public class Case {

    private int col;
    private int ligne;
    private boolean onOff;

    public Case(int col, int ligne, boolean onOff) {
        this.col = col;
        this.ligne = ligne;
        this.onOff = onOff;
    }

    void allumer() {
        if (!onOff) {
            onOff = true;
        }
    }

    void eteindre() {
        if (onOff) {
            onOff = false;
        }
    }

    boolean estAllumee() {
        return onOff;
    }

    int getLigne() {
        return ligne;
    }

    int getCol() {
        return col;
    }
}

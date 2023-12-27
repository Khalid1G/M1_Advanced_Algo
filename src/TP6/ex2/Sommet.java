package TP6.ex2;

import java.util.LinkedList;

public class Sommet {
    private String nom;
    private boolean marque;
    private LinkedList<Sommet> voisins;
    private LinkedList<Integer> couts;

    public Sommet(String nom) {
        this.nom = nom;
        this.marque = false;
        this.voisins = new LinkedList<Sommet>();
        this.couts = new LinkedList<Integer>();
    }

    public void ajouterVoisin(Sommet voisin, int cout) {
        this.voisins.add(voisin);
        this.couts.add(cout);
    }

    public String getNom() {
        return this.nom;
    }

    public boolean etat() {
        return this.marque;
    }

    public int getCout(Sommet voisin) {
        int index = this.voisins.indexOf(voisin);
        return this.couts.get(index);
    }

    public LinkedList<Sommet> getVoisins() {
        return this.voisins;
    }

    public void afficher() {
        System.out.println("Sommet " + this.nom + " :");
        for (int i = 0; i < this.voisins.size(); i++) {
            System.out.println("Voisin " + this.voisins.get(i).getNom() + " : " + this.couts.get(i));
        }
    }

    public void marquer() {
        this.marque = true;
    }

    public void demarquer() {
        this.marque = false;
    }
}

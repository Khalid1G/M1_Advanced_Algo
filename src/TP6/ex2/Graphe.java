package TP6.ex2;

import java.util.LinkedList;

public class Graphe {

    protected LinkedList<Sommet> sommets;

    public Graphe() {
        this.sommets = new LinkedList<Sommet>();
    }

    public void ajouterSommet(Sommet sommet) {
        this.sommets.add(sommet);
    }

    public Sommet getSommet(int index) {
        return this.sommets.get(index);
    }

    public int getIndexSommet(Sommet sommet) {
        return this.sommets.indexOf(sommet);
    }

    public int getNbSommets() {
        return this.sommets.size();
    }

    public Sommet getSommetParNom(String nom) {
        for (Sommet sommet : this.sommets) {
            if (sommet.getNom().equals(nom)) {
                return sommet;
            }
        }
        return null;
    }

    public int calculerCout(Sommet s1, Sommet s2) {
        int cout = 0;
        for (int i = 0; i < s1.getVoisins().size(); i++) {
            if (s1.getVoisins().get(i).equals(s2)) {
                cout = s1.getCout(s2);
            }
        }
        return cout;
    }

    public void afficherGraphe() {
        for (Sommet sommet : this.sommets) {
            sommet.afficher();
            System.out.println();
        }
    }



}

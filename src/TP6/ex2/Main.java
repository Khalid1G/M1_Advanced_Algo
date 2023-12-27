package TP6.ex2;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        Sommet S0 = new Sommet("S0");
        Sommet S1 = new Sommet("S1");
        Sommet S2 = new Sommet("S2");
        Sommet S3 = new Sommet("S3");
        Sommet S4 = new Sommet("S4");
        Sommet S5 = new Sommet("S5");
        Sommet S6 = new Sommet("S6");
        Sommet S7 = new Sommet("S7");

        S0.ajouterVoisin(S1, 25);
        S0.ajouterVoisin(S6, 17);

        S1.ajouterVoisin(S2, 30);
        S1.ajouterVoisin(S3, 33);
        S1.ajouterVoisin(S5, 15);

        S2.ajouterVoisin(S3, 18);

        S3.ajouterVoisin(S1, 33);

        S4.ajouterVoisin(S3, 25);
        S4.ajouterVoisin(S5, 26);
        S4.ajouterVoisin(S7, 20);

        S5.ajouterVoisin(S3, 35);
        S5.ajouterVoisin(S1, 15);

        S6.ajouterVoisin(S5, 22);

        Graphe graphe = new Graphe();

        graphe.ajouterSommet(S0);
        for (Sommet sommet : Arrays.asList(S1, S2, S3, S4, S5, S6, S7)) {
            graphe.ajouterSommet(sommet);
        }

        graphe.afficherGraphe();

    }
}
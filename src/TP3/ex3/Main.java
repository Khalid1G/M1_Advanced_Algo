package TP3.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Partie 3 : Construction de la liste avec ordre et élimination des doublons
        Liste<Integer> liste1 = new Liste();
        System.out.println("Entrez une suite de nombres entiers (terminée par 0) : ");
        int valeur = 0;
        while (true) {
            valeur = scan.nextInt();
            if (valeur == 0) {
                break;
            }
            if (!liste1.contient(valeur)) {
                liste1.ajouterAlaFin(valeur);
            }
        }
        System.out.println("Liste 1 : " + liste1);

        // Partie 4 : Construction de la deuxième liste et élimination des éléments correspondants dans la première liste
        Liste<Integer> liste2 = new Liste();
        System.out.println("Entrez une autre suite de nombres entiers (terminée par 0) : ");
        while (true) {
            valeur = scan.nextInt();
            if (valeur == 0) {
                break;
            }
            liste2.ajouterAlaFin(valeur);
        }
        System.out.println("Liste 2 : " + liste2);

        for (int i = 0; i < liste2.getValeur(0); i++) {
            int val = liste2.getValeur(i);
            if (liste1.contient(val)) {
                liste1.retirerFirstOccurrence(val);
            }
        }

        System.out.println("Résultat final : " + liste1);
    }
}

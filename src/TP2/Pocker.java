package TP2;
import java.util.Arrays;
import java.util.Collections;

public class Pocker {

    public enum Couleur {
        PIQUE, TREFLE, CARREAU, COEUR
    }

    public enum Face {
        DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI, AS
    }

    // Classe représentant une carte avec une couleur et une face
    public static class Carte implements Comparable<Carte> {
        private Couleur couleur;
        private Face face;

        public Carte(Couleur couleur, Face face) {
            this.couleur = couleur;
            this.face = face;
        }

        @Override
        public int compareTo(Carte autreCarte) {

            int comparaisonFace = this.face.compareTo(autreCarte.face);
            if (comparaisonFace != 0) {
                return comparaisonFace;
            } else {
                return this.couleur.compareTo(autreCarte.couleur);
            }
        }

        @Override
        public String toString() {
            return face + " de " + couleur;
        }
    }

    // Fonction de tri pour une main de poker
    public static void trierMain(Carte[] main) {
        Arrays.sort(main);
    }

    public static void main(String[] args) {
        // Exemple d'utilisation

        Carte[] mainDePoker = new Carte[52];

        int i = 0;
        for(Couleur couleur : Couleur.values()) {
            for(Face face : Face.values()) {
               mainDePoker[i++] = new Carte(couleur, face);
            }
        }

        System.out.println("Main avant le tri :");
        for (Carte carte : mainDePoker) {
            System.out.println(carte);
        }

        trierMain(mainDePoker);

        System.out.println("\nMain après le tri :");
        for (Carte carte : mainDePoker) {
            System.out.println(carte);
        }
    }
}


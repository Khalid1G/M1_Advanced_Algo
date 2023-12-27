package TP6.ex3;


import TP6.ex2.Sommet;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Sommet Meknes = new Sommet("Meknès");
        Sommet Rabat = new Sommet("Rabat");
        Sommet Casa = new Sommet("CasaBlanca");
        Sommet Mohammedia = new Sommet("Mohammedia");
        Sommet Mediouna = new Sommet("Mediouna");
        Sommet SidiKacem = new Sommet("Sidi Kacem");
        Sommet Kenitra = new Sommet("Kenitra");
        Sommet Azemmour = new Sommet("Azemmour");
        Sommet ElJadida = new Sommet("El Jadida");


        Meknes.ajouterVoisin(Mohammedia, 7);
        Meknes.ajouterVoisin(Rabat, 3);
        Meknes.ajouterVoisin(SidiKacem, 4);

        Mohammedia.ajouterVoisin(Casa, 1);
        Mohammedia.ajouterVoisin(Mediouna, 1);

        Rabat.ajouterVoisin(Mohammedia, 2);
        Rabat.ajouterVoisin(Azemmour, 8);
        Rabat.ajouterVoisin(SidiKacem, 1);

        Mediouna.ajouterVoisin(Casa, 2);
        Mediouna.ajouterVoisin(Azemmour, 3);
        Mediouna.ajouterVoisin(Rabat, 2);

        Kenitra.ajouterVoisin(Rabat, 3);
        Kenitra.ajouterVoisin(Azemmour, 7);
        Kenitra.ajouterVoisin(ElJadida, 6);

        Casa.ajouterVoisin(ElJadida, 5);

        Azemmour.ajouterVoisin(ElJadida, 2);
        Azemmour.ajouterVoisin(Casa, 2);

        Graphe2 villes = new Graphe2();
        for (Sommet sommet : Arrays.asList(Meknes, Rabat, Casa, Mohammedia, Mediouna, SidiKacem, Kenitra, Azemmour, ElJadida)) {
            villes.ajouterSommet(sommet);
        }


        //Question 1

        System.out.println("Le plus court chemin entre Meknes et  El Jadida est :");
        System.out.println(villes.plusCourtChemin(Meknes, ElJadida, true));


        //Question 2
       villes.exportGraphe("src/TP6/ex3/chemins.txt");

    }
}

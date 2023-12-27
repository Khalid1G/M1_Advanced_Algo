package TP2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> liste1 =  createListe();


        System.out.println("Exercice 2: Tri à bulle ");
        System.out.println("liste = " + liste1);
        Tri.tri_bulle(liste1);
        System.out.println("liste = " + liste1);


        ArrayList<Integer> liste2 =  createListe();
        System.out.println("\n\nExercice 3: Tri par sélection ");
        System.out.println("liste = " + liste2);
        Tri.tri_selection(liste2);
        System.out.println("liste = " + liste2);


        ArrayList<Integer> liste3 =  createListe();
        System.out.println("\n\nExercice 4: Tri par insertion ");
        System.out.println("liste = " + liste3);
        Tri.tri_insertion(liste3);
        System.out.println("liste = " + liste3);


        ArrayList<Integer> liste4 =  createListe();
        System.out.println("\n\nExercice 5: Tri rapide ");
        System.out.println("liste = " + liste4);
        Tri.tri_rapide(liste4);
        System.out.println("liste = " + liste4);


        ArrayList<Integer> liste5 =  createListe();
        System.out.println("\n\nExercice 6: Tri fusion ");
        System.out.println("liste = " + liste5);
        Tri.tri_fusion(liste5);
        System.out.println("liste = " + liste5);


        ArrayList<Integer> liste6 =  createListe();
        System.out.println("\n\nExercice 7: Tri du singe ");
        System.out.println("liste = " + liste6);
        Tri.tri_du_singe(liste6);
        System.out.println("liste = " + liste6);


    }

    static ArrayList<Integer> createListe(){
        ArrayList<Integer> liste = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            liste.add((int) (Math.random() * 100));
        }
        return liste;
    }
}
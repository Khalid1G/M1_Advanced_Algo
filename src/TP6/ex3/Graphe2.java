package TP6.ex3;

import TP6.ex2.Graphe;
import TP6.ex2.Sommet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Graphe2 extends Graphe{
    public Graphe2() {
        super();
    }

    public void exportGraphe(String cheminFichier) {

        writeToFile("", cheminFichier, false);
        writeToFile("Le nombre de sommetes est :  "+this.getNbSommets()+"\n", cheminFichier, true);

        for (Sommet depart : this.sommets) {
            for (Sommet arrivee : this.sommets) {
                if (!depart.equals(arrivee)) {
                    String plusCourtChemin = this.plusCourtChemin(depart, arrivee, true);
                    if(plusCourtChemin != null) {
                        System.out.println(plusCourtChemin);
                        writeToFile(plusCourtChemin+"\n", cheminFichier, true);
                    }
                }
            }
        }
    }


    private void writeToFile(String txt, String Path, boolean append) {
        try {
            File file = new File(Path);
            FileWriter fileWriter = new FileWriter(file, append);
            fileWriter.write(txt);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String plusCourtChemin(Sommet depart, Sommet arrivee,boolean avecCout ) {
        int[] d = new int[this.getNbSommets()];
        int[] p = new int[this.getNbSommets()];
        boolean[] v = new boolean[this.getNbSommets()];
        for (int i = 0; i < this.getNbSommets(); i++) {
            d[i] = Integer.MAX_VALUE;
            p[i] = -1;
            v[i] = false;
        }
        d[this.getIndexSommet(depart)] = 0;

        int sommetCourant = this.getIndexSommet(depart);

        while (sommetCourant != this.getIndexSommet(arrivee)) {
            v[sommetCourant] = true;
            for (int i = 0; i < this.getSommet(sommetCourant).getVoisins().size(); i++) {
                int sommetVoisin = this.getIndexSommet(this.getSommet(sommetCourant).getVoisins().get(i));
                if (!v[sommetVoisin]) {
                    int cout = this.calculerCout(this.getSommet(sommetCourant), this.getSommet(sommetVoisin));
                    if (d[sommetVoisin] > d[sommetCourant] + cout) {
                        d[sommetVoisin] = d[sommetCourant] + cout;
                        p[sommetVoisin] = sommetCourant;
                    }
                }
            }
            int min = Integer.MAX_VALUE;
            int nextSommet = -1;
            for (int i = 0; i < this.getNbSommets(); i++) {
                if (!v[i] && d[i] < min) {
                    min = d[i];
                    nextSommet = i;
                }
            }

            if (nextSommet == -1) {
                return null;
            }

            sommetCourant = nextSommet;
        }

        if (d[this.getIndexSommet(arrivee)] == Integer.MAX_VALUE) {
            return null;
        }

        String chemin = depart.getNom() + "\t -> \t"+ arrivee.getNom()+ ((avecCout) ? " : "+d[this.getIndexSommet(arrivee)]:"");

        String detail = "";
        int sommet = this.getIndexSommet(arrivee);
        while (sommet != this.getIndexSommet(depart)) {
            detail = this.getSommet(sommet).getNom() +"->"+ detail;
            sommet = p[sommet];
        }

        return chemin+"\t\t  ("+depart.getNom()+" "+detail+" "+arrivee.getNom()+")";
    }

}
package TP5;

import java.util.ArrayList;

public class Arber {
    public Noeud racine;

    public Arber() {
        this.racine = null;
    }

    public void insert(Noeud noeud, int valeur) {
        if (this.racine == null) {
            this.racine = new Noeud(valeur);
        } else {
            if (valeur < noeud.valeur) {
                if (noeud.gauche != null) {
                    insert(noeud.gauche, valeur);
                } else {
                    noeud.gauche = new Noeud(valeur);
                }
            } else if (valeur > noeud.valeur) {
                if (noeud.droite != null) {
                    insert(noeud.droite, valeur);
                } else {
                    noeud.droite = new Noeud(valeur);
                }
            }
        }
    }

    public void afficher(Noeud noeud) {
        if (noeud != null) {
            afficher(noeud.gauche);
            System.out.println(noeud.valeur);
            afficher(noeud.droite);
        }
    }

    public void insert(int valeur) {
        insert(this.racine, valeur);
    }

    public int[] toArray() {
        File<Noeud> file = new File<Noeud>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        file.enfiler(this.racine);
        while (file.tete != null) {
            Noeud noeud = file.defiler();
            list.add(noeud.valeur);
            if (noeud.gauche != null) {
                file.enfiler(noeud.gauche);
            }
            if (noeud.droite != null) {
                file.enfiler(noeud.droite);
            }
        }

        //convert ArrayList to int[]
        int[] tab = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            tab[i] = list.get(i);
        }

        return tab;
    }

     public boolean rechercher(int val){
       return  __rechercher(racine, val);
    }

    boolean __rechercher(Noeud racine,int val){
        if(racine == null)
            return false;
        if(racine.valeur == val)
            return true;
        if(racine.valeur > val)
            return __rechercher(racine.gauche, val);
        return __rechercher(racine.droite, val);
    }


    public int min(){
        if(racine == null){
            System.out.println("arber vide");
            return 0;
        }
        int min = racine.valeur;
        for (Noeud e = racine; e != null; e = e.gauche){
            min = e.valeur;
        }
        return min;
    }

    public int max(){
        if(racine == null){
            System.out.println("arber vide");
            return 0;
        }
        int min = racine.valeur;
        for (Noeud e = racine; e != null; e = e.droite){
            min = e.valeur;
        }
        return min;
    }


    class Noeud {
        public int valeur;
        public Noeud gauche;
        public Noeud droite;

        public Noeud(int valeur) {
            this.valeur = valeur;
            this.gauche = null;
            this.droite = null;
        }
    }

    public void infixee(Noeud racine){
        if(racine != null){
            infixee(racine.gauche);
            System.out.println(racine.valeur);
            infixee(racine.droite);
        }
    }

    public void prefixee(Noeud racine){
        if(racine != null){
            System.out.println(racine.valeur);
            prefixee(racine.gauche);
            prefixee(racine.droite);
        }
    }

    public void inserer_unique(int value){
        insert(value);
    }

    protected void inserer(Noeud racine, int value){
        Noeud n = new Noeud(value);
        if(racine == null){
            racine = n;
        }else if(racine.valeur > value){
            if(racine.gauche != null)
                insert(racine.gauche, value);
            else
                racine.gauche = n;
        }else if(racine.valeur < value){
            if(racine.droite != null)
                insert(racine.droite, value);
            else
                racine.droite = n;
        }
    }

    protected void supprimer(Noeud racine, int value){
        if(racine == null)
            return;
        if(racine.valeur > value){
            supprimer(racine.gauche, value);
        }else if(racine.valeur < value){
            supprimer(racine.droite, value);
        }else{
            if(racine.gauche == null && racine.droite == null){
                racine = null;
            }else if(racine.gauche == null){
                racine = racine.droite;
            }else if(racine.droite == null){
                racine = racine.gauche;
            }else{
                Noeud n = racine.droite;
                while(n.gauche != null){
                    n = n.gauche;
                }
                racine.valeur = n.valeur;
                supprimer(racine.droite, n.valeur);
            }
        }
    }

    public void supprimer(int value){
        supprimer(racine, value);
    }
}
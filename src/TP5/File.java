package TP5;

public class File<T> {

    class Noeud {
        public T valeur;
        public Noeud Next;


        public Noeud(T valeur) {
            this.valeur = valeur;
            this.Next = null;
        }
    }

    public Noeud tete;

    public File() {
        this.tete = null;
    }

    public void enfiler(T valeur) {
        if (this.tete == null) {
            this.tete = new Noeud(valeur);
        } else {
            Noeud noeud = this.tete;
            while (noeud.Next != null) {
                noeud = noeud.Next;
            }
            noeud.Next = new Noeud(valeur);
        }
    }

    public T defiler() {
        if (this.tete == null) {
            return null;
        } else {
            T valeur = this.tete.valeur;
            this.tete = this.tete.Next;
            return valeur;
        }
    }

    public void afficher() {
        Noeud noeud = this.tete;
        while (noeud != null) {
            System.out.println(noeud.valeur);
            noeud = noeud.Next;
        }
    }


}

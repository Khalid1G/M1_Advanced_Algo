package TP3.ex3;
class Liste<T> {
    class Noeud {
        T valeur;
        Noeud suivant;

        public Noeud(T valeur) {
            this.valeur = valeur;
            this.suivant = null;
        }
    }

    private Noeud premier;

    public Liste() {
        this.premier = null;
    }

    public boolean estVide() {
        return premier == null;
    }

    public void ajouterAlaFin(T val) {
        Noeud nouveauNoeud = new Noeud(val);
        if (estVide()) {
            premier = nouveauNoeud;
        } else {
            Noeud dernier = premier;
            while (dernier.suivant != null) {
                dernier = dernier.suivant;
            }
            dernier.suivant = nouveauNoeud;
        }
    }

    public void ajouterAuDebut(T val) {
        Noeud nouveauNoeud = new Noeud(val);
        nouveauNoeud.suivant = premier;
        premier = nouveauNoeud;
    }

    public boolean contient(T val) {
        Noeud courant = premier;
        while (courant != null) {
            if (courant.valeur.equals(val)) {
                return true;
            }
            courant = courant.suivant;
        }
        return false;
    }

    public T getPremier() {
        if (premier != null) {
            return premier.valeur;
        } else {
            throw new RuntimeException("La liste est vide.");
        }
    }

    public T getSuivant(T val) {
        Noeud courant = premier;
        while (courant != null) {
            if (courant.valeur.equals(val) && courant.suivant != null) {
                return courant.suivant.valeur;
            }
            courant = courant.suivant;
        }
        throw new RuntimeException("La valeur n'est pas présente ou n'a pas de suivant.");
    }

    public T getValeur(int index) {
        Noeud courant = premier;
        for (int i = 0; i < index; i++) {
            if (courant == null) {
                throw new IndexOutOfBoundsException("Index hors limites.");
            }
            courant = courant.suivant;
        }
        if (courant != null) {
            return courant.valeur;
        } else {
            throw new IndexOutOfBoundsException("Index hors limites.");
        }
    }

    public void retirerFirstOccurrence(T val) {
        if (premier != null) {
            if (premier.valeur.equals(val)) {
                premier = premier.suivant;
                return;
            }
            Noeud courant = premier;
            while (courant.suivant != null && courant.suivant.valeur != val) {
                courant = courant.suivant;
            }
            if (courant.suivant != null) {
                courant.suivant = courant.suivant.suivant;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Noeud courant = premier;
        while (courant != null) {
            builder.append(courant.valeur);
            if (courant.suivant != null) {
                builder.append(", ");
            }
            courant = courant.suivant;
        }
        builder.append("]");
        return builder.toString();
    }
}
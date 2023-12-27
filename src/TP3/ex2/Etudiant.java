package TP3.ex2;

public class Etudiant {
    int numero;
    String nom;
    Etudiant next;
    Etudiant prev;

    public Etudiant(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }

    public Etudiant(int numero, String nom, Etudiant next, Etudiant prev) {
        this.numero = numero;
        this.nom = nom;
        this.next = next;
        this.prev = prev;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Etudiant getNext() {
        return next;
    }

    public void setNext(Etudiant next) {
        this.next = next;
    }

    public Etudiant getPrev() {
        return prev;
    }

    public void setPrev(Etudiant prev) {
        this.prev = prev;
    }


    public String toString() {
        return "[" + this.numero + " : " + this.nom+"]";

    }
}

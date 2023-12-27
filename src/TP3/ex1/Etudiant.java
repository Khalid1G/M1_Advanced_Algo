package TP3.ex1;

public class Etudiant {
    int numero;
    String nom;
    Etudiant next;

    public Etudiant(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }

    public Etudiant(int numero, String nom, Etudiant next) {
        this.numero = numero;
        this.nom = nom;
        this.next = next;
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

    public String toString() {
        return "ex1.Etudiant " + this.numero + " : " + this.nom;
    }
}

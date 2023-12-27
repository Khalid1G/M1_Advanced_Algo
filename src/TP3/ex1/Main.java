package TP3.ex1;

public class Main {
    public static void main(String[] args) {

        Classe c = new Classe();
        c.add(new Etudiant(1, "A"));
        c.add(new Etudiant(2, "B"));
        c.add(new Etudiant(3, "C"));
        c.add(new Etudiant(4, "D"));


        System.out.println("size is = " +c.getSize() );
        System.out.println("remove 2 = " + c.remove(2));

        for (Etudiant e = c.getFirst(); e != null; e = e.getNext()) {
            System.out.println(e);
        }

    }
}
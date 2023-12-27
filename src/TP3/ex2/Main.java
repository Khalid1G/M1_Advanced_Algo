package TP3.ex2;


public class Main {
    public static void main(String[] args) {

        Classe classA = new Classe();
        classA.add(new Etudiant(5, "khalid"));
        classA.add(new Etudiant(2, "yassine"));
        classA.add(new Etudiant(3, "aya"));
        classA.add(new Etudiant(3, "nada"));
        classA.add(new Etudiant(9, "ibrahim"));
        classA.add(new Etudiant(8, "Abderrahman"));

       classA.sort_insertion();

       classA.add_sorted(new Etudiant(6, "yousra"));
       classA.add_sorted(new Etudiant(4, "youssef"));
       classA.add_sorted(new Etudiant(7, "ilham"));
       classA.add_sorted(new Etudiant(1, "hafsa"));

        System.out.println("Classe A : ("+classA.getSize()+") : ↦ "+classA);

        Classe classB = new Classe();
        classB.add(new Etudiant(15, "khalid"));
        classB.add(new Etudiant(65, "nouhaila"));
        classB.add(new Etudiant(75, "arwa"));
        classB.add(new Etudiant(41, "sara"));
        classB.add(new Etudiant(84, "mohamed"));
        classB.add(new Etudiant(40, "ahmed"));
        classB.add(new Etudiant(43, "soukaina"));

        System.out.println("Classe B : ("+classB.getSize()+") : ↦ "+classB);;

        Classe classC = Classe.merge(classA, classB);
        System.out.println("Classe C : ("+classC.getSize()+") : ↦ "+classC);
    }
}


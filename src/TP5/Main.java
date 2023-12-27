package TP5;

public class Main {
    public static void main(String[] args) {

        //Q1
//        Arber arber = new Arber();
//
//        //Q2
//        int[] tab = {25, 60, 35, 10, 5, 20, 65, 45, 70,40, 50, 55, 30, 15};
//
//        for (int t:tab){
//            arber.insert(t);
//        }
//
//        int[] tab2 = arber.toArray();
//
//        for (int t:tab2){
//            System.out.println(t);
//        }
//
//        //Q3
//        System.out.println("affichage infixee");
//        arber.infixee(arber.racine);
//
//        System.out.println("affichage prefixee");
//        arber.prefixee(arber.racine);
//
////Exercice 2:
//
//        //Q1
//        Arber arber2 = new Arber();
//
//        for(int i = 0; i < 10; i++){
//            arber2.insert((int)(Math.random() * 100));
//        }
//
//        //Q2
//        System.out.println("rechercher 4");
//        System.out.println(arber2.rechercher(4));
//
//        System.out.println("rechercher 50: ");
//        System.out.println(arber2.rechercher(50));
//
//
//        //Q3 et Q4
//        System.out.printf(String.format("MAX= %d, MIN= %d", arber2.max(), arber2.min()));
//
//        //Exercice 3:

        Arber arber3 = new Arber();
        arber3.inserer_unique(1);
        arber3.inserer_unique(23);
        arber3.inserer_unique(90);
        arber3.inserer_unique(12);
        arber3.inserer_unique(74);

        System.out.println("--- affichage avant suppression ---");
        arber3.afficher(arber3.racine);

        arber3.supprimer(23);

        System.out.println("--- affichage apres suppression ---");
        arber3.afficher(arber3.racine);


    }
}
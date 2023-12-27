package TP1;

public class T_Faire {
    static int calculSomme(int n) {
        int somme = 0;
         while (n > 0) {
             int r = n%10;
             somme += r;
                n /= 10;
         }
            return somme;
    }

    static int calculSommeRecursive(int n) {
        if (n == 0)
            return 0;
        return n%10 + calculSommeRecursive(n/10);
    }

    public static void main(String[] args) {
        System.out.println(calculSomme(419));
        System.out.println(calculSommeRecursive(419));
    }
}

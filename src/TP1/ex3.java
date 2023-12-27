package TP1;

public class ex3 {
    /**
        ecrire l'indice de la valeur la petite grande dans un tableau
        T = [2, 1, 5]
        indice = 2
     * */


    static int __indicePetiteGrande(int[] T, int n, int indice) {
        if (n == 0)
            return indice;
        if (T[n] > T[indice])
            indice = n;
        return __indicePetiteGrande(T, n - 1, indice);
    }

    static int indicePetiteGrande(int[] T) {
        return __indicePetiteGrande(T, T.length - 1, 0);
    }

    static int CalculerNombreOccurence(int[] T, int n, int x) {
        if (n == 0)
            return 0;
        if (T[n] == x)
            return 1 + CalculerNombreOccurence(T, n - 1, x);
        return CalculerNombreOccurence(T, n - 1, x);
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 5};
        System.out.println(indicePetiteGrande(array));

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 10, 5, 2, 4, 5, 6, 5, 5, 5, 5, 5};
        System.out.print(CalculerNombreOccurence(array2, array2.length - 1, 5));
    }
}

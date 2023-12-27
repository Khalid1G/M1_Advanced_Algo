package TP1;

public class ex4 {

    static boolean __Appartient(int[] T, int n, int x) {
        if (n == 0)
            return T[n] == x;
        if (T[n] == x)
            return true;
        return __Appartient(T, n - 1, x);
    }

    static boolean Appartient(int[] T, int x) {
        return __Appartient(T, T.length - 1, x);
    }

    static boolean rechercheDichotomique(int[] T, int x, int i, int j) {
        if (i > j)
            return false;
        int m = (i + j) / 2;
        if (T[m] == x)
            return true;
        if (T[m] > x)
            return rechercheDichotomique(T, x, i, m - 1);
        return rechercheDichotomique(T, x, m + 1, j);
    }

    static boolean AppartientDichotomique(int[] T, int x) {
        return rechercheDichotomique(T, x, 0, T.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Appartient(array, 15));
        int[] arraynotSorted = {5, 4, 3, 2, 1};
        System.out.println(Appartient(arraynotSorted, 7));

        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println(AppartientDichotomique(array2, 5));
    }

}

package TP1;

public class ex5 {
    static boolean __estPalandrome(String s, int i, int j) {
        if (i >= j)
            return true;
        if (s.charAt(i) != s.charAt(j))
            return false;
        return __estPalandrome(s, i + 1, j - 1);
    }

    static boolean estPalandrome(String s) {
        return __estPalandrome(s, 0, s.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(estPalandrome("kayak"));
        System.out.println(estPalandrome("kayak2"));
    }
}

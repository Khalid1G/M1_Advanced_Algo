package TP1;

public class ex1 {

    public static void main(String[] args) {
        /**
         * N = 5; P = 1;
         * P = 5 * 1;
         * P = 5 * (5 * 2);
         * P = 5 * (5 * (5 * 3));
         * P = 5 * (5 * (5 * (5 * 4)));
         * P = 5 * (5 * (5 * (5 * (5 * 5))));
         * P = 120;
         * */



    }

    public  static  int factorielle(int n){
        if(n == 0) return 1;
        return n * factorielle(n-1);
    }
}

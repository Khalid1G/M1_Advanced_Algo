package TP1;

public class ex2 {
    static void showT(int[] T){
        __showT(T, T.length - 1);
    }
    static void __showT(int[] T,int n){
        if(n !=  0)
            __showT(T, n - 1);
        System.out.println(T[n]);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        showT(array);
    }
}

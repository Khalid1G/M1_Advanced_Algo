package TP4.TravailFaire;
import TP4.ex3.Pile;
public class Main {
    public static void main(String[] args) {
        System.out.println( (estBienParenthesee("(((4)*(i)/2)-7)")? "Bien":"Mal") + " parenthésée pour (((4)*(i)/2)-7)");
        System.out.println( (estBienParenthesee("((24)*(i)((")? "Bien":"Mal") + " parenthésée pour ((24)*(i)((");
        System.out.println( (estBienParenthesee("))((")? "Bien":"Mal") + " parenthésée pour ))((");
    }

    static boolean estBienParenthesee(String s) {
        Pile<Character> pile = new Pile<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(')
                pile.push(c);
            else if (c == ')') {
                try {
                    pile.pop();
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return pile.empty();
    }
}

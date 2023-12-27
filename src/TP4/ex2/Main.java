package TP4.ex2;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    private static double postFixe(ArrayList<Object> data) throws Exception {
        if(data.size() < 3)
            throw new Exception("le nombre minimal des expressions est 3.");
        Stack<Double> pile = new Stack<>();
        try {
            for (Object obj : data){
                if(obj.equals('+')){
                    double res = pile.pop() +  pile.pop();
                    pile.push(res);
                }else if(obj.equals('-')){
                    double a = pile.pop();
                    double b = pile.pop();
                    double res = b - a;
                    pile.push(res);
                }else if (obj.equals('*')  || obj.toString().equalsIgnoreCase("x")) {
                    double res = pile.pop() *  pile.pop();
                    pile.push(res);
                }else  if(obj.equals('/')){
                    double a = pile.pop();
                    double b = pile.pop();
                    double res = b / a;
                    pile.push(res);
                }
                else {
                    pile.push(Double.valueOf(obj.toString()));
                }
            }
        }catch (Exception e){
            throw new Exception("Calcul invalide: "+e.getMessage());
        }
        return pile.peek();
    }

    public static void main(String[] args){
        ArrayList<Object> expression = new ArrayList<>();
        expression.add(2);
        expression.add(6);
        expression.add('+');
        expression.add(4);
        expression.add('x');
        expression.add(1);
        expression.add(3);
        expression.add('-');
        expression.add('/');


        try {
            double result = postFixe(expression);
            StringBuilder message = new StringBuilder("La pile associée à l’expression postfixée ");

            for (Object obj:expression) {
                message.append(obj);
                message.append(" ");
            }

            message.append("renverra la valeur décimale : ");
            message.append(result);

            System.out.println(message);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package TP4.ex1;


import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{

        //Exercice 1:
//        M1:
//        Stack<String> sac = new Stack<>();

//        M2:
        Sac<String> sac = new Sac();
//      sac.pop();

        //q1:
        System.out.println("The stack is empty: "+sac.empty());
        //q2:
        sac.push("Java");
        sac.push("is");
        sac.push("fun");

        //q3:
        System.out.println("Pop the stack : "+sac.pop());

        //q4:
        System.out.println("Show the top element: "+sac.peek());

        //q5:
        sac.clear();

        System.out.println("Stack size: "+sac.empty());
    }
}
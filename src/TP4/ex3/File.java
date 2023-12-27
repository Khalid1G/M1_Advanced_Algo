package TP4.ex3;

import java.util.LinkedList;
import java.util.Queue;

public class File <T> {

    private int size ;

    public File(int size) {
        this.size = size;
    }

    private int _size;

    boolean estPleine(){
        return size == _size;
    }

    private class Noeud{
        T value;
        Noeud next;

        public Noeud(T value) {
            this.value = value;
        }

        public Noeud() {
        }

        public Noeud(T value, Noeud next) {
            this.value = value;
            this.next = next;
        }
    }

    private Noeud first;

   boolean vide(){
       return first ==  null;
   }
   void enfiler(T val) throws Exception {

       if(estPleine())
           throw new Exception("File est pleine");

       Noeud newN =  new Noeud(val);
       if(first == null)
           first =newN;
       else
       {
           Noeud current = first;
           while (current.next != null)
               current = current.next;

           current.next = newN;
       }

   }

   T defiler() throws Exception{
       if(vide())
           throw new Exception("file est vide !");

       T v = first.value;
       first = first.next;
       return v;
   }

   T peek(){
       return first.value;
   }

}
